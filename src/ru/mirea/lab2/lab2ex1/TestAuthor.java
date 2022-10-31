package ru.mirea.lab2.lab2ex1;
import ru.mirea.lab2.lab2ex1.author;

import java.lang.*;
import java.util.Scanner;

public class TestAuthor
{
    public static void main(String[] args)
    {
        String email;

        author k1 = new author("Mikail", "empty", 'M');
        System.out.println(k1);

        Scanner source = new Scanner(System.in);

        System.out.println("email:");
        email = source.next();
        k1.setEmail(email);
        System.out.println(k1);
    }
}
