package com.ruff.lesson_3.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Viktor-Ruff
 * Date: 13.02.2024
 * Time: 16:39
 */
public class SportData {

    public List<String> getSportArray() {

        return new ArrayList<>(Arrays.asList("Футбола", "Киберспорт", "Баскетбол", "Волейбол",
                "Гандбол", "Ралли", "Формула-1", "Гольф", "Регби", "Теннис", "Водное поло"));

    }

}
