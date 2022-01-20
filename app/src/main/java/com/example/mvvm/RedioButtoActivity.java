package com.example.mvvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RedioButtoActivity extends AppCompatActivity {

    private RadioGroup mGg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redio_butto);

        mGg1 = (RadioGroup) findViewById(R.id.rb_1);
        //监听选中事件
        mGg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton =  (RadioButton) radioGroup.findViewById(i);
                Toast.makeText(RedioButtoActivity.this,radioButton.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}