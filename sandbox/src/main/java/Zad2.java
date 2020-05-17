package com.company;

import java.util.Scanner;

public class Zad2 {

    public static void main(String[] args) {

        Scanner skan = new Scanner(System.in);

        System.out.println("Wpisz cyfrę");
        int cyfra = skan.nextInt();

        if (cyfra % 3 == 0) {

            System.out.println("Jest podzielna");
        } else {

            System.out.println("nie jest podzielna");
        }

        skan.close();
    }

}
