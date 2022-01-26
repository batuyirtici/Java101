// DİK ÜÇGENDE HİPOTENÜS BULMA

package com.company;
import java.util.Scanner;

public class DikUcgenHipotenusBulma
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen Birinci Kenarı Giriniz: ");
        int bir = scanner.nextInt();

        System.out.print("Lütfen İkinci Kenarı Giriniz: ");
        int iki = scanner.nextInt();

        double hipotenus = Math.sqrt((bir * bir) + (iki * iki)); //Karekök Alma

        double alan = (bir * iki) / 2;

        System.out.println("Hipotenüs: " + hipotenus);
        System.out.println("Alan: " + alan);

    }
}