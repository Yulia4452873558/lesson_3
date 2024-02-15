package com.ruff.lesson_3.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.ruff.lesson_3.R;
import com.ruff.lesson_3.data.ListCompetition;
import com.ruff.lesson_3.data.SportData;
import com.ruff.lesson_3.data.Trial;

import java.util.ArrayList;

public class MyListActivity extends AppCompatActivity {

    ListView listView;
    TrialAdapter trialAdapter;
    ArrayList<Trial> arrayListTrial;
    ListCompetition listCompetition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list);

        listView = (ListView) findViewById(R.id.lv_sport);

        /*SportData sportData = new SportData();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.item_sport, sportData.getSportArray());
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {  //принимает 4 элемента
                Toast.makeText(MyListActivity.this, sportData.getSportArray().get(position), Toast.LENGTH_SHORT).show();//обращаюсь к sportData вызываю метод get
                //Intent intent =new Intent();
            }
        });*/

        listCompetition= new ListCompetition();
        arrayListTrial=listCompetition.getListCompetitions(); //заполняем коллекцию элементами
        trialAdapter =new TrialAdapter(this,arrayListTrial);
        listView.setAdapter(trialAdapter);
    }
}