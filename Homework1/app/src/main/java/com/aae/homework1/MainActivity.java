package com.aae.homework1;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button lionsTeam, panthersTeam;
    private TextView score;
    private int countLions = 0, countPanthers = 0;

    // создание активности
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "Создание активности", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_main);

        score = findViewById(R.id.score);
        lionsTeam = findViewById(R.id.button1);
        panthersTeam = findViewById(R.id.button2);

        lionsTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countLions++;
                score.setText(countLions + " : " + countPanthers);
            }
        });
        panthersTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countPanthers++;
                score.setText(countLions + " : " + countPanthers);
            }
        });

        if (savedInstanceState != null) {
            countLions = savedInstanceState.getInt("lions");
            countPanthers = savedInstanceState.getInt("panthers");
            updateScore();
        }
    }

    private void updateScore() {
        score.setText(String.format(countLions + " : " + countPanthers));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("lions", countLions);
        outState.putInt("panthers", countPanthers);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Запуск активности", Toast.LENGTH_SHORT).show();
    }

    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Открытие взаимодействия с активностью", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Отзыв взаимодействия с активностью", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Скрытие активности", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Уничтожение активности", Toast.LENGTH_SHORT).show();
    }


}