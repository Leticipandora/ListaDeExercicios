package com.company;

import java.util.Scanner;

public class atividade10 {


    public static void main(String[] args) {

        double GC;

        Scanner sc = new Scanner(System.in);
        System.out.println("qual é a temperatura em graus celsius");

        GC = sc.nextDouble();
        System.out.println("o valor da temperatura fahrenheit é igual:" + ( (9* GC +160 ) /5 ));


    }
}
