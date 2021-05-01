package com.example.stockinventorymanagement;


import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class home extends AppCompatActivity  {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    Button calladdp,callpin,callpout;




    //add product
    EditText editText_pname,editText_brate;
    Button button_add,button_view;
    //

//view trans
Button view_trans,save_product;
//


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //add product
        editText_pname = findViewById(R.id.edittext_pname);
        editText_brate = findViewById(R.id.edittext_brate);
        button_add = findViewById(R.id.button_addproduct);
        button_view = findViewById(R.id.Button_viewproduct);

/**
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringPName = editText_pname.getText().toString();
                String stringBRate = editText_brate.getText().toString();

                if (stringPName.length() <=0 || stringBRate.length() <=0){
                    Toast.makeText(home.this, "Enter All Data", Toast.LENGTH_SHORT).show();
                }else {
                    DatabaseHelper databaseHelperClass = new DatabaseHelper(home.this);
                    EmployeeModelClass employeeModelClass = new EmployeeModelClass(stringPName,stringBRate);
                    databaseHelperClass.addProduct(employeeModelClass);
                    Toast.makeText(home.this, "Add Product Successfully", Toast.LENGTH_SHORT).show();
                    finish();
                    startActivity(getIntent());
                }
            }
        });
 */
//to call next activity for read data

        button_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this,Productlist.class);
                startActivity(intent);
            }
        });
        //

//view trans
        view_trans=findViewById(R.id.view_transproduct);
        save_product=findViewById(R.id.save_productin);



        view_trans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this,Transactions.class);
                startActivity(intent);
            }
        });


//pin pout
        callpin = findViewById(R.id.pin);
        callpout = findViewById(R.id.pout);


        callpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, productin.class);
                startActivity(intent);
            }
        });


        callpout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(home.this, productout.class);
                startActivity(intent2);
            }
        });
        calladdp = findViewById(R.id.button_addproduct);
        calladdp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, addproduct.class);
                startActivity(intent);
            }
        });

/**


        //hooks
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar2);

        //calling product add page
        calladdp = findViewById(R.id.add_product);
        callpin = findViewById(R.id.pin);
        callpout = findViewById(R.id.pout);
        calladdp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, addproduct.class);
                startActivity(intent);
            }
        });


        callpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, productin.class);
                startActivity(intent);
            }
        });


        callpout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, productout.class);
                startActivity(intent);
            }
        });


        setSupportActionBar();


        //tell compiler to use 'tool' as a action bar

        //navigate drawer menu
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
      drawerLayout.addDrawerListener(toggle);
      toggle.syncState();

     //to make menu clicakable
navigationView.setNavigationItemSelectedListener(this);


//on lauching we want to open the home screen not menu
        navigationView.setCheckedItem(R.id.nav_home);




    }

    private void setSupportActionBar() {
        return ;
    }

    //to avoid closing app on back
    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{

            super.onBackPressed();
        }
        super.onBackPressed();
    }


    //methode for navigate through menu items
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuitem)
    {
        switch (menuitem.getItemId()){
            case R.id.nav_home:
                break;
            case R.id.nav_product:
                Intent intent = new Intent(home.this,Productlist.class);
                startActivity(intent);
                break;
       /**     case R.id.nav_parties:
                Intent intent2 = new Intent(home.this,Allparties.class);
                startActivity(intent2);
                break;

            case R.id.nav_transactions:
                Intent intent3 = new Intent(home.this,Transactions.class);
                startActivity(intent3);
                break;
            case R.id.nav_lowStock:
                Intent intent4 = new Intent(home.this,lowstock.class);
                startActivity(intent4);
                break;
            case R.id.nav_settings:
                Intent intent5 = new Intent(home.this,settings.class);
                startActivity(intent5);
                break;

        }
        drawerLayout.closeDrawer(GravityCompat.START);

        return true;

        */


    }
}