package lesson_4_homework;

import java.util.Random;
import java.util.Scanner;

public class ArraysHomework {

    public static void main(String[] args) {
     reverseValues();
     minMaxIndex();
     nullElements();
     swapPlaces();
     increasingSequence();
    }

    public static void reverseValues() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        int size = input.nextInt();
        int[] array = new int[size];
        Random random = new Random();
        for (int index = 0; index < size; index++) {
            array[index] = random.nextInt(0, 50);
        }
        for (int el : array) {
            System.out.println(el);
        }
        System.out.println();
        System.out.println("Элементы в обратном порядке");
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    public static void minMaxIndex() {
        int indexMin = 0;
        int indexMax = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        int size = input.nextInt();
        int[] array = new int[size];
        Random random = new Random();
        for (int index = 0; index < size; index++) {
            array[index] = random.nextInt(0, 50);
        }
        for (int el : array) {
            System.out.println(el);
        }
        int maximum = array[0];
        int minimum = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
                indexMin = i;
            }
            if (array[i] > maximum) {
                maximum = array[i];
                indexMax = i;
            }
    }
        System.out.println("Минимальное значение в массиве = " + minimum + " Его порядковый номер = " + ++indexMin);
        System.out.println("Максимальное значение в массиве = " + maximum + " Его порядковый номер = " + ++indexMax);
    }

    public static void nullElements() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int index = 0; index < size; index++) {
            System.out.println("Заполните элементы массива:");
            array[index] = input.nextInt();
        }
        int zero = 0;
        for (int e : array) {
            if (e == 0) zero++;
        }
            if (zero > 0) {
        System.out.println("Количество нулевых эелементов в массиве = " + zero);
            } else {
                System.out.println("Нулевых элементов в массиве нет");
            }
    }

    public static void swapPlaces() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int index = 0; index < size; index++) {
            System.out.println("Введите элемент массива");
            array[index] = input.nextInt();
        }
        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
            System.out.println(temp);
            }
        }

    public static void increasingSequence() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int index = 0; index < size; index++) {
            System.out.println("Заполните элементы массива:");
            array[index] = input.nextInt();
        }
        for (int el : array) {
            System.out.println(el);
        }
        boolean increasing = true;
        for (int index = 0; index < array.length - 1; index++)
        {
            if (array[index] >= array[index + 1])
            {
                increasing = false;
                break;
            }
        }
        if(increasing){
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив не является возрастающей последовательностью");
        }
    }
}
