package com.ruff.lesson_3.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ruff.lesson_3.R;
import com.ruff.lesson_3.data.SportData;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        linearLayout = (LinearLayout) findViewById(R.id.my_container);
        fillContainer();

    }

    private void fillContainer() {

        //Экземпляр класса SportData, в котором хранятся данные.
        SportData sportData = new SportData();

        //Экземпляр класса LayoutInflater для "надувания" View из макета
        LayoutInflater layoutInflater = getLayoutInflater();


        for (int i = 1; i < sportData.getSportArray().size(); i++) {

            //Надуваем View из макета item_sport
            View item = layoutInflater.inflate(R.layout.item_sport, null);

            //Находим TextView по id
            TextView textView = item.findViewById(R.id.tv_sport_name);
            //Присваиваем текст из коллекции по индексу
            textView.setText(sportData.getSportArray().get(i));
            //Добавляем View в контейнер activity_main
            linearLayout.addView(item);
        }

    }
}