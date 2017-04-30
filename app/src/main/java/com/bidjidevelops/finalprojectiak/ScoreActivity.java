package com.bidjidevelops.finalprojectiak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {
    int nilai;
    TextView txtScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        nilai = getIntent().getIntExtra("nilai",0);
        txtScore = (TextView)findViewById(R.id.txtScore);
        txtScore.setText(""+nilai);

    }

}
