package com.home;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        /*
        вывести в консоль меню в виде нумерованного списка и предлагает выбрать
        пункт меню (ввести с консоли). Пункты меню должны содержать количество лет пользователя
        После выбора соответствующего пункта программа выводит сообщение о возрастной группе пользователя

        1) вывести в консоль список с возрастными группами
        2) предложить ввести пользователю свой возраст
        3) вывести в консоль название возрастной группы
        */
        while (true) {
            String[] string = new String[7];
            string[0] = "1. Вам 0-12 лет";
            string[1] = "2. Вам 13-16 лет";
            string[2] = "3. Вам 17-21 лет";
            string[3] = "4. Вам 22-35 лет";
            string[4] = "5. Вам 36-55 лет";
            string[5] = "6. Вам 56-70 лет";
            string[6] = "7. Вам 71 и более лет";
            for (int i = 0; i < 6; i++) {
                System.out.println(string[i]);
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите номер пункта меню, соответствующий Вашему возрасту");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Вы ребенок");
                    break;
                case 2:
                    System.out.println("Вы подросток");
                    break;
                case 3:
                    System.out.println("Вы почти взрослый, но алкоголь Вам не продадут");
                    break;
                case 4:
                    System.out.println("Вы в расцвете лет");
                    break;
                case 5:
                    System.out.println("Не успеете оглянуться, пенсия на носу");
                    break;
                case 6:
                    System.out.println("Печально, но Вы стремительно стареете");
                    break;
                case 7:
                    System.out.println("Вы еще с нами? Поздравляю!");
                    break;

            }
        }
    }
}

