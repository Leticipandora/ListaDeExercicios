package com.company;

import java.util.Scanner;

public class atividade3 {

        public static void main(String[] args) {
            int number, number2, result;
            Scanner scanner= new Scanner(System.in);

            System.out.println("type some number");
            number = scanner.nextInt();

            System.out.println("type some number again");
            number2 = scanner.nextInt();

            result = number + number2;

            System.out.println("the result was " + result);

        }
    }


