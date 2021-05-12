package com.company;

import java.util.Scanner;

public class atividade8 {

    public static void main(String[] args) {

        int GH, NH, SM;
        Scanner sc = new Scanner(System.in);
        System.out.println("valor ganhado por hora");

        GH = sc.nextInt();

        System.out.println(" qual o numero de horas trabalhadas no mes");

        NH = sc.nextInt();
        SM = NH * GH;

        System.out.println("o valor do seu salario mensal é:" + SM);



    }
}
