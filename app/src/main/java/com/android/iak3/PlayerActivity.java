package com.android.iak3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PlayerActivity extends AppCompatActivity {
    EditText etPlayer1, etPlayer2;
    Button btnSimpan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        etPlayer1 = (EditText) findViewById(R.id.et_first_player);
        etPlayer2 = (EditText) findViewById(R.id.et_second_player);

        btnSimpan = (Button) findViewById(R.id.btn_simpan);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namapemain1 = etPlayer1.getText().toString();
                String namapemain2 = etPlayer2.getText().toString();

                Intent intent = new Intent(PlayerActivity.this, CounterActivity.class);
                intent.putExtra("pemain1", namapemain1);
                intent.putExtra("pemain2", namapemain2);
                startActivity(intent);
                finish();
            }
        });
    }
}