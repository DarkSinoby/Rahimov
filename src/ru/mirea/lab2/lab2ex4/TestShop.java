package ru.mirea.lab2.lab2ex4;
import java.lang.*;
import java.util.Scanner;

public class TestShop {
    public  static  void  main(String[] args) {

        Scanner source = new Scanner(System.in);
        String command;

        String stock = "HP, Asus, Acer, ";
        Shop k1 = new Shop("HP, Asus, Acer, ");

        for(int i = 0; i < 100; i++){
            System.out.println(
                    "1:Ассортимент:\n" +
                            "2:Добавить товар:\n" +
                            "3:Убрать товар:\n" +
                            "4:Поиск:\n" +
                            "5:Выход.");
            command = source.nextLine();
            switch (command){
                case "1":
                    System.out.println(k1);
                    break;
                case "2":
                    System.out.println(k1);
                    String newstock = source.nextLine();
                    stock = stock + newstock;
                    k1.setStock(stock);
                    System.out.println(k1);
                    break;
                case "3":
                    System.out.println(k1);
                    String delete = source.nextLine();
                    stock = stock.replace(delete, "");
                    k1.setStock(stock);
                    System.out.println(k1);
                    break;
                case "4":
                    String search = source.nextLine();
                    k1.setStock(stock);
                    System.out.println(stock.contains(search));
                    break;
                case "5":
                    System.exit(0);
            }
        }
    }
}
