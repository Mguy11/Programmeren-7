package com.example.cmgtsoundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.List;

public class Soundboard extends AppCompatActivity {

//Create an int array which contains the ImageButton id's
    private static final int[] idArray = {
            R.id.imageButton,
            R.id.imageButton2,
            R.id.imageButton3,
            R.id.imageButton4,
            R.id.imageButton5,
            R.id.imageButton6,
            R.id.imageButton7,
            R.id.imageButton8,
            R.id.imageButton9,
            R.id.imageButton10,
            R.id.imageButton11,
            R.id.imageButton12,
            R.id.imageButton13,
            R.id.imageButton14,
            R.id.imageButton15,
            R.id.imageButton16,
            R.id.imageButton17,
            R.id.imageButton18,
    };


//Create a ImageButton array object to instantiate it with the length of idArray
    private ImageButton[] imageButton = new ImageButton[idArray.length];
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soundboard);

        //Assigning ImageButton array object name "imageButton" to the imageButton id's

        for(i = 0; i < idArray.length; i++){

            imageButton[i] = (ImageButton) findViewById(idArray[i]);

            imageButton[i].setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {

                    switch (v.getId()) {

                        case R.id.imageButton:
                            Toast.makeText(Soundboard.this, "This is my Toast message!",
                                    Toast.LENGTH_SHORT).show();

                        case R.id.imageButton2:
                            Toast.makeText(Soundboard.this, "This is my Toasty message!",
                                    Toast.LENGTH_SHORT).show();
                    }
                }
            });

        }




    }

}
