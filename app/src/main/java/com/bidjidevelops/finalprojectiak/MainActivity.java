package com.bidjidevelops.finalprojectiak;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
TextView txtnilai;
    RadioGroup radioGroup1;
    RadioButton rdJawaban1,rdJawaban2,rdJawaban3;
    Button btnjawab1;
    int nilai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnjawab1 = (Button)findViewById(R.id.input);
        txtnilai = (TextView)findViewById(R.id.txtnilai);
        radioGroup1 = (RadioGroup)findViewById(R.id.radiogrup1);
        rdJawaban1 = (RadioButton)findViewById(R.id.rdjawaban1);
        rdJawaban2 = (RadioButton)findViewById(R.id.rdjawaban12);
        rdJawaban3 = (RadioButton)findViewById(R.id.rdjawaban13);
        radioGroup1.setOnCheckedChangeListener(this);
        btnjawab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, ""+nilai, Toast.LENGTH_SHORT).show();
                Intent a = new Intent(getApplicationContext(),Layout2.class);
                a.putExtra("nilai",nilai);
                startActivity(a);
            }
        });
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (i == R.id.rdjawaban1){
            nilai = 0;
            txtnilai.setText(""+nilai);
        }if (i==R.id.rdjawaban12){
            nilai =10;
            txtnilai.setText(""+nilai);
        }if (i == R.id.rdjawaban13){
            nilai = 0;
            txtnilai.setText(""+nilai);
        }

    }
}
