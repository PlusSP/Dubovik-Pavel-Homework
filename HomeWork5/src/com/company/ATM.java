/*
2) Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в банкомате должен задаваться тремя свойствами:
 количеством купюр номиналом 20, 50 и 100.
 Сделать методы для добавления денег в банкомат.
 Сделать методы для снятия денег.
        Методы добавления денег:
        На вход передается сумма денег. Например 150 (предположим, что ситуации, когда поступает сумма с номиналом, которого у нас нет,
        не может произойти, поэтому можно не обрабатывать такой случай. Но если есть желание, лишним не будет :) ).
        На выход – булевское значение (операция удалась или нет).
        В этом методе вы распределяете сумму поступления по номиналам. Если пришло 150, то в итоге вам нужно добавить в переменную в которой
        хранится количество купюр по 100 +1, а в переменную с количеством 50-ток тоже +1. Сумму распределяем так чтобы максимально заполнить большими купюрами.
        Опять же, не загоняемся по поводу, а вдруг человек передал не 100 и 50,  а 20 20 20 20 20 и 50. Мы предполагаем что сумма поступаем наиболее крупными купюрами, и точка!
        Методы снятия денег:
        При снятии денег функция должна распечатывать, каким количеством купюр, какого номинала выдается сумма.*/
package com.company;
import java.util.Scanner;
public class ATM {
    int number20 = 100;
    int number50 = 100;
    int number100 = 100;
    int moneyCapacity = 17000;
    int moneyCount = (number20*20)+(number50*50)+(number100*100);
    boolean inSucsess;
    public void moneyCount() {
        System.out.println("оставшиеся деньги: "+ "20 - "+ number20 +",50 - "+ number50+ ",100 - "+ number100);
    }
    public void moneyIn(){
        System.out.println("Внесите сумму на счёт (не более 500р)\nДоступные номиналы: 20,50,100");
        Scanner moneyScanIn = new Scanner(System.in);
        int moneyIn = moneyScanIn.nextInt();
        int count100=0;
        int count50=0;
        int count20=0;
        if( moneyIn<=500 && (moneyIn%20==0||moneyIn%50==0||moneyIn%70==0||moneyIn%90==0||(moneyIn>100&&moneyIn%10==0))) {
            while (moneyIn>=100){
                number100++;
                moneyIn = moneyIn-100;
                count100++;
            }
            while (moneyIn>=50 && moneyIn!=60 && moneyIn!=80 ){
                number50++;
                moneyIn = moneyIn -50;
                count50++;
            }
            while (moneyIn>=20){
                number20++;
                moneyIn = moneyIn -20;
                count20++;
            }
            System.out.println("внесено купюр:\n100 - " + count100 + "\n50 - "+ count50 + "\n20 - " + count20);
            inSucsess = true ;
        }else{
            System.out.println("неверная сумма");
            inSucsess = false ;}
    }

    public void moneyOut(){
        System.out.println("Введите необходимую сумму(не более 500р)\nДоступные номиналы: 20,50,100");
        Scanner moneyScan = new Scanner(System.in);
        int money = moneyScan.nextInt();
        int count100=0;
        int count50=0;
        int count20=0;
        if( money<=500 && (money%20==0||money%50==0||money%70==0||money%90==0||(money>100&&money%10==0)) && money<moneyCount) {
            while (money>=100&& number100>1){
                number100--;
                money = money-100;
                count100++;
            }
            while (money>50 && money!=60 && money!=80 && number50>1){
                number50--;
                money = money -50;
                count50++;
            }
            while (money>=20 && number20>1){
                number20--;
                money = money -20;
                count20++;
            }
            System.out.println("выдано купюр:\n100 - " + count100 + "\n50 - "+ count50 + "\n20 - " + count20);
        }else System.out.println("Неверная сумма");
    }
}
