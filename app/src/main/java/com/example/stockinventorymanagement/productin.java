package com.example.stockinventorymanagement;

import android.app.DatePickerDialog;
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

   /**
    Button save;
    ArrayList<String> addArray = new ArrayList<String>();
    EditText txt;
    ListView show;
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productin);

        datetext = findViewById(R.id.date_text);
        findViewById(R.id.show_date).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();

    /**
    txt=(EditText)findViewById(R.id.pinput);
    show=(ListView)findViewById(R.id.list_view);
    save=(Button)findViewById(R.id.save_product);
    save.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String getInput=txt.getText().toString();

            if (addArray.contains(getInput)){
                Toast.makeText(productin.this, "Item already added", Toast.LENGTH_SHORT).show();

            }
            else if (getInput == null || getInput.trim().equals("")){


                Toast.makeText(productin.this, "Input field Empty", Toast.LENGTH_SHORT).show();
            }
            else
            {
                addArray.add(getInput);
                ArrayAdapter<String> adapter= new ArrayAdapter<String>(productin.this, android.R.layout.simple_list_item_1,addArray);
                show.setAdapter(adapter);
                ((EditText)findViewById(R.id.pinput)).setText(" ");


            }

*/

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