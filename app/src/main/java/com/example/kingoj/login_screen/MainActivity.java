package com.example.kingoj.login_screen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Sign IN button */
    public void forGotPass(View view) {
        // Perform Forgot Password Action in response to tapping Sign In button
        Intent intent = new Intent( this, ForGotPasswordActivity.class);
        startActivity(intent);
    }

    /** Called when the user taps the Sign UP button */
    public void signUP(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }

}
