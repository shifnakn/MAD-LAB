package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    float val1,val2;
    boolean add,sub,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText result=findViewById(R.id.display);
        Button btn1=findViewById(R.id.btn1);
        Button btn2=findViewById(R.id.btn2);
        Button btn3=findViewById(R.id.btn3);
        Button btn4=findViewById(R.id.btn4);
        Button btn5=findViewById(R.id.btn5);
        Button btn6=findViewById(R.id.btn6);
        Button btn7=findViewById(R.id.btn7);
        Button btn8=findViewById(R.id.btn8);
        Button btn9=findViewById(R.id.btn9);
        Button btnplus=findViewById(R.id.btnplus);
        Button btnminuse=findViewById(R.id.btnminuse);
        Button btndivide=findViewById(R.id.btndivide);
        Button btnmult=findViewById(R.id.btnmult);
        Button btnpoint=findViewById(R.id.btnpoint);
        Button btn0=findViewById(R.id.btn0);
        Button btnc=findViewById(R.id.btnc);
        Button btnequal=findViewById(R.id.btnequal);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"0");
            }
        });
        btnpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+".");
            }
        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
            }
        });
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result==null){
                    result.setText("");
                }
                else {
                    val1=Float.parseFloat((result.getText()+" "));
                    add=true;
                    result.setText(null);
                }
            }
        });
        btnminuse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result==null){
                    result.setText("");
                }
                else {
                    val1=Float.parseFloat((result.getText()+" "));
                    sub=true;
                    result.setText(null);
                }
            }
        });
        btnmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result==null){
                    result.setText(" ");
                }
                else {
                    val1=Float.parseFloat((result.getText()+" "));
                    mul=true;
                    result.setText(null);
                }
            }
        });
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result==null){
                    result.setText(" ");
                }
                else {
                    val1=Float.parseFloat((result.getText()+" "));
                    div=true;
                    result.setText(null);
                }
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val2=Float.parseFloat(result.getText()+"");
                if (add=true){
                    result.setText(val1+val2+"");
                    add=false;
                }
                if (sub==true){
                    result.setText(val1-val2+"");
                    sub=false;
                }
                if (mul==true){
                    result.setText(val1*val2+"");
                    mul=false;
                }
                if (div==true){
                    result.setText(val1/val2+"");
                    div=false;
                }
            }
        });
    }
}