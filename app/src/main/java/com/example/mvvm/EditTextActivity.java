package com.example.mvvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditTextActivity extends AppCompatActivity {

    private Button mBtnLogin;
    private EditText mEtUsername;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        mBtnLogin = findViewById(R.id.btn_login);
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(EditTextActivity.this,"登录成功！",Toast.LENGTH_SHORT).show();
            }
        });

        mEtUsername =findViewById(R.id.et_1);
        mEtUsername.addTextChangedListener(new TextWatcher() {
            // 文字改变之前
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            //文字改变当中
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.d("edittext", "onTextChanged: " +charSequence.toString());  //打印实时输出文字内容
            }
            //文字改变之后
            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}