package com.example.stockinventorymanagement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Transactions extends AppCompatActivity {
  //  RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transactions);

/**
        recyclerView = findViewById(R.id.recyclerView2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        DatabaseHelperpin databaseHelperpin = new DatabaseHelperpin(this);
        List<PinModelClass> pinModelClasses = databaseHelperpin.getPinList();

        if (pinModelClasses.size() > 0){
            PinAdapterClass pinadapterclass = new PinAdapterClass(pinModelClasses,Transactions.this);
            recyclerView.setAdapter(pinadapterclass);
        }else {
            Toast.makeText(this, "There is no employee in the database", Toast.LENGTH_SHORT).show();
        }



*/


    }




}