package com.polyrafiamovil.polyrafia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.polyrafiamovil.polyrafia.login.views.LoginActivity;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                /*SharedPrefsManager.initialize(SplashActivity.this);
                if (SharedPrefsManager.getInstance().getBoolean(IS_LOGGED)) {
                    intent = new Intent(SplashActivity.this, MainActivity.class);
                } else {
                    intent = new Intent(SplashActivity.this, LoginActivity.class);
                }*/

                startActivity(intent);
                SplashActivity.this.finish();
            }
        };

        Timer timer = new Timer();
        timer.schedule(timerTask, 3000);
    }
}
