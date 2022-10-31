package ru.mirea.lab2.lab2ex2;

import java.lang.*;
import java.util.Scanner;

public class TestBall
{
    public  static  void  main(String[] args)
    {
        double a,b;

        Ball k1 = new Ball( 5, 4);
        System.out.println("x" + k1.getX() + "y" + k1.getY());

        Scanner source = new Scanner(System.in);

        System.out.println("a = ");
        a = source.nextInt();
        System.out.println("b = ");
        b = source.nextInt();
        k1.move(a,b);
        System.out.println(k1);
    }
}
