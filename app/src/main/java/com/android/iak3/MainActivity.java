package com.android.iak3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView namaA, namaB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namaA = (TextView) findViewById(R.id.tv_pemain1);
        namaB = (TextView) findViewById(R.id.tv_pemain2);

        Intent data = getIntent();
        String pemainA = data.getStringExtra("pemain1");
        String pemainB = data.getStringExtra("pemain2");

        namaA.setText(pemainA);
        namaB.setText(pemainB);
    }
}
