package com.company;

import java.util.Scanner;

public class news_pages {
    public static void main(String[] args) {
//        2. Представьте, что вам необходимо написать метод, определяющий количество страниц для вывода N новостей с учетом того, что на одной странице помещается 10 записей.
//    В итоге у вас будет метод, который возвращает количество страниц, а на вход принимает количество новостей. Помните, что тут округлять нужно всегда к большему.

        int newsNumber = 0;
        System.out.println("введите количество новостей");
        Scanner scanner = new Scanner(System.in);
        newsNumber = scanner.nextInt();
       System.out.println("необходимое количество страниц: "+ pages(newsNumber));
    }
    public static int pages(int news)
    {
        int numberPages = news/10;
        if (news%10 !=0 ) numberPages++;
        return numberPages;
    }
}
