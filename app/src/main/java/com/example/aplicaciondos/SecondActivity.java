package com.example.aplicaciondos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private Button btnPrueba;
    private TextView txt1;
    private int contador=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activuty);
        btnPrueba=findViewById(R.id.btn1);
        txt1=findViewById(R.id.txt2);
        txt1.setText(String.valueOf(contador));
        btnPrueba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador=contador+1;
                txt1.setText(String.valueOf(contador));
            }
        });
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(this,"segundo activity! :D",Toast.LENGTH_LONG).show();
    }
}