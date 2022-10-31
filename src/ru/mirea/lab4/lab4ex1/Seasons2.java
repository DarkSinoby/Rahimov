package ru.mirea.lab4.lab4ex1;

import java.sql.SQLOutput;

public class Seasons2 {
    public enum YSeason{
        SUMMER("summer", 25),
        FALL("fall", 8);
        /*SPRING,
        WINTER;*/
        final String seasonName;
        final int avgTemp;
        YSeason(String name, int avgTmp) {
            this.seasonName = name;
            this.avgTemp = avgTmp;
        }

        @Override
        public String toString() {
            return super.toString()
                    + "\nseason name is: " + this.seasonName
                    + "\n avg temperature is: "+ this.avgTemp;
        }

    }


    public  static  void  main(String[] args){
        YSeason season = YSeason.FALL;
        isLeto(season);

      /*  switch (season){
            case SUMMER: System.out.println("I love summer!");break;
            case FALL: System.out.println("I love fall!");break;
            case SPRING: System.out.println("I love spring!");break;
            case WINTER: System.out.println("I love winter!");break;
        }*/
    }

    public static void isLeto(YSeason season) {
        System.out.println(season);
        switch(season){
            case SUMMER:

                System.out.printf("i love summer");
                break;
            default:
                System.out.println("i hate summer");
        }
        //System.out.println(YSeason.FALL);
    }

}
