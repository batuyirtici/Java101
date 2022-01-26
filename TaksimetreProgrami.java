// TAKSİDE GİDİLEN KM MESAFEYE GÖRE ÜCRET BELİRLEME

package com.company;
import java.util.Scanner;

public class TaksimetreProgrami
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int acilis = 10;

        System.out.print("Gidilen KM Mesafeyi Giriniz: ");
        double mesafe = scanner.nextDouble();

        double kmTutari = mesafe * 2.20;

        double toplamTutar = acilis + kmTutari;

        double asilTutar;

        asilTutar = (toplamTutar < 20) ? 20 : toplamTutar;

        System.out.println("Ödenecek Tutar: " + asilTutar);
    }
}
