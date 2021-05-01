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

import com.example.stockinventorymanagement.DatabaseHelperpin;
import com.example.stockinventorymanagement.PinModelClass;
import com.example.stockinventorymanagement.R;
import com.example.stockinventorymanagement.Transactions;

import java.util.ArrayList;
import java.util.Calendar;

public class productin extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    private TextView datetext;


 Button view_trans,save_product;
//
EditText editText_date,editText_pname,editText_cs,edittext_q,edittext_transtype;
//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productin);
        editText_date = findViewById(R.id.edittext_date);
        editText_pname = findViewById(R.id.edittext_pname);
        edittext_transtype=findViewById(R.id.edittext_transtypeinput);
        editText_cs=findViewById(R.id.edittext_csinput);
        edittext_q=findViewById(R.id.edittext_qinput);

        //



        //

        view_trans=findViewById(R.id.view_transproduct);
        save_product=findViewById(R.id.save_productin);





        save_product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringDate = editText_date.getText().toString();
                String stringPname = editText_pname.getText().toString();
                String stringTranstype = edittext_transtype.getText().toString();
                String stringCs = editText_cs.getText().toString();
                String stringQ = edittext_q.getText().toString();

                if (stringDate.length() <=0  || stringPname.length() <=0 || stringTranstype.length() <=0 || stringCs.length() <=0 || stringQ.length() <=0){
                    Toast.makeText(productin.this, "Please Enter All Data", Toast.LENGTH_SHORT).show();
                }else {
                    DatabaseHelperpin databaseHelperpin = new DatabaseHelperpin(productin.this);
                    PinModelClass pinModelClass = new PinModelClass(stringDate,stringPname,stringTranstype,stringCs, stringQ );
                    databaseHelperpin.addPin(pinModelClass);
                    Toast.makeText(productin.this, "Product in Successfully", Toast.LENGTH_SHORT).show();
                  finish();
                    startActivity(getIntent());
                }
            }
        });



//

//

        view_trans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(productin.this, Transactions.class);
                startActivity(intent);
            }
        });











        datetext = findViewById(R.id.edittext_date);
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