package com.example.tyler.willwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mylin);
        for (int i = 0; i<10; i++) {
            addToHorzScrollView2(linearLayout, i);
        }

        listen2(linearLayout);
    }

    public void onClick(View v) {

        switch (v.getId()) {
            case 0:
                ((TextView)findViewById(R.id.textView)).setText("0");
                break;
            case 1:
                ((TextView)findViewById(R.id.textView)).setText("1");
                break;
            case 2:
                ((TextView)findViewById(R.id.textView)).setText("2");
                break;
            case 3:
                ((TextView)findViewById(R.id.textView)).setText("3");
                break;
            case 4:
                ((TextView)findViewById(R.id.textView)).setText("4");
                break;
            case 5:
                ((TextView)findViewById(R.id.textView)).setText("5");
                break;
            case 6:
                ((TextView)findViewById(R.id.textView)).setText("6");
                break;
            case 7:
                ((TextView)findViewById(R.id.textView)).setText("7");
                break;
            case 8:
                ((TextView)findViewById(R.id.textView)).setText("8");
                break;
            case 9:
                ((TextView)findViewById(R.id.textView)).setText("9");
                break;
        }
    }

    private void listen2(LinearLayout linearLayout){
        ImageButton iB0 = (ImageButton)linearLayout.findViewById(0);
        iB0.setOnClickListener(this);
        ImageButton iB1 = (ImageButton)linearLayout.findViewById(1);
        iB1.setOnClickListener(this);
        ImageButton iB2 = (ImageButton)linearLayout.findViewById(2);
        iB2.setOnClickListener(this);
        ImageButton iB3 = (ImageButton)linearLayout.findViewById(3);
        iB3.setOnClickListener(this);
        ImageButton iB4 = (ImageButton)linearLayout.findViewById(4);
        iB4.setOnClickListener(this);
        ImageButton iB5 = (ImageButton)linearLayout.findViewById(5);
        iB5.setOnClickListener(this);
        ImageButton iB6 = (ImageButton)linearLayout.findViewById(6);
        iB6.setOnClickListener(this);
        ImageButton iB7 = (ImageButton)linearLayout.findViewById(7);
        iB7.setOnClickListener(this);
        ImageButton iB8 = (ImageButton)linearLayout.findViewById(8);
        iB8.setOnClickListener(this);
        ImageButton iB9 = (ImageButton)linearLayout.findViewById(9);
        iB9.setOnClickListener(this);
    }

    private void listen(LinearLayout linearLayout){
        ImageButton iB0 = (ImageButton)linearLayout.findViewById(0);
        iB0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ((TextView)findViewById(R.id.textView)).setText("zero");
                // Perform action on click
            }
        });

        ImageButton iB1 = (ImageButton)linearLayout.findViewById(1);
        iB1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ((TextView)findViewById(R.id.textView)).setText("1");
                // Perform action on click
            }
        });
        ImageButton iB2 = (ImageButton)linearLayout.findViewById(2);
        iB2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ((TextView)findViewById(R.id.textView)).setText("2");
                // Perform action on click
            }
        });
        ImageButton iB3 = (ImageButton)linearLayout.findViewById(3);
        iB3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ((TextView)findViewById(R.id.textView)).setText("3");
                // Perform action on click
            }
        });
        ImageButton iB4 = (ImageButton)linearLayout.findViewById(4);
        iB4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ((TextView)findViewById(R.id.textView)).setText("4");
                // Perform action on click
            }
        });
        ImageButton iB5 = (ImageButton)linearLayout.findViewById(5);
        iB5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ((TextView)findViewById(R.id.textView)).setText("5");
                // Perform action on click
            }
        });
        ImageButton iB6 = (ImageButton)linearLayout.findViewById(6);
        iB6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ((TextView)findViewById(R.id.textView)).setText("6");
                // Perform action on click
            }
        });
        ImageButton iB7 = (ImageButton)linearLayout.findViewById(7);
        iB7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ((TextView)findViewById(R.id.textView)).setText("7");
                // Perform action on click
            }
        });
        ImageButton iB8 = (ImageButton)linearLayout.findViewById(8);
        iB8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ((TextView)findViewById(R.id.textView)).setText("8");
                // Perform action on click
            }
        });
        ImageButton iB9 = (ImageButton)linearLayout.findViewById(9);
        iB9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ((TextView)findViewById(R.id.textView)).setText("9");
                // Perform action on click
            }
        });
    }
    public void addToHorzScrollView(LinearLayout linearLayout) {
        //LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mylin);
        ImageView myImage = new ImageView(this);
        myImage.setImageResource(R.drawable.ppp);
        myImage.setLayoutParams(new AbsListView.LayoutParams(
                AbsListView.LayoutParams.MATCH_PARENT,
                AbsListView.LayoutParams.WRAP_CONTENT));
        linearLayout.addView(myImage);
    }

    public void addToHorzScrollView2(LinearLayout linearLayout, int count) {
        //LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mylin);
        ImageButton myImage = new ImageButton(this);
        myImage.setBackground(null);  //Get rid of grey border
        myImage.setId(count);
        myImage.setImageResource(R.drawable.ppp);
        myImage.setLayoutParams(new AbsListView.LayoutParams(
                AbsListView.LayoutParams.MATCH_PARENT,
                AbsListView.LayoutParams.WRAP_CONTENT));
        linearLayout.addView(myImage);
    }
}
