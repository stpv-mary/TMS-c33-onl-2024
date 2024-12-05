package lesson_3_homework;

import java.util.Scanner;

public class ControlOperators {

    public static void main(String[] args) {
        sumVariables();
        sumTwoNumbers();
        sumThreeNumbers();
        roundNumber();
        dividingNumbers();
        swapNumber();
        parityNumbers();
        temperatureDetermination();
        squareNumber();
        firstCycle();
        lastTask();
    }

    public static void sumVariables() {
        int b = 5;
        int c = 10;
        int a = 4 * (b + c - 1) / 2;
        System.out.println("Значение переменной а равно " + a);
    }

    public static void sumTwoNumbers() {
        int n = 26;
        int b = n % 10;
        int c = (n / 10);
        System.out.println("Сумма цифр числа " + n + " равна " + (b + c));
    }

    public static void sumThreeNumbers() {
        int n = 126;
        int b = n % 10;
        int c = (n / 10) % 10;
        int d = (n / 100);
        System.out.println("Сумма цифр числа " + n + " равна " + (b + c + d));
    }

    public static void roundNumber() {
        double a = 71.25;
        System.out.println("Результат округления числа " + a + " равен " + (int) a);
    }

    public static void dividingNumbers() {
        int q = 21;
        int w = 8;
        int a = q % w;
        int b = 21 / 8;
        System.out.println("Результат деления числа " + q + " на " + w + " равен " + b + " и " + a + " в остатке");
    }

    public static void swapNumber() {
        int a = 1;
        int b = 2;
        a = b + a;
        b = a - b;
        a = a - b;
        System.out.println("Новое значение a = " + a + " Новое значение b = " + b);
    }

    public static void parityNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число для проверки четности: ");
        double number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }

    public static void temperatureDetermination() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите температуру на улице: ");
        double temperature = input.nextInt();
        if (temperature > -5){
            System.out.println("Warm");
        } else if (temperature <= -20){
            System.out.println("Cold");
        } else {
            System.out.println("Normal");
        }
    }

    public static void squareNumber() {
        for (int value = 1; value <= 20; value++) {
            System.out.println(Math.pow(value,2));
        }
    }

    public static void firstCycle() {
        int number = 0;
        while(number < 98){
            number += 7;
            System.out.println(number);
        }
    }

    public static void lastTask() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите последнее число диапазона: ");
        int lastValue = input.nextInt();

        if (lastValue <= 0){
            System.out.println("Вы ввели значение меньше либо равно 0");
        } else {
        int sum = 0;
        for (int i = 1; i<= lastValue; i++){
            sum = sum + i;
        System.out.println (sum);
        }
        }
    }

}
