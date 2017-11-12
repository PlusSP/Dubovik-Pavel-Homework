package com.company;

import static java.lang.Math.*;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        //задание 1

        int symbols, halfsymbols;
        String text, text1, text2;
        text = "simplytextexample";
        System.out.println("слово: " + text);
        symbols = text.length();
        System.out.println("количество символов в слове: " + symbols);
        halfsymbols = symbols / 2;
        System.out.println("количество/2: " + halfsymbols);
        text1 = text.substring(0 , halfsymbols);
        text2 = text.substring(halfsymbols, symbols++);
        System.out.println("слово 1: " + text1);
        System.out.println("слово 2: " + text2);

        //задание 2

        int originalNum = 342;
        String sym = Integer.toString(originalNum);
        symbols = sym.length();
        String text3 = sym.substring(symbols-1, symbols);
        Byte b1 = new Byte(text3);
        if (b1 == 7) {
            System.out.println("последняя цифра: 7");
        } else {
            System.out.println("последняя цифра не равна 7");
        }
        String string2 = Integer.toString(originalNum);

        boolean ending = string2.endsWith("7");
        if (ending) {
            System.out.println("последняя цифра: 7");
        } else {
            System.out.println("последняя цифра не 7");
        }

        //задание 3

        int a, b, r;
        a = 5;
        b = 3;
        r = 4;
        if (r >= a && r >= b){
            System.out.println("круг перекрывает отверстие");
        }else{
            System.out.println("круг не перекрывает отверстие");
        }

        //задание 4
        System.out.print("Введите количество денег: ");
        Scanner scan = new Scanner(System.in);
        int money = scan.nextInt();
        String moneystring = Integer.toString(money);
        int lenghtmoney = moneystring.length();
        String lastchar = moneystring.substring(--lenghtmoney);
        Byte b2 = new Byte(lastchar);
        if (b2 == 1) {
            System.out.println(money + " рубль");
         }
        if (b2 >= 2 && b2 <= 4) {
            System.out.println(money + " рубля");
        }
        if (b2 >= 5 && b2 <= 9 || b2 == 0) {
            System.out.println("на счету: " + money + " рублей");
        }

        //задание 5

        String original_string = "Имеется строка, которая содержит символы ? и символы #.";
        System.out.println("изначальная строка: " + original_string);
        String newStr = original_string.replace("?", "helllo");
        String newStr2 = newStr.replace("#","");
        System.out.println("изменённая строка: " + newStr2);

        // задание 6

        int x,t,s;
        System.out.print("Введите любое целое число X: ");
        Scanner scan2 = new Scanner(System.in);
        x = scan2.nextInt();
        t = 2;
        s = 3;
        double y;
        y = pow(sin(pow(x,t)),2);
        y = y / (sqrt(1+pow(x,s)));
        System.out.println("результат выражения: y=" +y);
    }
}
