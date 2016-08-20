package com.example.akbar.massiv;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MassActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mass, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        EditText et = (EditText) findViewById(R.id.enter);
        TextView tv = (TextView) findViewById(R.id.output);
        String s = et.getText().toString();
        if (id == R.id.task1) {
            String[] a;//подготовка пустого массива под нарезку строки пользоватля 1 2 5 6 0 8 7
            a = s.split("#");//нарезка массива из введенной пользователь строки
            int kolvo = 0;////переменная для кол-ва ненулевых элементов
            for (int i = 0; i < a.length; i++) {
                int digit = Integer.valueOf(a[i]);//ложится каждый элемент массива при каждой итерации цикла
                if (digit != 0) {//проверка числа на ноль
                    kolvo++;//если число не равно нулю = увеличиваю счетчик
                }
            }
            tv.setText(String.valueOf(kolvo));//вывод результата в TextView
        }
        if (id == R.id.task2) {
            String[] a;//подготовка пустого массива под нарезку строки пользоватля 1 2 5 6 0 8 7
            a = s.split("#");//нарезка массива из введенной пользователь строки
            int sum = 0;////переменная для кол-ва ненулевых элементов
            for (int i = 0; i < a.length; i++) {
                int digit = Integer.valueOf(a[i]);//ложится каждый элемент массива при каждой итерации цикла
                if (digit > 0 && digit % 5 == 0) {//проверка числа на ноль
                    sum = sum + digit;//если число не равно нулю = увеличиваю счетчик
                }
            }
            tv.setText(String.valueOf(sum));//вывод результата в TextView
        }
        if (id == R.id.task3) {
            String[] a;//подготовка пустого массива под нарезку строки пользоватля 1 2 5 6 0 8 7
            a = s.split("#");//нарезка массива из введенной пользователь строки
            int sum = 0;////переменная для кол-ва ненулевых элементов
            for (int i = 0; i < a.length; i++) {
                int digit = Integer.valueOf(a[i]);//ложится каждый элемент массива при каждой итерации цикла
                if (digit > 4 && digit < 15) {//проверка числа на ноль
                    sum = sum + digit;//если число не равно нулю = увеличиваю счетчик
                }
            }
            tv.setText(String.valueOf(sum));//вывод результата в TextView
        }
        return super.onOptionsItemSelected(item);
    }
}