package com.company;

import java.util.Scanner;

public class atividade4{
    public static void main(String[] args) {
        double n1, n2, n3, n4, M, qnd;
        qnd = 4;
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe suas quatro notas");

        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();
        n4 = scanner.nextInt();
        M = (n1 + n2 + n3 + n4) / qnd;
        System.out.println("a sua media foi: " + M);

    }
}



