package ru.mirea.lab2.lab2ex9;
import java.util.Scanner;

public class Poker {

    public  static  void  main(String[] args){

        Scanner source = new Scanner(System.in);
        String[] suits = {"Пик","Бубен","Черв","Треф"};
        String[] rank = {"2","3","4","5","6","7","8","9","10","Валет","Королева","Король","Туз"};
        int n = suits.length * rank.length;
        int cardsPerPlayer = 5;
        System.out.println("Количество играков: ");
        int players = source.nextInt();

        String[] deck = new String[n];
        for (int i = 0; i < rank.length; i++){
            for (int j = 0; j < suits.length; j++){
                deck[suits.length*i + j] = rank[i] + " " + suits[j];
            }
        }

        for (int i = 0; i < n; i++){
            int r = i + (int) (Math.random() * (n - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        if(cardsPerPlayer * players >= n - 5){
            System.out.println("Ошибка");
            System.exit(0);
        } else if (players < 0){
            System.out.println("Ошибка");
            System.exit(0);
        }

        for (int i = 0; i < players * cardsPerPlayer; i++) {
            System.out.println(deck[i]);
            if (i % cardsPerPlayer == cardsPerPlayer - 1)
                System.out.println();
        }
    }
}
