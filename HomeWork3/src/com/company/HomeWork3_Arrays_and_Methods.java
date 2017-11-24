package com.company;
import java.util.Scanner;
public class HomeWork3_Arrays_and_Methods {

    public static void main(String[] args) {
       /*
       1. Создайте массив с 10-ю переменными типа int.
                Значения необходимо вводить с клавиатуры в отдельном методе.
                Затем выведите все значения на экран также в отдельном методе в виде:
        "значение" | "значение 2" | "значение 3" |  и тд. -
                Далее отсортируйте массив по возрастанию способами из статьи или любыми другими алгоритмами.
                Результат вывести на экран:
        "значение" | "значение 2" | "значение 3" |  и тд.
                Далее найдите в массиве все четные числа и выведите их на экран:
        "значение" | "значение 2" | "значение 3" |  и тд.

                В итоге у вас должна получиться программа как минимум с 3 методами:
        1- для ввода данных с клавиатуры
        2 - для сортировки
        3 - для вывода

        Вывод значений массива на экран должен быть сделан в отдельном методе,
                этот метод будет использоваться для вывода значений массива до сортировки и после сортировки.
        */

        int[]newArr = new int[10];
        setValue(newArr);
        output(newArr);
        bubbleSort(newArr);
        output(newArr);
        evenNumbers(newArr);

    }
    public static void bubbleSort(int[] massive)
    {
       for (byte i = 0; i < massive.length - 1; i++)
        {
            for (byte j = 0; j < massive.length - i - 1; j++)
            {
                if (massive[j] > massive[j + 1])
                {
                   int cash = massive[j];
                   massive[j] = massive[j+1];
                   massive[j+1] = cash;
                }
            }
        }
    }
    public static int[] setValue(int[]array ){
        for(byte i=0; i<array.length; i++) {
            System.out.println("введите целове число№"+i);
            Scanner scanner = new Scanner(System.in);
            array[i] = scanner.nextInt();
        }return array;
    }
    public static void output(int[]array)
    {
        System.out.print("[");
        for (byte i=0; i<array.length; i++)
        {
            if (i>0)
            {
                System.out.print(" |");
            }
            System.out.print("\"значение " + i+"\" " + array[i]);
        }
        System.out.println("]");
    }
    public static void evenNumbers(int[]array)
    {
        for (byte i=0; i < array.length; i++)
        {if (array[i] % 2 == 0)
            System.out.println(array[i]);
        }

    }
}
