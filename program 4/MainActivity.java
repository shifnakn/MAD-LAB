package com.example.sharedpreference;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText1=findViewById(R.id.username);
        EditText editText2=findViewById(R.id.phoneno);
        EditText editText3=findViewById(R.id.email);
        EditText editText4=findViewById(R.id.password);
        EditText editText5=findViewById(R.id.cpwd);
        Button bt1=findViewById(R.id.but1);
    sharedPreferences = getSharedPreferences("User Details",MODE_PRIVATE);
    editor = sharedPreferences.edit();
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editText1.getText().toString().trim();
                String phoneno =  editText2.getText().toString().trim();
                String email =  editText3.getText().toString().trim();
                String password =  editText4.getText().toString().trim();
                String cpwd =  editText5.getText().toString().trim();

                if (username.isEmpty()) {
                    editText1.setError("Enter your name");
                    editText1.requestFocus();
                    return;
                }
                if(phoneno.isEmpty()){
                    editText2.setError("Enter phone no");
                    editText2.requestFocus();
                    return;
                }
                if(email.isEmpty()){
                    editText3.setError("Enter email id");
                    editText3.requestFocus();
                    return;
                }
                if(password.length() < 6 ){
                    editText4.setError("Password must be atleast 6 char");
                    editText4.requestFocus();
                    return;
                }
                if(cpwd.isEmpty()) {
                    editText5.setError("confirm your pwd");
                    editText5.requestFocus();
                    return;
                }
                if(!password.equals(cpwd)) {
                    editText5.setError("password dont match");
                    editText5.requestFocus();
                    return;
                }
                Toast.makeText(MainActivity.this,"Registration successful",Toast.LENGTH_SHORT).show();

                editor.putString("Keyusername",username);
                editor.putString("Keyphoneno",phoneno);
                editor.putString("Keyemail",email);
                editor.putString("Keypassword",cpwd);
                editor.apply();


            }
        });
    }
}