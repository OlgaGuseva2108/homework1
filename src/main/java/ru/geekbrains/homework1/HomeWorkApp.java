package ru.geekbrains.homework1;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
        public static void printThreeWords () {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }



    public static void checkSumSign() {
        int a = 6, b = 5;

        if (a+b>=0) {
            System.out.println ("Сумма положительная");
        }
        if (a+b<0) {
    System.out.println ("Сумма отрицательная");

        }

    }

    public static void printColor() {
        int value = 5;

        if (value <=0) {
            System.out.println ("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println ("Желтый");
        }
        if (value > 100) {
            System.out.println ("Зеленый");
        }
    }
    public static void  compareNumbers() {
    int a=4, b=1;
    if (a>=b) {
        System.out.println ("a>=b");
    }
    else {
        System.out.println ("a<b");
    }
    }
}