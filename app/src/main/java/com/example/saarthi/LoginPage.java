package com.example.saarthi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
  //  getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
}
    public void to_register(View view){
        startActivity(new Intent(this, UserSignUp.class));
    }

    public void to_home(View view) {
        startActivity(new Intent(this, Home_Activity.class));
    }
}