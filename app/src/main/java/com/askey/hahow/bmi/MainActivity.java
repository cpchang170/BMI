package com.askey.hahow.bmi;

import android.content.DialogInterface;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edw;
    private EditText edh;
    private TextView result;
    private Button help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FindViews();
    }

    private void FindViews() {
        edw = findViewById(R.id.ed_weight);
        edh = findViewById(R.id.ed_height);
        result = findViewById(R.id.result);
        help = findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this).setTitle(R.string.help).setMessage(R.string.bmi_info).setPositiveButton(R.string.ok, null).show();
            }
        });
    }

    public void bmi(View view){
        String s_edw = edw.getText().toString();
        //Log.d("MainActivity","BMI" + s_edw);
        String s_edh = edh.getText().toString();
        //Log.d("MainActivity","BMI" + s_edh);
        float w = Float.parseFloat(s_edw);
        float h = Float.parseFloat(s_edh);
        float bmi = w / (h * h);
        Log.d("MainActivity", "BMI" + bmi);
        Toast.makeText(this,getString(R.string.your_BMI_is) + bmi,Toast.LENGTH_LONG).show();
        result.setText(getString(R.string.your_BMI_is) + bmi);
        new AlertDialog.Builder(this).setTitle(R.string.bmi).setMessage(getString(R.string.your_BMI_is)+bmi).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                edw.setText("");
                edh.setText("");
            }
        }).show();
    }
}
