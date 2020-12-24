package com.example.stockinventorymanagement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Productlist extends AppCompatActivity {
   TextView tv,tv2,tv3;
   String st,st2,st3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productlist);

        tv = findViewById(R.id.showdata);
        tv.setText(getIntent().getStringExtra("value"));


        tv2=findViewById(R.id.showdata2);
        tv2.setText(getIntent().getStringExtra("value2"));

        tv3=findViewById(R.id.showdata3);
        tv3.setText(getIntent().getStringExtra("value3"));

    }


}