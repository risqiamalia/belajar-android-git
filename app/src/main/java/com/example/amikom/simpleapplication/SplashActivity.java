package com.example.amikom.simpleapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
    PreferencesHelper instance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        instance = PreferencesHelper.getIntance(getApplicationContext());
        int splashInterval = 10;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()

            }
        })
            if (!instance.isLogin()) {
                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
            } else {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
            }
        }
    }
}
