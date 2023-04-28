package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity implements View.OnClickListener {


private TextView txtAccountSignIn;
private EditText edtName,edtEmail,edtPass,edtConfPass;
private CheckBox boxTerms;
private Toolbar toolbar;
 AppCompatButton btnSignUp;
String email = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_linearlayout);

//        email=getIntent().getStringExtra("Email");
//        Toast.makeText(this, "email", Toast.LENGTH_SHORT).show();
        Log.d("Email Address",email);
        initToolbar();
        findview();
//        btnSignUp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                    Intent intent = new Intent();
//                    intent.putExtra("Result", "Result Return");
//                    setResult(RESULT_OK, intent);
//                    finish();
//
//
//                }
//
//        });
//
    }

    private void initToolbar() {
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle("Login Page");
    }
    private void findview(){
        edtName = findViewById(R.id.edtName);
        edtEmail = findViewById(R.id.edtEmail);
        edtPass = findViewById(R.id.edtPass);
        edtConfPass = findViewById(R.id.edtConfPass);
        boxTerms = findViewById(R.id.boxTerms);
        btnSignUp  = findViewById(R.id.btnSignUp);
        txtAccountSignIn = findViewById(R.id.txtAccountSignIn);
        btnSignUp.setOnClickListener(this);
        txtAccountSignIn.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnSignUp) {
            if (edtName.getText().toString().isEmpty() || edtEmail.getText().toString().isEmpty() || edtPass.getText().toString().isEmpty() || edtConfPass.getText().toString().isEmpty()) {

                if (edtName.getText().toString().isEmpty() && !edtEmail.getText().toString().isEmpty() && !edtPass.getText().toString().isEmpty() && !edtConfPass.getText().toString().isEmpty()) {
                    Toast.makeText(this, "Please enter Name", Toast.LENGTH_SHORT).show();
                } else if (!edtName.getText().toString().isEmpty() && edtEmail.getText().toString().isEmpty() && !edtPass.getText().toString().isEmpty() && !edtConfPass.getText().toString().isEmpty()) {
                    Toast.makeText(this, "Please enter Email", Toast.LENGTH_LONG).show();
                }
                else if (!edtName.getText().toString().isEmpty() && !edtEmail.getText().toString().isEmpty() && edtPass.getText().toString().isEmpty() && !edtConfPass.getText().toString().isEmpty()) {
                    Toast.makeText(this, "Please enter Password", Toast.LENGTH_LONG).show();
                }
                else if (!edtName.getText().toString().isEmpty() && !edtEmail.getText().toString().isEmpty() && !edtPass.getText().toString().isEmpty() && edtConfPass.getText().toString().isEmpty()) {
                    Toast.makeText(this, "Please enter Confirm Password", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(this, "Please fill out all the fields", Toast.LENGTH_LONG).show();

                }

            }
            else if (!(edtName.getText().toString().isEmpty() && edtEmail.getText().toString().isEmpty() && edtPass.getText().toString().isEmpty() && edtConfPass.getText().toString().isEmpty())){
                if(edtPass.getText().toString().equals(edtConfPass.getText().toString())){
                    Intent intent = new Intent(SignupActivity.this, LogIn.class);
                    startActivity(intent);
                    Toast.makeText(this, "Redirected from SignUp Button", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(this, "Password and Confrim Password didn't match", Toast.LENGTH_LONG).show();
                }

            }

            }
        if (view.getId() == R.id.txtAccountSignIn) {
            Intent intent = new Intent(SignupActivity.this, LogIn.class);
            Toast.makeText(this, "Redirected from SignUp Page", Toast.LENGTH_LONG).show();

            startActivity(intent);

        }
    }

}

