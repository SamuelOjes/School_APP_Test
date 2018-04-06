package com.example.kingoj.login_screen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForGotPasswordActivity extends AppCompatActivity {

   // private Button mtGoBack; Would attend to this Later

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_got_password);
    }

   /* public void setMtGoBack(Button mtGoBack) {
        this.mtGoBack = mtGoBack;

        mtGoBack = (Button) findViewById(R.id.backsignin);
        mtGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    */

    public void mainActivity(View view){
        //Perform Return To Main Activity When Clicked
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
