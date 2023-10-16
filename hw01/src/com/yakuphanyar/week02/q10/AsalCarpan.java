package com.yakuphanyar.week02.q10;

import java.util.Scanner;

public class AsalCarpan { //asal carpanları bulacağımız programın ana sıfını oluşturuyoruz.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //scanner ile alınan kodu değişkene aktaracağız
        System.out.println("Sayı giriniz:"); //kullanıcıdan sayı istiyoruz
        int sayi= input.nextInt(); //girilen sayıyı bir int sayi değişkenine aktarıyoruz.
        System.out.println("Girdiniz sayının asal çarpanları = "); //
        asalcarpanmetodu(sayi); //altta yazılan metodu tanımlıyoruz.

    }
    public static void asalcarpanmetodu(int sayi){ //asal carpanları bulacağımız metodu yazıyoruz.

        for(int i=2; i <= sayi; i++){ //en düşük asal çarpan 2 olduğu için i yi 2 den başlatıyoruz ve girilen sayı
            //değerine kadar döndürüyoruz.
            while(sayi % i == 0){ //bu süreçte sayıyı i değerlerine bölerek kalanı 0'a eşit olanları yazdırıyoruz.
                System.out.println(i);
                sayi= sayi/i; //eğer sayiyi her döngüde i'ye bölmezsek sonsuz bir döngüye girecektir.
                //o yüzden bu satır önemli.
            }
        }


    }
}
