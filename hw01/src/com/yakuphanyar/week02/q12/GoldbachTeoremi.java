package com.yakuphanyar.week02.q12;

import java.util.Scanner;

public class GoldbachTeoremi { //goldbach teoremi için ana sınıfı oluşturduk.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //kullanıcadan giriş almak için scanner kullandık
        System.out.print("Çift sayı girin:"); //kullanıcıdan giriş alıyoruz
        int cift = input.nextInt(); //girişi bir int değişkene aktarıyıoruz.
        input.close();

        if(cift <= 2 || cift % 2 != 0){ //eğer kullanıcı tek veya 2den düşük sayı girerse hata yazısı yazdırıyoruz.
            System.out.println("Hatalı sayı girişi!");
        } else {
            asaltoplam(cift); //altta yazdıgımız metodu çağırıyoruz.
        }
    }
    public static boolean isAsal(int sayi){ //burada sayiyin asal olup olmadığını belirliyoruz.
        if(sayi <= 1){
            return false;
        }
        if(sayi == 2) {
            return true;
        }
        if (sayi %2 == 0) {
            return false;
        }
        for (int i =3; i*i <= sayi; i += 2){
            if(sayi % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void asaltoplam(int cift){ //bu metodla girilen sayının asal toplamlarını yazdırıyoruz.
        for(int i=2; i <= cift/2; i++){
            if(isAsal(i) && isAsal(cift - i)){
                System.out.println(cift + " = " + i + " + " + (cift - i));
                return;
            }
        }
        System.out.println("Bu sayı iki asal sayının toplamı olamaz.");

    }
}
