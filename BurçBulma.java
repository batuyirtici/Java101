package com.company;
import java.util.Scanner;

public class BurçBulma
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Aşağıda Yazan Aylardan Bir adet Seçiniz:\n1- Ocak\n2- Şubat\n3- Mart\n4- Nisan");
        System.out.println("5- Mayıs\n6- Haziran\n7- Temmuz\n8- Ağustos\n9- Eylül\n10- Ekim\n11- Kasım\n12- Aralık");

        System.out.print("Seçiminiz: ");
        String tarihAy = scanner.nextLine();

        System.out.print("Lütfen Gün Belirtiniz: ");
        int tarihGun = scanner.nextInt();

        if (tarihAy.equalsIgnoreCase("1"))
        {
            if ((tarihGun > 0) && (tarihGun <= 21))
                System.out.println("Burcunuz: Oğlak");

            else if ((tarihGun >= 22) && (tarihGun <= 31))
                System.out.println("Burcunuz: Kova");

            else
                System.out.println("Hatalı Gün Girdiniz.");
        }

        else if (tarihAy.equalsIgnoreCase("2"))
        {
            if ((tarihGun > 0) && (tarihGun <= 19))
                System.out.println("Burcunuz: Kova");

            else if ((tarihGun >= 20) && (tarihGun <= 28))
                System.out.println("Burcunuz: Balık");

            else
                System.out.println("Hatalı Gün Girdiniz.");
        }

        else if (tarihAy.equalsIgnoreCase("3"))
        {
            if ((tarihGun > 0) && (tarihGun <= 20))
                System.out.println("Burcunuz: Balık");

            else if ((tarihGun >= 21) && (tarihGun <= 31))
                System.out.println("Burcunuz: Koç");

            else
                System.out.println("Hatalı Gün Girdiniz.");
        }

        else if (tarihAy.equalsIgnoreCase("4"))
        {
            if ((tarihGun > 0) && (tarihGun <= 20))
                System.out.println("Burcunuz: Koç");

            else if ((tarihGun >= 21) && (tarihGun <= 30))
                System.out.println("Burcunuz: Boğa");

            else
                System.out.println("Hatalı Gün Girdiniz.");
        }

        else if (tarihAy.equalsIgnoreCase("5"))
        {
            if ((tarihGun > 0) && (tarihGun <= 21))
                System.out.println("Burcunuz: Boğa");

            else if ((tarihGun >= 22) && (tarihGun <= 31))
                System.out.println("Burcunuz: İkizler");

            else
                System.out.println("Hatalı Gün Girdiniz.");
        }

        if (tarihAy.equalsIgnoreCase("6"))
        {
            if ((tarihGun > 0) && (tarihGun <= 22))
                System.out.println("Burcunuz: İkizler");

            else if ((tarihGun >= 23) && (tarihGun <= 30))
                System.out.println("Burcunuz: Yengeç");

            else
                System.out.println("Hatalı Gün Girdiniz.");
        }

        else if (tarihAy.equalsIgnoreCase("7"))
        {
            if ((tarihGun > 0) && (tarihGun <= 22))
                System.out.println("Burcunuz: Yengeç");

            else if ((tarihGun >= 23) && (tarihGun <= 31))
                System.out.println("Burcunuz: Aslan");

            else
                System.out.println("Hatalı Gün Girdiniz.");
        }

        else if (tarihAy.equalsIgnoreCase("8"))
        {
            if ((tarihGun > 0) && (tarihGun <= 22))
                System.out.println("Burcunuz: Aslan");

            else if ((tarihGun >= 23) && (tarihGun <= 31))
                System.out.println("Burcunuz: Başak");

            else
                System.out.println("Hatalı Gün Girdiniz.");
        }

        else if (tarihAy.equalsIgnoreCase("9"))
        {
            if ((tarihGun > 0) && (tarihGun <= 22))
                System.out.println("Burcunuz: Başak");

            else if ((tarihGun >= 23) && (tarihGun <= 30))
                System.out.println("Burcunuz: Terazi");

            else
                System.out.println("Hatalı Gün Girdiniz.");
        }

        else if (tarihAy.equalsIgnoreCase("10"))
        {
            if ((tarihGun > 0) && (tarihGun <= 22))
                System.out.println("Burcunuz: Terazi");

            else if ((tarihGun >= 23) && (tarihGun <= 31))
                System.out.println("Burcunuz: Akrep");

            else
                System.out.println("Hatalı Gün Girdiniz.");
        }

        else if (tarihAy.equalsIgnoreCase("11"))
        {
            if ((tarihGun > 0) && (tarihGun <= 21))
                System.out.println("Burcunuz: Akrep");

            else if ((tarihGun >= 22) && (tarihGun <= 30))
                System.out.println("Burcunuz: Yay");

            else
                System.out.println("Hatalı Gün Girdiniz.");
        }

        else if (tarihAy.equalsIgnoreCase("12"))
        {
            if ((tarihGun > 0) && (tarihGun <= 21))
                System.out.println("Burcunuz: Yay");

            else if ((tarihGun >= 22) && (tarihGun <= 31))
                System.out.println("Burcunuz: Oğlak");

            else
                System.out.println("Hatalı Gün Girdiniz.");
        }
    }
}
