package com.example.mvvm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mvvm.gridview.GridViewActivity;
import com.example.mvvm.listview.ListViewActivity;

import com.example.mvvm.recycleview.RecyclerViewActivity;


public class MainActivity extends AppCompatActivity {

    private Button mBtnTextView;
    private Button mBtnLinearLayout;
    private Button relativeLayout;
    private Button btton1;
    private Button editText;
    private Button rediobutton;
    private Button chekboxbutton,imageviewbutton,btn_listview,gridview;
    private Button recyclerview;


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
        chekboxbutton = findViewById(R.id.chekboxbutton);
        imageviewbutton = findViewById(R.id.imageviewbutton);
        btn_listview =findViewById(R.id.btn_listview);
        gridview =findViewById(R.id.gridview);
        recyclerview = findViewById(R.id.btn_recyclerview);
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
        chekboxbutton.setOnClickListener(onclick);
        imageviewbutton.setOnClickListener(onclick);
        btn_listview.setOnClickListener(onclick);
        gridview.setOnClickListener(onclick);
        recyclerview.setOnClickListener(onclick);
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
                case R.id.btn_recyclerview:
                    intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                    break;
                case R.id.chekboxbutton:
                    intent = new Intent(MainActivity.this,CheckBoxActivity.class);
                    break;
                case R.id.imageviewbutton:
                    intent = new Intent(MainActivity.this,ImageViewActivity.class);
                    break;
                case R.id. btn_listview:
                    intent = new Intent(MainActivity.this, ListViewActivity.class);
                    break;
                case R.id.gridview:
                    intent = new Intent(MainActivity.this, GridViewActivity.class);
                    break;


            }
            startActivity(intent);
        }
    }
}