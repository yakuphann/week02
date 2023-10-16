package com.yakuphanyar.week02.q06;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OrtancaSayi { //ortanca sayıyı bulmak için kullanacağımız ana sınıfı oluşturduk.

    public static void main(String[] args) {
        int sayi1,sayi2,sayi3;   //kullanıcıdan girilmesi istenen 3 sayı için değişken oluşturduk.
        Scanner input = new Scanner(System.in); //girilen sayıları değişkenlere atamak için scanner kullandık.

        System.out.println("birinci sayiyi giriniz:"); //kullanıcıdan sayıları istiyoruz.
        sayi1 = input.nextInt(); // girilen sayıları değişkenlere atıyoruz.

        System.out.println("ikinci sayiyi giriniz:");
        sayi2 = input.nextInt();

        System.out.println("ücüncü sayiyi giriniz:");
        sayi3 = input.nextInt();
        int ortanca = mid(sayi1, sayi2, sayi3);  //ortanca değişkenini oluşturup aşağıda kullandığımız mid metodunu uyguluyoruz.

        System.out.println("Ortanca sayı:" + ortanca); //gelen return değerini yazdırıyoruz.

    }

    public static int mid(int sayi1,int sayi2,int sayi3) { //ortanca sayıyı bulmak gerekli mid metodu:

        if((sayi1 >= sayi2 && sayi1 <= sayi3) || (sayi1 <= sayi2 && sayi1 >= sayi3)) {
            //eğer 1. sayı 2'den büyük 3'ten küçükse veya 2 den küçük 3 ten büyükse ortanca sayı olacaktır.
            return sayi1;
        }
        else if((sayi2 >= sayi1 && sayi2 <= sayi3) || (sayi2 <= sayi1 && sayi2 >= sayi3)) {
            //eğer 2. sayı 1den büyük 3ten küçükse veya 1den küçük 3ten büyükse ortanca sayı olacaktır.
            return sayi2;
        }
        else { //eğer bu iki şart sağlanmadıysa 3.sayı otamatik olarak ortanca sayı olmuş olur.
            return sayi3;
        }

    }

}
