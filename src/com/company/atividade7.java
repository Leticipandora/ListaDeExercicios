package com.company;

import java.util.Scanner;

public class atividade7 {


    public static void main(String[] args) {
        int number;
        int area;

        Scanner sc = new Scanner(System.in);
        System.out.println("informe o lado");

        number = sc.nextInt();

        area = (number * number);
        System.out.println("a area vale: " + area );
        System.out.println(" o dobro dessa area é: " + area * 2);

    }
}