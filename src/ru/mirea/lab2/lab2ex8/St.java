package ru.mirea.lab2.lab2ex8;

public class St {
    public  static  void  main(java.lang.String[] args){
        String str = "123456789";
        System.out.println(str);
        str = new StringBuilder(str).reverse().toString();
        System.out.println(str);
    }
}
