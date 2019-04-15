package com.example.gamechecker;

import androidx.appcompat.app.AppCompatActivity;
import maes.tech.intentanim.CustomIntent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private TextView mTextViewResult;
    private RequestQueue mQueue;

    private Button gameListButton;
    private Button addGameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gameListButton = (Button) findViewById(R.id.gameListButton);
        gameListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGameList();
            }
        });

        addGameButton = (Button) findViewById(R.id.addGameButton);
        addGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddGame();
            }
        });

    }

    public void openGameList(){
        Intent intent = new Intent(this, GameList.class);
        startActivity(intent);
        CustomIntent.customType(this, "bottom-to-up");
    }

    public void openAddGame(){
        Intent intent = new Intent(this, AddGame.class);
        startActivity(intent);
        CustomIntent.customType(this, "bottom-to-up");
    }
}

