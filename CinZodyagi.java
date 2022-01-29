/*
Kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

Çin Zodyağı nedir?

4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar.
Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla
pek bir ilgisi yoktur.

Çin Zodyağı nasıl hesaplanır?

Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

Doğum Tarihi %12 = 0 ➜ Maymun

Doğum Tarihi %12 = 1 ➜ Horoz

Doğum Tarihi %12 = 2 ➜ Köpek

Doğum Tarihi %12 = 3 ➜ Domuz

Doğum Tarihi %12 = 4 ➜ Fare

Doğum Tarihi %12 = 5 ➜ Öküz

Doğum Tarihi %12 = 6 ➜ Kaplan

Doğum Tarihi %12 = 7 ➜ Tavşan

Doğum Tarihi %12 = 8 ➜ Ejderha

Doğum Tarihi %12 = 9 ➜ Yılan

Doğum Tarihi %12 = 10 ➜ At

Doğum Tarihi %12 = 11 ➜ Koyun
 */

package com.company;
import java.util.Scanner;

public class CinZodyagi
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        int tarih = scanner.nextInt();

        if (tarih % 12 == 0) {System.out.println("Çin Zodyağı Burcunuz: Maymun");}

        else if (tarih % 12 == 1) {System.out.println("Çin Zodyağı Burcunuz: Horoz");}

        else if (tarih % 12 == 2) {System.out.println("Çin Zodyağı Burcunuz: Köpek");}

        else if (tarih % 12 == 3) {System.out.println("Çin Zodyağı Burcunuz: Domuz");}

        else if (tarih % 12 == 4) {System.out.println("Çin Zodyağı Burcunuz: Fare");}

        else if (tarih % 12 == 5) {System.out.println("Çin Zodyağı Burcunuz: Öküz");}

        else if (tarih % 12 == 6) {System.out.println("Çin Zodyağı Burcunuz: Kaplan");}

        else if (tarih % 12 == 7) {System.out.println("Çin Zodyağı Burcunuz: Tavşan");}

        else if (tarih % 12 == 8) {System.out.println("Çin Zodyağı Burcunuz: Ejderha");}

        else if (tarih % 12 == 9) {System.out.println("Çin Zodyağı Burcunuz: Yılan");}

        else if (tarih % 12 == 10) {System.out.println("Çin Zodyağı Burcunuz: At");}

        else if (tarih % 12 == 11) {System.out.println("Çin Zodyağı Burcunuz: Koyun");}
    }
}
