package com.yakuphanyar.week02.q05;

import java.util.Scanner;

public class Siralama { //sıralama olusturacağımız ana sınıfı açıyoruz.

    public static void main(String[] args) {

        int sayi1,sayi2,sayi3; //girilecek sayıları atayacağımız değişkenleri oluşturuyoruz.
        Scanner input = new Scanner(System.in); //kullanıcıdan giriş almak için scanner kullanıyoruz.

        System.out.println("1.sayi:"); //birinci sayıyı alıyoruz.
        sayi1 = input.nextInt();

        System.out.println("2.sayi:"); //ikinci sayıyı alıyoruz
        sayi2 = input.nextInt();

        System.out.println("3.sayi:"); //ucuncu sayıyı alıyoruz
        sayi3 = input.nextInt();

        if(sayi1==sayi2){ // sayıları if else if else ile karşılaştırarak sonuçları yazdırıyoruz.
            if(sayi3 > sayi1){
                System.out.println(+sayi1+"="+sayi2+"<"+sayi3);
            }
            else if(sayi3==sayi1) {
                System.out.println(+sayi1+"="+sayi2+"="+sayi3);
            }
            else {
                System.out.println(+sayi3+"<"+sayi1+"="+sayi2);
            }
        }
        else if(sayi2==sayi3){
            if(sayi1 > sayi2){
                System.out.println(+sayi2+"="+sayi3+"<"+sayi1);
            }
            else if(sayi3==sayi1) {
                System.out.println(+sayi1+"="+sayi2+"="+sayi3);
            }
            else {
                System.out.println(+sayi1+"<"+sayi2+"="+sayi3);
            }
        }

        else if((sayi1>sayi2)&&(sayi1>sayi3)) {
            if(sayi2>sayi3) {
                System.out.println(+sayi3+"<"+sayi2+"<"+sayi1);
            } else
                System.out.println(+sayi2+"<"+sayi3+"<"+sayi1);
        }

        else if((sayi2>sayi1)&&(sayi2>sayi3)){
            if(sayi1>sayi3){
                System.out.println(+sayi3+"<"+sayi1+"<"+sayi2);
            } else
                System.out.println(+sayi1+"<"+sayi3+"<"+sayi2);

        }
        else  {
            if(sayi1>sayi2) {
                System.out.println(+sayi2+"<"+sayi1+"<"+sayi3);
            } else {
                System.out.println(+sayi1+"<"+sayi2+"<"+sayi3);
            }
        }

    }

}
