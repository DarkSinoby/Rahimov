package ru.mirea.lab4.lab4ex1;

import ru.mirea.lab4.lab4ex0.example;

public class Seasons3 {

    public enum Season{
        SUMMER(26),
        FALL(16),
        SPRING(21),
        WINTER(10);
        private final int seasonTemp;

        Season(int seasonTemp) {
            this.seasonTemp = seasonTemp;
        }

        public int getSeasonTemp() {
            return seasonTemp;
        }
    }

    public  static  void  main(String[] args){
        for (Season season : Season.values()){
            Season seasonTemp = season;
            System.out.println("average temp of the " + season + " is " + seasonTemp.getSeasonTemp() + " degree");
        }
    }
}
