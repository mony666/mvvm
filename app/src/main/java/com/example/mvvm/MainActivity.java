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
    private Button rediobutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView = (Button) findViewById(R.id.btn_textview);
        mBtnLinearLayout = (Button) findViewById(R.id.btn_LinearLayout);
        relativeLayout = (Button) findViewById(R.id.btn_RelativeLayout);
        btton1 = (Button) findViewById(R.id.btn_button);
        editText = (Button) findViewById(R.id.btn_editText);
        rediobutton = findViewById(R.id.btn_rediobutton);
        setListeners();
    }

    private void setListeners() {
        Onclick onclick = new Onclick();
        mBtnTextView.setOnClickListener(onclick);
        mBtnLinearLayout.setOnClickListener(onclick);
        relativeLayout.setOnClickListener(onclick);
        btton1.setOnClickListener(onclick);
        editText.setOnClickListener(onclick);
        rediobutton.setOnClickListener(onclick);
    }


    private class Onclick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()){
                case R.id.btn_textview:
                    intent = new Intent(MainActivity.this,TextActivity2.class);
                    break;
                case R.id.btn_LinearLayout:
                    intent = new Intent(MainActivity.this,LinearLayoutActivity.class);
                    break;
                case R.id.btn_RelativeLayout:
                    intent = new Intent(MainActivity.this,RelativeLayoutActivity.class);
                    break;
                case R.id.btn_button:
                    intent = new Intent(MainActivity.this,ButtonActivity.class);
                    break;
                case R.id.btn_editText:
                    intent = new Intent(MainActivity.this,EditTextActivity.class);
                    break;
                case R.id.btn_rediobutton:
                    intent = new Intent(MainActivity.this,RedioButtoActivity.class);
                    break;


            }
            startActivity(intent);
        }
    }
}