package ru.mirea.lab4.lab4ex0;

public class example {
    public enum Level {
        HIGH ("a"), // вызывает конструктор со значением 3
        MEDIUM ("a"),// вызывает конструктор со значением 2
        LOW ("a") // вызывает конструктор со значением 1
        ; //здесь нужна точка с запятой
        //поле для перечисления
        private final String levelCode;
        //конструктор
        private Level (String levelCode) {
            this.levelCode = levelCode;
        }
        // геттер для поля levelCode
        public String getLevelCode () {
            return this.levelCode;
        }
    }

    public  static  void  main(String[] args){
        Level level = Level.HIGH;
        System.out.println (level.getLevelCode ());
    }
}
