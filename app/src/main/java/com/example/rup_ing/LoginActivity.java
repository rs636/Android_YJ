package com.example.rup_ing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText user_Id, user_Password;
    private Button btn_login, btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        Log.d("로그인 액티비티","Login!");

        user_Id=findViewById(R.id.user_Id);
        user_Password=findViewById(R.id.user_Password);
        btn_login=findViewById(R.id.btn_login);
        btn_register=findViewById(R.id.btn_register);

        btn_register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("로그인 액티비티","회원가입 버튼!");
                Intent intent=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("로그인 액티비티","로그인 버튼!");
                Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
                Log.d("로그인 액티비티","2");
            }
        });


    }
}
