package com.example.rup_ing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    private EditText user_Name, user_Age, user_Phone, user_Id, user_Password, check_user_pass, user_Email;
    private Button btn_check_id, btn_register;
    private AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);

        user_Name=findViewById(R.id.user_Name);
        user_Age=findViewById(R.id.user_Age);
        user_Phone=findViewById(R.id.user_PhoneNumber);
        user_Id=findViewById(R.id.user_Id);
        user_Password=findViewById(R.id.user_Password);
        check_user_pass=findViewById(R.id.check_user_pass);
        user_Email=findViewById(R.id.user_Email);
        btn_check_id=findViewById(R.id.btn_check_id);
        btn_register=findViewById(R.id.btn_register);


        btn_register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

    }

}
