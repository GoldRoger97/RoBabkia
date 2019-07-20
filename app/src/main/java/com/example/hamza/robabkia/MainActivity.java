package com.example.hamza.robabkia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button signUpBtn = findViewById(R.id.main_signUp);
        Button LogInBtn = findViewById(R.id.main_login_btn);
LogInBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent LoginIntent=new Intent(MainActivity.this,login.class);
        startActivity(LoginIntent);

    }
});

signUpBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Log.e("signupButton","has been clicked");
        Intent regestrationIntent=new Intent(MainActivity.this,RegistrationActivity.class);
        startActivity(regestrationIntent);
    }
});
    }
}
