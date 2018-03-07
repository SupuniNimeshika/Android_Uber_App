package com.example.supuni.uber_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class SignInActivity extends AppCompatActivity {

    EditText email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        email =findViewById(R.id.editEmail);
        password =findViewById(R.id.editPassword);
    }
}
