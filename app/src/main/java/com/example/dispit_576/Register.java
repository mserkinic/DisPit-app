package com.example.dispit_576;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;

public class Register extends AppCompatActivity {
    EditText Name, Pass, Mail, Date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button registerButton = findViewById(R.id.registerButtonPost);
        Name= (EditText) findViewById(R.id.editTextTextPersonName2);
        Pass= (EditText) findViewById(R.id.editTextTextPassword);
        Mail= (EditText) findViewById(R.id.editTextTextEmailAddress2);
        Date= (EditText) findViewById(R.id.editTextDate);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Name.getText().length() == 0) {
                    Name.setError("Enter username");
                } else if (Pass.getText().length() == 0) {
                    Pass.setError("Enter password");
                } else if (Mail.getText().length() == 0) {
                    Mail.setError("Enter mail");
                } else if (Date.getText().length() == 0) {
                    Date.setError("Enter date");
                } else {
                    // What we want to display when button is clicked
                    Intent intentMain = new Intent(Register.this,
                            MainActivity.class);
                    Register.this.startActivity(intentMain);
                    Log.i("Content ", " Main layout ");
                    Toast.makeText(getApplicationContext(), "Logged in", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}