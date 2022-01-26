// VÜCUT KİTLE ENDEKSİ HESAPLAMA

package com.company;
import java.util.Scanner;

public class VucutKitleEndeksiHesaplama
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen Metre Cinsinden Boyunuzu Giriniz: ");
        double boy = scanner.nextDouble();

        System.out.print("Lütfen Kilonuzu Giriniz: ");
        int kilo = scanner.nextInt();

        double indeks = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz: " + indeks);
    }
}
