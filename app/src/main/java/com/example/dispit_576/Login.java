package com.example.dispit_576;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class Login extends AppCompatActivity {
    EditText User, Pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginButton = findViewById(R.id.buttonPrijava);
        Button registerButton = findViewById(R.id.registerButton);
        User= (EditText) findViewById(R.id.editTextTextEmailAddress);
        Pass= (EditText) findViewById(R.id.editTextTextPassword2);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // What we want to display when button is clicked
                if (User.getText().length() == 0) {
                    User.setError("Enter username");
                } else if (Pass.getText().length() == 0) {
                    Pass.setError("Enter Password");
                } else {
                    Intent intentMain = new Intent(Login.this,
                            MainActivity.class);
                    Login.this.startActivity(intentMain);
                    Log.i("Content ", " Main layout ");
                    Toast.makeText(getApplicationContext(), "Logged in", Toast.LENGTH_SHORT).show();
                }
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // What we want to display when button is clicked
                Intent intentMain = new Intent(Login.this ,
                        Register.class);
                Login.this.startActivity(intentMain);
                Log.i("Content "," Main layout ");
            }
        });
    }
}