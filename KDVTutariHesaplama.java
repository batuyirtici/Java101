// GİRİLEN TUTARA GÖRE KDV BELİRLEYİP KDV'Lİ TUTAR HESAPLAMA

package com.company;
import java.util.Scanner;

public class KDVTutariHesaplama
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("KDV'li Tutarını Bulmak İstediğiniz Tutarı Giriniz: ");
        double tutar = scanner.nextDouble();

        double kdv;

        kdv = ((tutar > 0) && (tutar < 1000)) ? 1.8:0.8;

        System.out.println("KDV'siz Fiyat = " + tutar);
        System.out.println("KDV'li Fiyat = " + (tutar + tutar * kdv));
        System.out.println("KDV = " + kdv);
    }
}
