package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnConvert = findViewById(R.id.btnConvert);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convert();
            }
        });
    }

    public void convert(){
        EditText amount = findViewById(R.id.editTextAmount);
        TextView result = findViewById(R.id.textViewResult);

        String dollar = amount.getText().toString();

        if(!dollar.equals("") || !dollar.isEmpty()){
            Float euro = Float.valueOf(Float.parseFloat(dollar)) * 0.85f;
            result.setText("€ "+euro.toString());
        }else{
            result.setText("You didn't enter any amount!");
        }
    }
}