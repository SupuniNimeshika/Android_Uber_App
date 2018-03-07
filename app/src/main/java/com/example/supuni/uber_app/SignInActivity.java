package com.example.supuni.uber_app;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class SignInActivity extends AppCompatActivity {

    EditText email,password;
    FirebaseAuth auth;
    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        email =findViewById(R.id.editEmail);
        password =findViewById(R.id.editPassword);

//        get Firebase Instance
        auth =FirebaseAuth.getInstance();
        dialog =new ProgressDialog(this);
    }

    public void signinUser(View v){
        dialog.setMessage("Signing in. Please wait");
        dialog.show();

        auth.signInWithEmailAndPassword(email.getText().toString(),password.getText().toString());
    }
}
