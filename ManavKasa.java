// MANAV KASA PROGRAMI

package com.company;

import java.util.Scanner;

public class ManavKasa
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        System.out.print("Armut Kilo: ");
        int armutKilo = scanner.nextInt();

        System.out.print("Elma Kilo: ");
        int elmaKilo = scanner.nextInt();

        System.out.print("Domates Kilo: ");
        int domatesKilo = scanner.nextInt();

        System.out.print("Muz Kilo: ");
        int muzKilo = scanner.nextInt();

        System.out.print("Patlıcan Kilo: ");
        int patlicanKilo = scanner.nextInt();

        double toplamTutar = (armutFiyat * armutKilo) + (elmaFiyat * elmaKilo) + (domatesFiyat * domatesKilo) + (muzFiyat * muzKilo) + (patlicanFiyat * patlicanKilo);

        System.out.print("Toplam Tutar: " + toplamTutar + " TL");
    }
}
