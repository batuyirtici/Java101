/*
Girilen Sıcaklık Değerine Göre Etkinlik Öneren Program
 */

package com.company;
import java.util.Scanner;

public class EtkinlikOneri
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen Sıcaklık Değerini Giriniz: ");
        double sicaklik = scanner.nextDouble();

        if (sicaklik <= 5.0)
            System.out.println("Kayak Yapabilirsiniz.");

        else if ((sicaklik > 5.0) && (sicaklik <= 15.0))
            System.out.println("Sinemaya Gidebilirsiniz.");

        else if ((sicaklik > 15.0) && (sicaklik <= 25.0))
            System.out.println("Pikniğe Gidebilirsiniz.");

        else if (sicaklik > 25)
            System.out.println("Yüzmeye Gidebilirsiniz.");
    }
}