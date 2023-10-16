package com.yakuphanyar.week02.q11;

import java.util.Scanner;

public class DesenOlusturma {  //istenilen deseni programlamak için ana sınıfımızı oluşturduk.
    public static void main(String[] args) {
        int width; //genişlik ve uzunluk değerleri için değişkenler atadık.
        int height;
        Scanner input = new Scanner(System.in); // scanner ile değişkenlere değer atayacağız

        System.out.print("Genişlik giriniz:"); //kullanıcıdan genişlik değeri istedik.
        width = input.nextInt(); //değeri değişkene atadık.

        System.out.print("Uzunluk giriniz:"); //uzunluk değeri istedik.
        height = input.nextInt(); //girilen değeri değişkene atadık.

        for(int i = 0; i <= (height/2); i++){ //i=0 için her döngüde bir | işareti bırakacaktır.
            //döngünün üst kısmı için yani height/2 kadar döndürülecektir.
            System.out.print("|");
            for(int j=0; j < width; j++){ //j değişkeni genişlik kadar dönecektir
                if(i == j){ //j ile i nin eşit olduğu noktalara yıldız,
                    System.out.print("*");
                } else{ //diğer durumlarda ise boşluk bastırılacaktır.
                    System.out.print(" ");
                }
            }
            System.out.println("|"); //desenin sonuna her döngüde | işareti yazdırılacaktır.
        }
        for(int i = (height/2)-1; i >= 0; i--){ //döngünün aşağı kısmı için height/2 - 1 kere dönmesi gerekir.
            System.out.print("|"); //döngü başında | işareti yazdırılacaktır.
            for(int j = 0; j < width; j++) { // genişlik kadar döngü oluşturup
                if(i == j){ //eğer i ile j eşitse yıldız
                    System.out.print("*");
                } else { //değilse boşluk yazdırılacaktır.
                    System.out.print(" ");
                }
            }
            System.out.println("|"); //döngü sonlarına | işareti yazdırılacaktır.

        }

    }
}
