package com.example.imagesliderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setupListener();


    }
    private void initView(){
        btnLogin = findViewById(R.id.btnLogin);
    }

    private void setupListener(){
        btnLogin.setOnClickListener(new BtnOnClickListeners());
    }

    class BtnOnClickListeners implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            ImageDialog imageDialog = new ImageDialog(MainActivity.this);
            imageDialog.show();
        }

        }
    }
