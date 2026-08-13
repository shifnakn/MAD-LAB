package com.example.sharedpreference;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView intName =findViewById(R.id.intName);
        TextView intMobile =findViewById(R.id.intMobile);
        TextView intEmail =findViewById(R.id.intEmail);
        TextView intPass =findViewById(R.id.intPass);
        String Name = getIntent().getStringExtra("username");
        String mobile = getIntent().getStringExtra("mobile");
        String Email = getIntent().getStringExtra("email");
        String pass = getIntent().getStringExtra("password");
        intName.setText("username : " +Name);
        intMobile.setText("mobile : " +mobile);
        intEmail.setText("Email : " +Email);
        intPass.setText("password :" +pass);

    }
}