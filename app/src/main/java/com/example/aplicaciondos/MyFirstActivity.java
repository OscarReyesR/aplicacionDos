package com.example.aplicaciondos;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

public class MyFirstActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_first);
    }

    @Override
    protected void onResume() {
        super.onResume();/*
        Intent intent= new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://tenor.com/es/view/el-baile-del-troleo-shitposting-esqueleto-gif-18990991"));
        startActivity(intent);
        */
        Intent intent=new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
