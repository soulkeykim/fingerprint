package com.soulkey.fingerprint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.soulkey.fingerprint.connect.Fingerprint;

public class SampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fingerprint.showRecognitionDialog();
            }
        });
    }
}
