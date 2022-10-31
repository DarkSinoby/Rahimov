package ru.mirea.lab2.lab2ex0;
import java.lang.*;
import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {

        double r;

        Circle k1 = new Circle(3,4,5,"red");
        System.out.println("Длина окружности = " + k1.getLength() + "см\n");

        Scanner source = new Scanner(System.in);

        System.out.println("Введите радиус ");
        r = source.nextDouble();

        k1.setR(r);
        System.out.println("\nДлина окружности = " + k1.getLength() + "см");
    }
}
