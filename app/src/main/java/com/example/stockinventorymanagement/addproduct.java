package com.example.stockinventorymanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    Button btn;
    EditText et,et2,et3;
    String st,st2,st3;
 /**   ArrayList<String>addArray = new ArrayList<String>();
    EditText txt;
    ListView show; */
  //  EditText et1,et2,et3;
  // String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addproduct);

        btn = (Button) findViewById(R.id.save_product);
        et = (EditText) findViewById(R.id.pname);
        et2 = (EditText) findViewById(R.id.brate);
        et3 = (EditText) findViewById(R.id.category);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                st = et.getText().toString();
                st2=et2.getText().toString();
                st3=et3.getText().toString();
                Intent intent = new Intent(addproduct.this, Productlist.class);
                intent.putExtra("value", st);
                intent.putExtra("value2",st2);
                intent.putExtra("value3",st3);
                startActivity(intent);
                // finish();
            }
        });
        /** btn.setOnClickListener(new View.OnClickListener() {
        @Override public void onClick(View v) {
        st2=et2.getText().toString();
        Intent intent = new Intent(addproduct.this,Productlist.class);
        intent.putExtra("value",st);
        startActivity(intent);
        // finish();
        }
        });
         btn.setOnClickListener(new View.OnClickListener() {
        @Override public void onClick(View v) {
        st3=et3.getText().toString();
        Intent intent = new Intent(addproduct.this,Productlist.class);
        intent.putExtra("value",st);
        startActivity(intent);
        // finish();
        }
        });
         */
    }

}