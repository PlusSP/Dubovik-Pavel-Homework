import sun.plugin.javascript.navig.Array;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Homework2 {
 public static void main(String[] args) {
//     1. Создайте массив с 10-ю переменными типа int. Используя оператор "for" найдите и выведите на экран наименьшее и наибольшее значение в массиве.
//             min value =  "значение которое у вас получилось".
//             max value =  "значение которое у вас получилось".
//             Далее замените наименьшее значение на 0, а наибольшее значение на 99 и выведите получившийся массив на экран в виде:
//[23, 0, 34, 99, 43534].
//
//     2. Создайте массив с 10-ю переменными типа float. Далее найдите дубликаты и выведите их количество.
//     Пример: есть массив {2, 3, 5, 7, 6, 5, 7, 3, 7, 20} - в данном массиве цифра 3 и 7 повторяются.
//             В результате выполнения программы на экран должно вывести:
//             [3] - повторений 2
//             [7] - повторений 3
//
//     3. Напишите программу, которая печатает массив, затем инвертирует (то есть меняет местами первый элемент с последним, второй — с предпоследним и т.д.), и вновь печатает.
//
//     4. Написать программу, определяющую, образуют ли цифры некоторого числа строго возрастающую последовательность. Например: 123 – образуют, 212 – не образуют.
//
//     5.Создайте массив типа int. Отсортируйте массив любым способом (по убыванию либо по возрастанию). Результат вывести на экран.

  //задение 1

  int[] firstArray = {100, 45, 1, 5, 16, 27, -24, 56, 0, -24};
  String arrayString1 = Arrays.toString(firstArray);
  System.out.println("изначальный массив " + arrayString1);
  int min = firstArray[firstArray.length - 1];
  int max = firstArray[0];
  int minIndex = 0;
  int maxIndex = 0;
  for (int i = 0; i < firstArray.length; i++) {
   if (min > firstArray[i]) {
    min = firstArray[i];
    minIndex = i;
   } else if (max < firstArray[i]) {
    max = firstArray[i];
    maxIndex = i;
   }// else if (min == firstArray[i])
//       System.out.println("минимальное значение" + firstArray[i]);   //добиться вывода совпадающих минимальных значений
  }
  System.out.println("минимальное значение " + min);
  System.out.println("максимальное значение " + max);
  firstArray[minIndex] = 0;
  firstArray[maxIndex] = 99;
  System.out.print("изменённый массив: [");
  System.out.print(firstArray[0]);
  for (int i = 1; i < firstArray.length; i++) {
   System.out.print(", ");
   System.out.print(firstArray[i]);
  }
  System.out.println("]");

  //задание 2

  float[] secondArray = {1.4f, 1.4f, 15.7f, -3.8f, 4.5f, 15.7f, -3.8f, 1.4f, 348.5f, 15.7f};
    int i;
    int j;
    float numb = 0; // цифра в массиве
    int count_repeat = 0; // количество одинаковых цифр(совпадения)
//    int max_repeat = 0; // максимальное количество одинаковых цифр(совпадений)

    System.out.println("массив " + Arrays.toString(secondArray));

    for (i = 0; i < secondArray.length; i++) { //внешняя пробежка по массиву чисел(без последнего)
     count_repeat = 1; //обнуление подсчета чисел

     for (j = i+1; j < secondArray.length; j++) { //внутренняя пробежка по массиву чисел(без первого, каждый раз уменьшая пробежку на 1)
      numb = secondArray[i]; // фиксация числа по которому есть совпадение

      if (secondArray[i] == secondArray[j] && (j != i)) { //сравнение после пробежек элементов массива И исключения сравнения с самим собой
       count_repeat++; //подсчет совпадений чисел массива
       if (i>0){ for(int t = 0; t < i; t++){
        if (secondArray[t]== numb)
         count_repeat = 0;} //проверка не выводилось ли число раньше
       }
      }
     }
     if(1 < count_repeat){//проверка были ли совпадения,

        System.out.println("Число: " + numb + ", встречается: " + count_repeat + "раза"); // вывод всех возможних совпадений и число по которому есть эти совпадения
           }
      }
    if(count_repeat == 0 ){ //сравнение на то есть ли  совпадения после переборов
     System.out.println("Числа в массиве НЕ повторяются "); // вывод если совпаденияй нет
    }

    // задание 3

    int[] thirdArray = {100, 45, 1, 5, 16, 100, -24, 56, 0, -24};
    String arrayString4 = Arrays.toString(thirdArray);
    System.out.println("изначальный массив " + arrayString4);
    int f=0;
    int s=thirdArray.length;
    int perem;
    for (f=0; f<s; f++){
     perem = thirdArray[f];
     thirdArray[f] = thirdArray[s-1];
     thirdArray[s-1] = perem;
     s--;
    } String arrayString5 = Arrays.toString(thirdArray);
  System.out.println("инвертированный " + arrayString5);

    // звдвние 4
      int number = 0;
      int length =0;
      System.out.println("введите любое целое число");
      Scanner scan = new Scanner(System.in);
      number = scan.nextInt();
      String numberStr = Integer.toString(number);
      length = numberStr.length();
      length--;
      for (int c = length-1; length > 0; c--){
          char subsrt1 = numberStr.charAt(length);
          char substr2 = numberStr.charAt(c);
          if (subsrt1 > substr2)
          length--;
          else {System.out.println("число не удовлетворяет параметрам");
          break;
          }
      }
     System.out.println("возрастающая последовательность в числе");

  // задание 5

     int arr[] = new int[10];
     for(int t = 0; t <  arr.length; t++) {
         arr[t] =  (int) (Math.random()*10);
         System.out.print(arr[t]);
     }
     System.out.print("\nотсортированный массив: \n");
//Сортируем массив
     Arrays.sort(arr);
//Выводим отсортированный массив
     for(int t = 0; t <  arr.length; t++) {
         System.out.print(arr[t]);
     }

 }
}