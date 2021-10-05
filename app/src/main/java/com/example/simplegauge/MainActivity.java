package com.example.simplegauge;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.github.anastr.speedviewlib.Gauge;
import com.github.anastr.speedviewlib.SpeedView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn;
    SpeedView spdview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.editText);
        btn=findViewById(R.id.button);
        spdview=findViewById(R.id.speedView);

        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nilai = 50;
                editText.getText().toString();
                spdview.speedTo(nilai);
            }
        });
    }
}