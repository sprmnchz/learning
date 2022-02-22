package com.sprmnchz;

import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);

    public void start(){
        System.out.println("Введите цвет");
        String color = scanner.nextLine();
        System.out.println("Введите глагол");
        String action = scanner.nextLine();
        System.out.println("Введите прилагательное");
        String adjective = scanner.nextLine();
        System.out.println(color + " Дракон " + action + " на " + adjective + " рыцаря");
        System.out.println("Введите число");
        int exit = scanner.nextInt();

    }


}
