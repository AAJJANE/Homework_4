package com.aae.second_lesson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.security.KeyStore;

public class MainActivity extends AppCompatActivity {

    private float spongeCakes = 10;
    private int cakesDiscount = 26;
    private float cream = 14;
    private int creamDiscount = 5;
    private float fruits = 3;
    private int fruitsDiscount = 12;
    private float nuts = 5;
    private int nutsDiscount = 55;
    private float berries = 7;
    private float account = 45;

    private TextView possibilityOut;
    private TextView balanceOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        possibilityOut = findViewById(R.id.possibilityOut);
        balanceOut = findViewById(R.id.balanceOut);

        if (possibility()) {
            possibilityOut.setText("Имеется достаточно средств для покупки ингредиентов");
            balanceOut.setText("Остаток от покупки " + balance() + " монет");
        } else {
            possibilityOut.setText("Недостаточно средств для покупки ингредиентов");
            balanceOut.setText("-");
        }
    }
    private float calculation() {
        float count = (spongeCakes * (100 - cakesDiscount) + cream * (100 - creamDiscount)
                + fruits * (100 - fruitsDiscount) + nuts * (100 - nutsDiscount)) / 100 + berries;
        return count;
    }

    private boolean possibility() {
        if (calculation() <= account) {
            return true;
        } else {
            return false;
        }
    }

    private float balance() {
        if  (possibility()) {
            return account - calculation();
        } else {
            return - 1;
        }
    }
}