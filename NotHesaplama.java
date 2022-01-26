// NOT ORTALAMASI HESAPLAYAN PROGRAM

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Lütfen Fizik Dersi Sınav Notunu Giriniz: ");
     int fizik = scanner.nextInt();

     System.out.print("Lütfen Kimya Dersi Sınav Notunu Giriniz: ");
     int kimya = scanner.nextInt();

     System.out.print("Lütfen Matematik Dersi Sınav Notunu Giriniz: ");
     int matematik = scanner.nextInt();

     System.out.print("Lütfen Müzik Dersi Sınav Notunu Giriniz: ");
     int müzik = scanner.nextInt();

     System.out.print("Lütfen Tarih Dersi Sınav Notunu Giriniz: ");
     int tarih = scanner.nextInt();

     System.out.print("Lütfen Türkçe Dersi Sınav Notunu Giriniz: ");
     int turkce = scanner.nextInt();

     int toplam = fizik + kimya + matematik + müzik + tarih + turkce;
     double ortalama = (double) (toplam / 6);

     System.out.println("Ortalamanız: " + ortalama);

     String cikti;

     cikti=(ortalama>=60)?"Geçtiniz!":"Kaldınız..";

     System.out.println(cikti);
    }
}
