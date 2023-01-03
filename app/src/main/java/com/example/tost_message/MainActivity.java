package com.example.tost_message;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button create;
    EditText Input;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        create = findViewById(R.id.create);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Input = (EditText) findViewById(R.id.username);
                name = Input.getText().toString();
                Toast.makeText(getApplicationContext(),"User " + name + " created.", Toast.LENGTH_LONG).show();
            }
        });
    }
}