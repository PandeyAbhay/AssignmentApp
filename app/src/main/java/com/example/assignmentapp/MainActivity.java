package com.example.assignmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button signIn;
    private Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signIn=(Button)findViewById(R.id.signIn);
        signUp=(Button)findViewById(R.id.signUp);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignUpActivity();
            }
        });
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignInActivity();
            }
        });
    }

    private void openSignUpActivity() {
        Intent intent=new Intent(this,signUpActivity.class);
        startActivity(intent);
    }

    private void openSignInActivity() {
        Intent intent=new Intent(this,signInActivity.class);
        startActivity(intent);
    }






}
