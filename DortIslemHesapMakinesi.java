package com.company;
import java.util.Scanner;

public class DortIslemHesapMakinesi
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");
        System.out.print("Lütfen Yapacağınız İşlemi Seçiniz: ");
        int secim = scanner.nextInt();

        switch (secim)
        {
            case 1: {
                System.out.println("Lütfen İşlem Yapmak İstediğiniz Sayıları Girin: ");
                System.out.print("Sayı 1: ");
                int sayi1 = scanner.nextInt();

                System.out.print("Sayı 2: ");
                int sayi2 = scanner.nextInt();

                System.out.println("Toplam: " + (sayi1 + sayi2));
                break;
            }

            case 2: {
                System.out.println("Lütfen İşlem Yapmak İstediğiniz Sayıları Girin: ");
                System.out.print("Sayı 1: ");
                int sayi1 = scanner.nextInt();

                System.out.print("Sayı 2: ");
                int sayi2 = scanner.nextInt();

                System.out.println("Çıkarma: " + (sayi1 - sayi2));
                break;
            }

            case 3: {
                System.out.println("Lütfen İşlem Yapmak İstediğiniz Sayıları Girin: ");
                System.out.print("Sayı 1: ");
                int sayi1 = scanner.nextInt();

                System.out.print("Sayı 2: ");
                int sayi2 = scanner.nextInt();

                System.out.println("Çarpma: " + (sayi1 * sayi2));
                break;
            }

            case 4: {
                System.out.println("Lütfen İşlem Yapmak İstediğiniz Sayıları Girin: ");
                System.out.print("Sayı 1: ");
                int sayi1 = scanner.nextInt();

                System.out.print("Sayı 2: ");
                int sayi2 = scanner.nextInt();

                switch (sayi2) {
                    case 0: {
                        System.out.println("Bir Sayı 0'a bölünemez");
                    }

                    default: {
                        System.out.println("Bölüm: " + (sayi1 / sayi2));
                        break;
                    }
                }
            }

            default: System.out.println("Yanlış Seçim Yaptınız..");
        }
    }
}
