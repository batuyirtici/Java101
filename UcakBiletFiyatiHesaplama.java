/*
    Mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk
tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam
fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

    Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
    Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
    Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
    Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
    Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
 */


package com.company;
import java.util.Scanner;

public class UcakBiletFiyatiHesaplama
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türündne giriniz: ");
        int mesafe = scanner.nextInt();
        double normalTutar = mesafe * 0.10;

        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();
        double indirimYas = 0;

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int tip = scanner.nextInt();
        double indirimTip = 0;

        if ((yas > 0) && (yas < 12)) {indirimYas = 0.50;}

        else if ((yas >= 12) && (yas <= 24)){indirimYas = 0.10;}

        else if (yas >= 65) {indirimYas = 0.30;}

        if (tip == 2) {indirimTip = 0.20;}

        if ((mesafe < 0) || ((tip != 1) && (tip != 2)) || (yas <= 0))
        {
            System.out.println("Hatalı Veri Girdiniz!");
            System.exit(0);
        }

        double toplamTutar = (normalTutar - (normalTutar * indirimYas) - (normalTutar * indirimTip));
        System.out.println("Toplam Tutar: " + toplamTutar + "TL");
    }
}
