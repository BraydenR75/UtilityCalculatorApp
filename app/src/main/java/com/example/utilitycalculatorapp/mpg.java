package com.example.utilitycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class mpg extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mileage_calculator);

        Button backHome = (Button) findViewById(R.id.btn_backhome);
        backHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(mpg.this, MainActivity.class));
            }
        });

        Button calmpg = (Button) findViewById(R.id.btn_calmpg);
        EditText gasTank = (EditText) findViewById(R.id.txt_edit_tank);
        EditText mpgDis = (EditText) findViewById(R.id.txt_edit_travled);
        TextView MPGTotal = (TextView) findViewById(R.id.txt_mpg_total);

        calmpg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String str_gasTank = gasTank.getText().toString();
                String str_mpgDis = mpgDis.getText().toString();

                Float float_gasTank = Float.valueOf(str_gasTank);
                Float float_mpgDis = Float.valueOf(str_mpgDis);

                Float mpg = float_mpgDis / float_gasTank  ;

                MPGTotal.setText(Float.toString(mpg));
            }
        });



    }
}
