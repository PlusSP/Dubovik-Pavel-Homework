package com.company;

public class Main {

    public static void main(String[] args) {
//1) Создать иерархию классов, описывающих бытовую технику. Иерархия должна иметь хотя бы три уровня. Обязательно использовать хотя бы один абстрактный класс с абстрактными методами.

        class appliance {
            String name;
            int height;
            int width;
            int length;
            int weight;
        }
        class kitchenAppliance extends appliance {
            int electricityConsumption;
            boolean isOn;
            public void check () {
                if (isOn == true)
                    System.out.println(name + " is On");
                else System.out.println(name + "is Off");
            }
        }
        class heaters extends kitchenAppliance{
           int maxTemp;
           public void heat(){
               System.out.println("i'm heating");
           }
        }



    }
}
