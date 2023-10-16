package com.yakuphanyar.week02.q09;

import java.util.Scanner;

public class SaniyeCevirme { //Saat,dakika,saniye cinsinden çeviri yapacağımız programın ana sınıfını açıyoruz.
    public static void main(String[] args) {
        long saniye; //kullanıcıdan alacağımız değer için long değişken tanımlıyoruz.
        Scanner input = new Scanner(System.in); //aldığımız değeri aktarmak için scanner kullanacağız.
        System.out.println("Saniye giriniz:"); //kullanıcıdan değer istiyoruz.
        saniye = input.nextLong(); //aldığımız değeri saniye değişkenine atıyoruz.
        DisplayDuration(saniye); //saniye değişkenini alt kısımdaki displayduration metoduna sokuyoruz.

    }

    public static void DisplayDuration(long saniye) { //çeviri işlemini yapacağımız metodu açıyoruz.

        long saat,dakika,saniye2; //yukarıda aldığımız saniye değişkenini saat dakika ve kalan saniyeye
        //çevireceğimiz için 3 farklı long değişkeni atıyoruz.
        saat = saniye / 3600; //1 saat 3600 saniye old için direkt bölerek saati  bulabiliriz.
        //zaten double olmadığı için küsüratlar yazılmayacaktır.
        dakika = (saniye % 3600) / 60; //eğer yukarıdaki işlemden kalan sonucu 60'a bölersek dakikayi buluruz.
        //yani mod alıp 60'a bölmemiz gerekir.
        saniye2 = saniye % 60; //direkt 60'a mod alırsak kalan saniyeyi bulabiliriz
        if(saat > 0) { //eğer değerlerimiz 0 çıkarsa yazılmasını istemediğimiz için if ile bunu kontrol ediyoruz.
            System.out.println("Saat:" + saat); //saat değerimizi yazdırıyoruz.
        }
        if(dakika > 0) {
            System.out.println("Dakika:" + dakika); //dakika değerimizi yazdırıyoruz.
        }
        if(saniye2 > 0) {
            System.out.println("Saniye:" + saniye2); //saniye değerimizi yazdırıyoruz.
        }

    }
}
