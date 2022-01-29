/*
Eğer parola yanlış ise kullanıcıya parolasını sıfırlayıp sıfırlamayacağı sorulacak, eğer kullanıcı sıfırlamak isterse
yeni girdiği parolanın hatalı girdiği ve unuttuğu parola ile aynı olmaması gerektiğini kontrol edip, parolalar aynı ise
ekrana "Parola oluşturulamadı, lütfen başka parola giriniz." sorun yoksa "Parola oluşturuldu" yazan program..
 */


package com.company;
import java.util.Scanner;

public class KullaniciGirisi
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String parolaBilinen = "123";
        System.out.print("Lütfen Kullanıcı Adınızı Girin: ");
        String kullaniciAdi = scanner.nextLine();

        System.out.print("Lütfen Parolanızı Girin: ");
        String parolaGiris = scanner.nextLine();

        if (parolaGiris.equalsIgnoreCase(parolaBilinen))
            System.out.println("Giriş Başarılı");

        else
        {
            System.out.print("Hatalı Giriş..\nParolanızı Değiştirmek İster misiniz (e/h): ");
            String secim = scanner.nextLine();

            if (secim.equalsIgnoreCase("h"))
            {
                System.out.println("Programdan Çıkış Yapılıyor..");
                System.exit(0);
            }

            else
            {
                System.out.print("Lütfen Yeni Parolanızı Girin: ");
                String parolaYeni = scanner.nextLine();

                if (parolaYeni.equalsIgnoreCase(parolaBilinen))
                    System.out.println("Parola oluşturulamadı, lütfen başka parola giriniz.");

                else
                    System.out.println("Parola Oluşturuldu.");
            }
        }
    }
}
