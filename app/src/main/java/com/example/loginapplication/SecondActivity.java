package com.example.loginapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = SecondActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.i(TAG, "details in " + TAG);
        Log.d(TAG, "details in " + TAG);
        Log.e(TAG, "details in " + TAG);
        Log.v(TAG, "details in " + TAG);
        Log.w(TAG, "details in " + TAG);

        Button bt1  = (Button) findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Calculator.class);
                startActivity(startIntent);
            }
        });

        Button bt3  = (Button) findViewById(R.id.bt3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Randomizer.class);
                startActivity(startIntent);
            }
        });

        Button bt2  = (Button) findViewById(R.id.bt2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "http://www.google.com";
                Uri webadd = Uri.parse(google);

                Intent gsearch = new Intent(Intent.ACTION_VIEW, webadd);
                if (gsearch.resolveActivity(getPackageManager()) != null) {
                    startActivity(gsearch);
                }
            }
        });
    }
}
