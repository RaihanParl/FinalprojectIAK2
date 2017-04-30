package com.bidjidevelops.finalprojectiak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Layout3 extends AppCompatActivity {
int nilai;
    TextView jawaban3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout3);
        nilai = getIntent().getIntExtra("nilai",0);
        jawaban3 = (TextView)findViewById(R.id.jawaban3);
    }
    public void ambiljawaban() {
//       kita cek di apakah jawabannya betul atau tidak
        if (jawaban3.getText().toString().equals("Orang ganteng") || jawaban3.getText().toString().equals("shp") || jawaban3.getText().toString().equals("bajak laut")) {
            nilai = nilai + 70;
            Toast.makeText(this,""+ nilai, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "salah vro", Toast.LENGTH_SHORT).show();
        }
    }
    public void jawab3(View v){
        ambiljawaban();
        Intent a = new Intent(getApplicationContext(), ScoreActivity.class);
        a.putExtra("nilai",nilai);
        startActivity(a);
    }
}
