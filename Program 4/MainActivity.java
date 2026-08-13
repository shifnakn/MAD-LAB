package com.example.sharedpreference;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        EditText name=findViewById(R.id.name);
            EditText Phno=findViewById(R.id.phNo);
            EditText email=findViewById(R.id.email);
            EditText Pass=findViewById(R.id.pass);
            EditText ConPass=findViewById(R.id.ConPass);
        Button submit=findViewById(R.id.btn1);
        sharedPreferences=getSharedPreferences("userDetails",MODE_PRIVATE);
        editor= sharedPreferences.edit();
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name = name.getText().toString().trim();
                String phno = Phno.getText().toString().trim();
                String Email = email.getText().toString().trim();
                String pass = Pass.getText().toString().trim();
                String conpass = ConPass.getText().toString().trim();

                if (Name.isEmpty()) {
                    name.setError("name is empty");
                    name.requestFocus();
                    return;
                }
                if (phno.isEmpty()) {
                    Phno.setError("number is empty");
                    Phno.requestFocus();
                    return;
                }
                if (Email.isEmpty()) {
                    email.setError("email is empty");
                    email.requestFocus();
                    return;
                }
                if (pass.length() < 6) {
                    Pass.setError("length must be minimum 6 characters");
                    Pass.requestFocus();
                    return;
                }
                if (conpass.equals(Pass)) {
                    ConPass.setError("password not match");
                    ConPass.requestFocus();
                    return;
                }
                Toast.makeText(MainActivity.this, "registration is successfull", Toast.LENGTH_SHORT).show();
                editor.putString("keyusername", Name);
                editor.putString("keymobile", phno);
                editor.putString("keyemail", Email);
                editor.putString("keypassword",pass);
                editor.apply();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("username",Name);
                intent.putExtra("mobile",phno);
                intent.putExtra("email",Email);
                intent.putExtra("password",pass);
                startActivity(intent)
                ;
            }});
    }

}
