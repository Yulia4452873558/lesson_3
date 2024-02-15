package com.ruff.lesson_3.data;

import com.ruff.lesson_3.data.Trial;

import java.util.ArrayList;
import java.util.Arrays;

public class ListCompetition {
    public ArrayList<Trial> getListCompetitions() {

        Trial carRace = new Trial("Автогонка", "Легкий", 5000);
        Trial run = new Trial("Бег", "Тяжелый", 400);
        Trial swimming = new Trial("Плавание", "Экстрим", 1500);
        Trial jump = new Trial("Прыжки", "Средний", 2);
        Trial ski = new Trial("Лыжи", "Тяжелый", 2000);
        Trial snowboard = new Trial("Сноуборд", "Средний", 500);
        Trial climbing = new Trial("Альпинизм", "Хардкор", 450);
        Trial bicycle = new Trial("Велогонка", "Легкий", 300);
        Trial surfing = new Trial("Сёрфинг", "Средний", 100);
        Trial diving = new Trial("Дайвинг", "Легкий", 50);


        return new ArrayList<Trial>(Arrays.asList(carRace, run, swimming, jump, ski, snowboard, climbing, bicycle, surfing, diving));
    }
}
