package com.example.uiwidgettest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button) findViewById(R.id.button);
        //匿名类方式注册监听器
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //在此处添加逻辑
            }
        });
    }
}