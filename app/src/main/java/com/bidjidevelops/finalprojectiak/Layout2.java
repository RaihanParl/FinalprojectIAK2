package com.bidjidevelops.finalprojectiak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class Layout2 extends AppCompatActivity {
int nilai;
    CheckBox cBmanusia,cBhewan,cBchopper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout2);
        cBchopper = (CheckBox)findViewById(R.id.checkboxChopper);
        cBmanusia = (CheckBox)findViewById(R.id.checkboxManusia);
        cBhewan = (CheckBox)findViewById(R.id.checkboxHewan);
        nilai = getIntent().getIntExtra("nilai",0);

    }
    public int checkJawaban(){
        if (cBchopper.isChecked()){
            nilai = nilai + 10;
        }if (cBhewan.isChecked()){
            nilai = nilai + 10;
        }if (cBmanusia.isChecked()){
            nilai = nilai + 0;
        }
        return nilai;
    }
    public void jawab2(View v){
        checkJawaban();
        Intent a = new Intent(getApplicationContext(), Layout3.class);
        a.putExtra("nilai",nilai);
        startActivity(a);
    }
}
