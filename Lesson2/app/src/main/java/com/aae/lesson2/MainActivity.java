package com.aae.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    float robotPrice = 35_000;
    float amount = 1_700;
    float account = 700;
    float percentBank = 9;
    float[] monthlyPayments = new float[60];

    private TextView countOut;
    private TextView manyMonthOut;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countOut = findViewById(R.id.countOut);
        manyMonthOut = findViewById(R.id.manyMonthOut);

        countOut.setText(countMonth(percentBank, amount, robotPrice, account, monthlyPayments) + " месяцев.");

        String monthlyPaymentsList = "\n";
        for(float list : monthlyPayments) {
            if (list > 0) {
                monthlyPaymentsList += Float.toString(list) + ", \n";
            } else {
                break;
            }
        }

        manyMonthOut.setText("Первоначальный взнос: " + account + " монет, \nсумма вклада на конец срока: " + monthlyPaymentsList);
    }

    public int countMonth(float percentBankYear, float amount, float robot, float account, float[] arrayPayments) {

        float percentBankMonth = percentBankYear / 12;
        int count = 0;

        while (account < robot) {
            count++;
            account += amount;
            account = (account + (account*(percentBankMonth/100)));
            arrayPayments[count - 1] = account;
        }

        return count;
    }
}
