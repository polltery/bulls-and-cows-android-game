package com.example.random.ducksanddragons;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Run this method on a button click
    public void changeActivity(View view){
        Intent changeActivityIntent = new Intent(this, GameCasualActivity.class);
        startActivity(changeActivityIntent);
    }
}
