package com.example.stockinventorymanagement;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Calendar;

public class productin extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    private TextView datetext;

//
 Button view_trans,save_product;
//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productin);

//
view_trans=findViewById(R.id.view_transproduct);
save_product=findViewById(R.id.save_product);



        view_trans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(productin.this,Transactions.class);
                startActivity(intent);
            }
        });






//




        datetext = findViewById(R.id.date_text);
        findViewById(R.id.show_date).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();


        }
    });






    }

  private  void showDatePickerDialog(){


        DatePickerDialog datePickerDialog=new DatePickerDialog(
                this,
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH)

        );

datePickerDialog.show();
    }


    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
     String date= dayOfMonth + "/" + month  + "/" + year;
     datetext.setText(date);
    }
}