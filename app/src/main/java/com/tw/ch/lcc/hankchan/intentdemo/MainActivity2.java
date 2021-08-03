package com.tw.ch.lcc.hankchan.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView infotxt;
    private Button btnclose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findViews();
    }

    private void findViews(){
        infotxt = findViewById(R.id.infotxt);
        btnclose = findViewById(R.id.btncloss);

        /*
        Bundle bundle = getIntent().getExtras();

        String name = bundle.getString("UserName","");
        int age  = bundle.getInt("UserAge",0);

        infotxt.setText(name + '---' + age);
         */
        String name  = getIntent().getStringExtra("Name");
        infotxt.setText(name);

        btnclose.setOnClickListener(v->{
            finish();
        });

    }
}