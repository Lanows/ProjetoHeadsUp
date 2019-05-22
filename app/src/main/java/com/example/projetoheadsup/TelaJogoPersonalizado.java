package com.example.projetoheadsup;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TelaJogoPersonalizado extends AppCompatActivity implements SensorEventListener {

    private static final int UPDATE_THRESHOULD = 500;
    private SensorManager mSensorManager;
    private Sensor mAccelerometer;
    int count = 0;
    private TextView texto;
    private long mLastUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_jogo_personalizado);
        texto = (TextView) findViewById(R.id.sensorText);

        mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

    }

    @Override
    protected void onResume(){
        super.onResume();
        mSensorManager.registerListener(this, mAccelerometer, SensorManager.SENSOR_DELAY_FASTEST);
        mLastUpdate = System.currentTimeMillis();
    }

    @Override
    protected void onPause(){
        mSensorManager.unregisterListener(this);
        super.onPause();
    }

    @Override
    public void onSensorChanged(SensorEvent event){
        if(event.sensor.getType() == Sensor.TYPE_ACCELEROMETER){
            long actualTime = System.currentTimeMillis();
            if(actualTime - mLastUpdate > UPDATE_THRESHOULD){
                mLastUpdate = actualTime;

                int z = (int) event.values[2];


                if(z >= 4){
                    texto.setText("Texto acima");
                    count++;
                } else if (z <= -4) {
                    texto.setText("Texto pra baixo");
                } else {
                    texto.setText("To no meio\nViradas para cima " + count);
                }
            }
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy){

    }
}
