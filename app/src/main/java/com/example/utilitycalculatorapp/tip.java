package com.example.utilitycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class tip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tip_calculator);

        Button backHome = (Button) findViewById(R.id.btn_backhome);
        backHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(tip.this, MainActivity.class));
            }
        });
        Button calTip = (Button) findViewById(R.id.btn_caltip);
        TextView tip_Total = (TextView) findViewById(R.id.txt_tip_total);
        EditText Bill = (EditText) findViewById(R.id.txt_edit_bill_tip);
        RadioGroup radio_tip_group = (RadioGroup) findViewById(R.id.radio_tip);
        RadioButton tipTen = (RadioButton) findViewById(R.id.ten);
        RadioButton tipfifteen = (RadioButton) findViewById(R.id.fifteen);
        RadioButton tip20 = (RadioButton) findViewById(R.id.twenty);

        calTip.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(radio_tip_group.getCheckedRadioButtonId()==-1)
                {
                    Toast.makeText(getApplicationContext(), "Please Select Your Desired Tip Amount", Toast.LENGTH_SHORT).show();
                }
                else {
                    String strBill = Bill.getText().toString();
                    double intBill = Double.parseDouble(strBill);
                    double tip = 1.0;
                    if(tipTen.isChecked()){
                        tip = .1;
                    }
                    else if (tipfifteen.isChecked()) {
                        tip = .15;
                    }
                    else {
                        tip = .2;
                    }
                    double final_Bill = intBill * tip;

                    tip_Total.setText(Double.toString(final_Bill));
                }
            }
        });




    }}
