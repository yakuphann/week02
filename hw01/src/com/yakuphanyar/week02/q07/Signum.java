package com.yakuphanyar.week02.q07;

import java.util.Scanner;

public class Signum { //signum isimli ana sınıfımızı açıyoruz.

    public static void main(String[] args) {

        int sayi; //girilen değeri atayacağımız int değişkenini tanımlıyoruz.
        Scanner input= new Scanner(System.in); //aldığımız değeri atamak için scanner kullanıyoruz.
        System.out.println("Sayıyı giriniz:"); //kullanıcıdan sayıyı istiyoruz.
        sayi = input.nextInt(); //girilen değeri sayi değişkenini atıyoruz.
        int sonuc = signummetodu(sayi); //altta yazdığımız signummetodu'nu sonuc değişkenine atıyoruz.

        System.out.println("Sonuç:" + sonuc); // sonucu yazdırıyoruz.
    }

    public static int signummetodu(int sayi) { //signum metodunu yazmak için bir sınıf açıyoruz.

        if(sayi > 0) {  //eğer sayımız 0dan büyük ise sonuc 1 olarak döndürülecektir.
            return 1;
        } else if(sayi < 0){ //eğer ilk koşul olmazsa sayının 0'dan küçük olmasına bakıyoruz.
            return -1; //sayımız sıfırdan küçükse -1 olarak döndürülecektir.
        } else {
            return 0; //iki koşula uymazsa sayımız 0'a eşit olacaktır bu yüzden 0 olarak döndürülecektir.
        }
    }
}
