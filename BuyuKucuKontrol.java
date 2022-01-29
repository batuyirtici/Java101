/*
Girilen 3 adet sayıyı büyükten küçüğe sıralayan program
 */


package com.company;
import java.util.Scanner;

public class BuyuKucuKontrol
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Sıralanmasını İstediğiniz Sayıları Girin: ");

        System.out.print("\nSayı 1: ");
        int sayi1 = scanner.nextInt();

        System.out.print("Sayi 2: ");
        int sayi2 = scanner.nextInt();

        System.out.print("Sayi 3: ");
        int sayi3 = scanner.nextInt();

        if ((sayi1 > sayi2) && (sayi1 > sayi3))
        {
            if (sayi2 > sayi3)
                System.out.println(sayi1 + " > " + sayi2 + " > " + sayi3);

            else if (sayi3 > sayi2)
                System.out.println(sayi1 + " > " + sayi3 + " > " + sayi2);
        }

       else if ((sayi2 > sayi1) && (sayi2 > sayi3))
        {
            if (sayi1 > sayi3)
                System.out.println(sayi2 + " > " + sayi1 + " > " + sayi3);

            else if (sayi3 > sayi1)
                System.out.println(sayi2 + " > " + sayi3 + " > " + sayi1);
        }

       else if ((sayi3 > sayi1) && (sayi3 > sayi2))
        {
            if (sayi1 > sayi2)
                System.out.println(sayi3 + " > " + sayi1 + " > " + sayi2);

            else if (sayi2 > sayi1)
                System.out.println(sayi3 + " > " + sayi2 + " > " + sayi1);
        }

       else
           System.out.println("Sayılar Eşit.");
    }
}