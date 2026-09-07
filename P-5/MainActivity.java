package com.example.pgrm5;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView i1,i2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1 = findViewById(R.id.boat1);
        i2 = findViewById(R.id.boat2);
        i1.setOnClickListener(this::onClick);
        i2.setOnClickListener(this::onClick);


        }

    private void onClick(View view) {
        if (view.getId()==R.id.boat1){
            i1.setVisibility(view.GONE);
            i2.setVisibility(view.VISIBLE);
    }
        else
        {
            i2.setVisibility(view.GONE);
            i1.setVisibility(view.VISIBLE);
        }
        ;
    }
}