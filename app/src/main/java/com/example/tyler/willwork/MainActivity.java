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

    private void addToHorzScrollView2(LinearLayout linearLayout, int count) {
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

    public void onClick(View v) {
        TextView tv = (TextView)findViewById(R.id.textView3);
        switch (v.getId()) {
            case 0:
                tv.setText("0");
                break;
            case 1:
                tv.setText("1");
                break;
            case 2:
                tv.setText("2");
                break;
            case 3:
                tv.setText("3");
                break;
            case 4:
                tv.setText("4");
                break;
            case 5:
                tv.setText("5");
                break;
            case 6:
                tv.setText("6");
                break;
            case 7:
                tv.setText("7");
                break;
            case 8:
                tv.setText("8");
                break;
            case 9:
                tv.setText("9");
                break;
        }
    }
}
