package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img = findViewById(R.id.animationView);
        // определим для ImageView какое-нибудь изображение
        img.setImageResource(R.drawable.logo);
        // создаем анимацию
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.common_animation);
        Button startButton = (Button) findViewById(R.id.buttonStartAnim);
        Button stopButton = (Button) findViewById(R.id.buttonStopAnim);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.startAnimation(animation);
            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.clearAnimation();
            }
        });
        // запуск анимации

    }
}