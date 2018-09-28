package com.askey.hahow.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bmi(View view){
        EditText edw = findViewById(R.id.ed_weight);
        EditText edh = findViewById(R.id.ed_height);
        String s_edw = edw.toString();
        //Log.d("MainActivity","BMI" + s_edw);
        String s_edh = edh.toString();
        //Log.d("MainActivity","BMI" + s_edh);
        float w = Float.parseFloat(s_edw);
        float h = Float.parseFloat(s_edh);
        //float bmi = w / (h * h);
        Log.d("MainActivity", "BMI");
    }
}
