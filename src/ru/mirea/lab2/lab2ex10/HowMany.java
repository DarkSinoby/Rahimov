package ru.mirea.lab2.lab2ex10;

import java.util.Scanner;

public class HowMany {
    public  static  void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите предложение!");
        String str = sc.nextLine();
        int count = 0;

        if (str.length() != 0){
            ++count;
            for (int i = 0; i < str.length(); i++){
                if(str.charAt(i) == ' '){
                    ++count;
                }
            }
        }
        System.out.println("вы ввели: " + count + " слова");
    }
}
