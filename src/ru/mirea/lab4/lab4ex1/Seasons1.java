package ru.mirea.lab4.lab4ex1;

public class Seasons1 {

    static String summer ="Summer is: ";
    public enum likeSeason{
        WARM(),
        SUNNY;
    }

    public  static  void  main(String[] args){
        for (likeSeason season : likeSeason.values()) {
            System.out.println(summer + season + " season of the year");
        }
    }

}
