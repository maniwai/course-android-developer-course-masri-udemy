package com.golaramani.playground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTextView = findViewById(R.id.myTextView);
        myTextView.setText("Hi From Java");

        EditText myEditText = findViewById(R.id.editText);
        String inputText = myEditText.getText().toString();

        Button myBTN = findViewById(R.id.myBtn);
        myBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You Clicked the Button",Toast.LENGTH_LONG).show();
            }
        });
    }
}