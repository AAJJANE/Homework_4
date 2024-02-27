package com.aae.homework_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // поля
    private TextView screen, coordinates;
    private float x;
    private float y;
    private int[] coordinateKeys;
    private int interval = 50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen = findViewById(R.id.screen);
        coordinates = findViewById(R.id.coordinates);

        coordinateKeys = valueArrayRandom();

        screen.setOnTouchListener(listener);
    }

    private int[] valueArrayRandom() {
        Random random = new Random();
        int[] arrayValue = new int[10];
        for (int i = 0; i < arrayValue.length; i++) {
            if (i%2 == 0) {
                arrayValue[i] = random.nextInt(1044);
            } else {
                arrayValue[i] = random.nextInt(1510);
            }
        }
        return arrayValue;
    }

    private View.OnTouchListener listener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {

            x = motionEvent.getX();
            y = motionEvent.getY();


            switch (motionEvent.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    coordinates.setText("Нажатие " + x + ", " + y);
                    break;
                case MotionEvent.ACTION_MOVE:
                    coordinates.setText("Движение " + x + ", " + y);

                    if (x >= (coordinateKeys[0] - interval) && x <= (coordinateKeys[0] + interval) && y >= (coordinateKeys[1] - interval) && y <= (coordinateKeys[1] + interval)) {
                        Toast.makeText(MainActivity.this, "Найден первый ключ", Toast.LENGTH_SHORT).show();
                    } else if (x >= (coordinateKeys[2] - interval) && x <= (coordinateKeys[2] + interval) && y >= (coordinateKeys[3] - interval) && y <= (coordinateKeys[3] + interval)) {
                        Toast.makeText(MainActivity.this, "Найден второй ключ", Toast.LENGTH_SHORT).show();
                    } else if (x >= (coordinateKeys[4] - interval) && x <= (coordinateKeys[4] + interval) && y >= (coordinateKeys[5] - interval) && y <= (coordinateKeys[5] + interval)) {
                        Toast.makeText(MainActivity.this, "Найден третий ключ", Toast.LENGTH_SHORT).show();
                    } else if (x >= (coordinateKeys[6] - interval) && x <= (coordinateKeys[6] + interval) && y >= (coordinateKeys[7] - interval) && y <= (coordinateKeys[7] + interval)) {
                        Toast.makeText(MainActivity.this, "Найден четвёртый ключ", Toast.LENGTH_SHORT).show();
                    } else if (x >= (coordinateKeys[8] - interval) && x <= (coordinateKeys[8] + interval) && y >= (coordinateKeys[9] - interval) && y <= (coordinateKeys[9] + interval)) {
                        Toast.makeText(MainActivity.this, "Найден пятый ключ", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case MotionEvent.ACTION_UP:
                    coordinates.setText("Отпускание " + x + ", " + y);
                    break;
            }

            return true;
        }
    };
}