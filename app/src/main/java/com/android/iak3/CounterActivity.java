package com.android.iak3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {
    TextView namaA, namaB;
    TextView skorA, skorB;
    int scoreTeamA, scoreTeamB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        namaA = (TextView) findViewById(R.id.tv_pemain1);
        namaB = (TextView) findViewById(R.id.tv_pemain2);

        skorA = (TextView) findViewById(R.id.tv_skor1);
        skorB = (TextView) findViewById(R.id.tv_skor2);

        Intent data = getIntent();
        String pemainA = data.getStringExtra("pemain1");
        String pemainB = data.getStringExtra("pemain2");

        namaA.setText(pemainA);
        namaB.setText(pemainB);

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.tv_skor1);
        scoreView.setText(String.valueOf(score));
    }

    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.tv_skor2);
        scoreView.setText(String.valueOf(score));
    }
}