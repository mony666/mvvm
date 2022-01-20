package com.example.mvvm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTextView;
    private Button mBtnLinearLayout;
    private Button relativeLayout;
    private Button btton1;
    private Button editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView = (Button) findViewById(R.id.btn_textview);
        mBtnLinearLayout = (Button) findViewById(R.id.btn_LinearLayout);
        relativeLayout = (Button) findViewById(R.id.btn_RelativeLayout);
        btton1 = (Button) findViewById(R.id.btn_button);
        editText = (Button) findViewById(R.id.btn_editText);

        mBtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TextActivity2.class);
                startActivity(intent);
            }
        });
        mBtnLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,LinearLayoutActivity.class);
                startActivity(intent);
            }
        });
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RelativeLayoutActivity.class);
                startActivity(intent);
            }
        });

        btton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ButtonActivity.class);
                startActivity(intent);
            }
        });
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,EditTextActivity.class);
                startActivity(intent);
            }
        });
    }
}