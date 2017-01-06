package com.example.fabiohh.newstyle;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface roboto = Typeface.createFromAsset(getAssets(), "RobotoCondensed-Regular.ttf");

        TextView textView = (TextView) findViewById(R.id.hello_textview);
        textView.setTypeface(roboto);
    }
}