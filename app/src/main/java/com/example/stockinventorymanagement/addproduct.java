package com.example.stockinventorymanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class addproduct extends AppCompatActivity {
    EditText editText_pname,editText_brate;
    Button button_add,button_view;
   //
   // DatabaseHelper myDB;
//


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addproduct);




        editText_pname = findViewById(R.id.edittext_pname);
        editText_brate = findViewById(R.id.edittext_brate);
        button_add = findViewById(R.id.button_addproduct);
        button_view = findViewById(R.id.Button_viewproduct);


        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringPName = editText_pname.getText().toString();
                String stringBRate = editText_brate.getText().toString();

                if (stringPName.length() <=0 || stringBRate.length() <=0){
                    Toast.makeText(addproduct.this, "Enter All Data", Toast.LENGTH_SHORT).show();
                }else {
                    DatabaseHelper databaseHelperClass = new DatabaseHelper(addproduct.this);
                    EmployeeModelClass employeeModelClass = new EmployeeModelClass(stringPName,stringBRate);
                    databaseHelperClass.addProduct(employeeModelClass);
                    Toast.makeText(addproduct.this, "Add Product Successfully", Toast.LENGTH_SHORT).show();
                    finish();
                    startActivity(getIntent());
                }
            }
        });

//to call next activity for read data

        button_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(addproduct.this,Productlist.class);
                startActivity(intent);
            }
        });










    //    myDB = new DatabaseHelper(this);





    }

}