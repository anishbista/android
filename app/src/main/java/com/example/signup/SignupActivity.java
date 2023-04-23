package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity implements View.OnClickListener {


private TextView txtAccountSignIn;
private AppCompatButton btnSignUp;
String email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_linearlayout);
        btnSignUp = findViewById(R.id.btnSignUp);
        email=getIntent().getStringExtra("Email");
        Toast.makeText(this, "email", Toast.LENGTH_SHORT).show();
        Log.d("Email Address",email);
//        findview();
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("Result","Result Return");
                setResult(RESULT_OK,intent);
                finish();


            }
        });
    }
    private void findview(){

        btnSignUp  = findViewById(R.id.btnSignUp);
        txtAccountSignIn = findViewById(R.id.txtAccountSignIn);
        btnSignUp.setOnClickListener(this);
        txtAccountSignIn.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnSignUp) {
        } else if (view.getId() == R.id.txtAccountSignIn) {
            Intent intent = new Intent( SignupActivity.this,LogIn.class);
            startActivity(intent);




        }
    }

}