package com.ruff.lesson_3.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.ruff.lesson_3.R;
import com.ruff.lesson_3.data.Trial;

import java.util.ArrayList;

public class TrialAdapter extends ArrayAdapter<Trial> {

    private ArrayList<Trial> trialArrayList;

    public TrialAdapter(Context context, ArrayList<Trial> trialArrayList){  //конструктор
        super(context, R.layout.item_trial,trialArrayList);          //передаю данный в родит

        this.trialArrayList=trialArrayList;
    }

    @NonNull
    @Override //метод getView(отрисовка элементов на экране, когда надо отобразить элемент на экране
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) { // в View convertView хранится например футбол
        Trial trial= getItem(position);      //получаю экземпляр класса триал
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        convertView =layoutInflater.inflate(R.layout.item_trial, null);  //просим надуть макет

        TextView tvName= convertView.findViewById(R.id.tv_trial_name);
        TextView tvDistance= convertView.findViewById(R.id.tv_trial_distance);
        TextView tvDifficultLevel= convertView.findViewById(R.id.tv_trial_difficult_level);

        ImageView ivArrow = convertView.findViewById(R.id.iv_arrow);
        ImageView ivDelete = convertView.findViewById(R.id.iv_delete);

        tvName.setText(trial.getName());
        tvDistance.setText(String.valueOf(trial.getDistance()));
        tvDifficultLevel.setText(trial.getDifficultLevel());

        ivArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Я слушаю нажатие:" + trial.getName(), Toast.LENGTH_SHORT).show();
            }
        });
        ivDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trialArrayList.remove(position);
                notifyDataSetChanged();
            }
        });


        return convertView;
    }

}
