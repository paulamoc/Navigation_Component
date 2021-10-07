package com.pau.navigation_component;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class Register extends AppCompatActivity {

    Button play;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       play = findViewById(R.id.btn_play);

       play.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

           }

   });
   }


}
