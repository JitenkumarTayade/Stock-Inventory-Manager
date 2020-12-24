package com.example.stockinventorymanagement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.chaos.view.PinView;
import com.google.android.gms.dynamic.IFragmentWrapper;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
 import com.google.android.gms.tasks.TaskExecutors;
 import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.FirebaseException;
import com.google.firebase.FirebaseTooManyRequestsException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.concurrent.TimeUnit;

public class Signup extends AppCompatActivity {

   Button callrgnButton;
    //creating firebase variables
   // FirebaseDatabase rootNode;
   // DatabaseReference reference; //reference will be the subNode of our root node
    // PinView pinFromUser;
     //String codeBySystem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);




  /**      callrgnButton= findViewById(R.id.home_screen);
        callrgnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Signup.this, home.class);
                startActivity(intent);
            }
            });
*/
         // hooks
        // pinFromUser=findViewById(R.id.pin_view);
       // String _phoneNo = getIntent().getStringExtra("phoneNo");

        // callrgnButton=callrgnButton.setOnClickListener();


            }



}


