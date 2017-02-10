package com.example.abhinav.technieks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread splashThread = new Thread()
        {
            @Override
            public void run()
            {
                try {
                    int waited = 0;
                    while (waited < 1533)
                    {
                        sleep(100);
                        waited += 100;
                    }
                } catch (InterruptedException e)
                {
                    // do nothing
                } finally
                {
                    Intent i = new Intent(MainActivity.this,splash_logo.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        splashThread.start();
    }
}
