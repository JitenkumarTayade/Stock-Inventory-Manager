package com.example.stockinventorymanagement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class Login extends AppCompatActivity {

   Button callSignup,callhome;
   // ImageView image;
   // TextView logoText,sloganText;
    TextInputLayout phoneNo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        callhome = findViewById(R.id.home_screen);
        callhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, home.class);
                startActivity(intent);
            }
        });

     /**   phoneNo=findViewById(R.id.phoneNo);       //hook
      callSignup = findViewById(R.id.signup_screen);
       callSignup.setOnClickListener(new View.OnClickListener(){
        //    @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Signup.class);
                startActivity(intent);
            }
     */









    }

/**
    public void callVerifyOtpScreen(View view) {

        String _getUserEnteredPhoneNo = phoneNo.getEditText().getText().toString().trim(); //get phone no
        String _phoneNo=_getUserEnteredPhoneNo;


       startActivity( new Intent (getApplicationContext(),Signup.class));
       finish();


       // intent.putExtra("phoneNo",_phoneNo);


    }  */
}





