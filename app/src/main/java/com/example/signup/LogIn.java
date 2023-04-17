package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LogIn extends AppCompatActivity implements View.OnClickListener {
    private EditText edtEmail, edtPass;
    private AppCompatButton btnSignIn;
    private TextView txtBCA, txtWelcome, txtForgot, txtAlready, txtSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        findView();
    }

    private void findView() {
        edtEmail = findViewById(R.id.edtEmail);
        edtPass = findViewById(R.id.edtPass);
        txtForgot = findViewById(R.id.txtForgot);
        btnSignIn = findViewById(R.id.btnSignIn);
        txtSignUp = findViewById(R.id.txtSignUp);
        txtBCA = findViewById(R.id.txtBCA);
        btnSignIn.setOnClickListener(this);
        txtSignUp.setOnClickListener(this);
//        btnSignIn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(edtEmail.getText().toString().isEmpty() && !edtPass.getText().toString().isEmpty())
//                    ;
//            }
//        });

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnSignIn) {
        } else if (view.getId() == R.id.txtSignUp) {
            Intent intent = new Intent(LogIn.this, SignupActivity.class);
            startActivity(intent);


        }
    }
}