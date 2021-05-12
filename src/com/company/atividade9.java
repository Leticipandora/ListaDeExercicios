package com.company;

import java.util.Scanner;

public class atividade9 {

    public static void main(String[] args) {

        double TF, TC;

        Scanner sc = new Scanner(System.in);
        System.out.println("qual a temperatura em Fahrenheit");

        TF = sc.nextDouble();
        TC = 5 * ((TF-32) / 9);

        System.out.println("essa temperatura em celsius é:" + TC);

    }
}
