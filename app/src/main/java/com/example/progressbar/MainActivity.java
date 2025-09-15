package com.example.progressbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button btn;
ProgressBar progressBar;
    int Progress = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressbar);
        btn = findViewById(R.id.Btn);



           btn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                  Progress = Progress+10;

                 progressBar.setProgress(Progress);

               }
           });
    }
}