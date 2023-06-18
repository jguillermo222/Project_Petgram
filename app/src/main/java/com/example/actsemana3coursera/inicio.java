package com.example.actsemana3coursera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.window.SplashScreen;

import java.util.Timer;
import java.util.TimerTask;

public class inicio extends AppCompatActivity {

    private static int TIME_OUT = 4000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);



        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(inicio.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(tarea, 5000);










    }

}





