package com.company;

import java.util.Scanner;

public class atividade6 {

    public static void main (String[] args) {
        double raio, area, PI;
        PI = 3.14;
        Scanner sc = new Scanner(System.in);

        System.out.println("qual o valor do raio");

        raio = sc.nextDouble();
        area = PI *(raio*raio);
    System.out.println("o valor da area " + area );

                }
    }