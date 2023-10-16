package com.yakuphanyar.week02.q01;

public class Main { //kodlarımızı yazacagimiz main sınıfını oluşturduk.

    public static void main(String[] args) {

        System.out.println(Math.abs(-2147483648)); //Soru1'de istenen Math.abs(-2147483648) kodunu yazdırdık.

        //Math.abs girilen int değerin mutlak değerini almaktadır.
        //Fakat girilen -2147483648 değeri = -2^31 (yani en düşük negatif int) değerdir.
        //Pozitif olarak maksimum değer 2^15 -1 olduğu için(0'dan dolayı -1) sonuç yine -2147483648 olarak gözükür.

    }
}