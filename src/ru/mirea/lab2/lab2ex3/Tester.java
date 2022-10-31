package ru.mirea.lab2.lab2ex3;
import java.lang.*;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args){

        double x1, y1;

        Circle k1 = new Circle(3, 4);
        System.out.println("Длина r = " + k1.getR() + " см\n");

        Scanner source = new Scanner(System.in);

        System.out.println("Введите x1 и y1 для новой окружности");
        x1 = source.nextDouble();
        k1.setX1(x1);
        y1 = source.nextDouble();
        k1.setY1(y1);
        System.out.println("Длина r = " + k1.getR() + " см\n");
    }
}