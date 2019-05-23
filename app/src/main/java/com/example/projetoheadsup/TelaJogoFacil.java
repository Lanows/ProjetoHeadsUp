package com.example.projetoheadsup;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

public class TelaJogoFacil extends AppCompatActivity implements SensorEventListener {

    private static final int UPDATE_THRESHOULD = 500;
    private SensorManager mSensorManager;
    private Sensor mAccelerometer;
    int count = 0;
    private TextView texto;
    private long mLastUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_jogo_facil);
        texto = (TextView) findViewById(R.id.sensorText);

        mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        final TextView cronometro = (TextView) findViewById(R.id.cronometro);
        CountDownTimer tempo = new CountDownTimer(61000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
//                int minutos = (int) (millisUntilFinished/1000/60);
                int segundos = (int) (millisUntilFinished/1000)%60;
                String ordem = String.format(Locale.getDefault(), "%02d",  segundos);
                cronometro.setText(ordem);
            }

            @Override
            public void onFinish() {

            }
        }.start();
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
