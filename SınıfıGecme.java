/*
Dersler : Fizik, Kimya, Matematik,  Müzik, Türkçe

Geçme Notu : 55

Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
 */


package com.company;
import java.util.Scanner;

public class SınıfıGecme
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen Fizik Dersinin Notunu Giriniz: ");
        int notFizik = scanner.nextInt();

        System.out.print("Lütfen Kimya Dersinin Notunu Giriniz: ");
        int notKimya = scanner.nextInt();

        System.out.print("Lütfen Matematik Dersinin Notunu Giriniz: ");
        int notMat = scanner.nextInt();

        System.out.print("Lütfen Müzik Dersinin Notunu Giriniz: ");
        int notMüzik = scanner.nextInt();

        System.out.print("Lütfen Türkçe Dersinin Notunu Giriniz: ");
        int notTurkce = scanner.nextInt();

        if ((notFizik>=0 && notFizik<=100) && (notKimya>=0 && notKimya<=100) && (notMat>=0 && notMat<=100) && (notTurkce>=0 && notTurkce<=100) && (notMüzik>=0 && notMüzik<=100))
        {
            double ort = (double) (notFizik + notKimya + notMat + notMüzik + notTurkce) / 5;
            System.out.println("Ortalamanız: " + ort);

            if (ort >= 55)
                System.out.println("Sınıfı Geçtiniz!!");

            else
                System.out.println("Sınıfı Geçemediniz..");
        }

        else
            System.out.println("Lütfen 0 ile 100 arasında bir değer girin. ");
    }
}
