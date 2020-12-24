package com.example.stockinventorymanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN =5000;     //static variable for opening new activity
    Animation topanim,bottomanim;              //variables for animation
     ImageView image;                          //creating variable for views
     TextView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);   /** for to hide status bar */
        setContentView(R.layout.activity_main);


        //calling animation
        topanim= AnimationUtils.loadAnimation(this,R.anim.top_anim);
        bottomanim= AnimationUtils.loadAnimation(this,R.anim.bottom_anim);


        //hooks
        image=findViewById(R.id.imageView);
        logo=findViewById(R.id.textView);


        //to assign this animation to the views


        image.setAnimation(topanim);
        logo.setAnimation(bottomanim);


        //handles delay process
        new Handler().postDelayed(() -> {

                Intent intent=new Intent(MainActivity.this,Login.class);      //for calling next activity(screen)


                //we used pairs as we wanted to passed multiple view
               Pair[] pairs = new Pair[2];
               pairs[0]= new Pair <View,String>(image, "logo_image");                   //element/view which we want to animated
                pairs[1]= new Pair <View,String>(logo, "logo_text");
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
                    startActivity(intent,options.toBundle());   //"options.tobundle()" carry our animation
                }

        },SPLASH_SCREEN);


    }
}