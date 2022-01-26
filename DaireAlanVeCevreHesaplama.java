// DAİRENİN ALAN VE ÇEVRESİNİ HESAPLAMA

package com.company;
import java.util.Scanner;

public class DaireAlanVeCevreHesaplama
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        final double pi = 3.14;

        System.out.print("Lütfen Dairenin Yarıçapını Giriniz: ");
        double yaricap = scanner.nextDouble();

        double cevre = 2 * pi * yaricap;
        double alan = pi * yaricap * yaricap;

        // BELLİ BİR AÇISI OLAN DAİRENİN ALANI
        System.out.print("Lütfen Alanını Bulmak İstediğiniz Dairenin Açısını Giriniz: ");
        int aci = scanner.nextInt();

        double alanAcili = (pi * (yaricap * yaricap) * aci) / 360;
        // BELLİ BİR AÇISI OLAN DAİRENİN ALANI

        System.out.println("Çevre: " + cevre);
        System.out.println("Alan: " + alan);
        System.out.println("Açılı Dairenin Alanı: " + alanAcili);
    }
}