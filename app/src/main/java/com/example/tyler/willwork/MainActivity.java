package com.example.tyler.willwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i<10; i++) {
            addToHorzScrollView();
        }
    }

    public void addToHorzScrollView() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mylin);
        ImageView myImage = new ImageView(this);
        myImage.setImageResource(R.drawable.ppp);
        myImage.setLayoutParams(new AbsListView.LayoutParams(
                AbsListView.LayoutParams.MATCH_PARENT,
                AbsListView.LayoutParams.WRAP_CONTENT));
        linearLayout.addView(myImage);
    }
}
