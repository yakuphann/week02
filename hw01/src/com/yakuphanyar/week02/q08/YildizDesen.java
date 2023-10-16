package com.yakuphanyar.week02.q08;

import java.util.Scanner;

//     *             boşluk 5 yıldız 1
//    ***            boşluk 4 yıldız 3
//   *****           boşluk 3 yıldız 5
//  *******          boşluk 2 yıldız 7
// *********         boşluk 1 yıldız 9
//***********        boşluk 0 yıldız 11
// *********
//  *******
//   *****
//    ***
//     *
public class YildizDesen { //Yıldız deseni oluşturmak için ana sınıf açıyoruz.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //kullanıcıdan satır bilgisi almak için scanner kullanıyoruz.
        System.out.println("Satır giriniz:"); //kullanıcıdan satır bilgisi istiyoruz.
        int satir = input.nextInt(); //girilen sayıyı int satır değişkenine atıyoruz.

        for (int i = 1; i <= satir; i++ ) {  //döngünmüze int i değişeknini 1'den başlatarak satır sayısı kadar
            //dönmesine yarayan döngüyü başlatıyoruz.
            for (int j = 1; j <= (satir - i); j++) { //başka bir int j değerini boşlukları oluşturmak için
                //for döngüsüne sokuyoruz.
                System.out.print(" "); //boşlukları yazdırıyoruz.
            }
            for (int k = 1; k <= (2 * i) - 1; k++) { //yıldızları oluşturmak için ayrı bir for döngüsü başlatıyoruz.
                System.out.print("*"); //yıldızları yazdrıyoruz.
            }
            System.out.println(); // her döngüde bir alt satıra inmesi için boş bir sout yazdırıyoruz.
        }

        for(int i = (satir-1); i >= 1; i--){ //yıldızın alt kısmını tamamlamak için ayrı bir for döngüsü ile
            //yukarıdaki işlemleri binevi tersten başlatarak döngüye sokuyoruz. (int i= satır-1 gibi.)
            for(int j=1; j <= (satir-i); j++){
                System.out.print(" "); //boşluklar için yine bir j değişkenini döngüye sokuyoruz.
            }
            for(int k=1; k <= (2*i)-1; k++){ // yıldızlar için k değişkenini döngüye sokuyoruz.
                System.out.print("*");
            }
            System.out.println(); //alt satıra inmesi için boş bir sout yazdırıyoruz.

        }
    }
}
