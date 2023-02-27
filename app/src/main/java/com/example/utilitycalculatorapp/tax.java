package com.example.utilitycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


    public class tax extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.tax_calculator);

            Button backHome = (Button) findViewById(R.id.btn_backhome);
            backHome.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    startActivity(new Intent(tax.this, MainActivity.class));
                }
            });
            Button calcTax = (Button) findViewById(R.id.btn_taxCalc);

            EditText taxBill = (EditText) findViewById(R.id.edittxt_taxbill);
            EditText taxRate = (EditText) findViewById(R.id.edittxt_taxrate);

            TextView taxTotal = (TextView) findViewById(R.id.txt_calcText);


            calcTax.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String strtaxBill = taxBill.getText().toString();
                    String strtaxRate = taxRate.getText().toString();

                    Float float_tax_rate = Float.valueOf(strtaxRate);
                    Float float_tax_bill = Float.valueOf(strtaxBill);

                    Float billAfterTax = ((float_tax_rate / 100) * float_tax_bill) + float_tax_bill;

                    taxTotal.setText(Float.toString(billAfterTax));
                }
            });
        }

    }
