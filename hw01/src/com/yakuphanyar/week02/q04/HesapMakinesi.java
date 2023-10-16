package com.yakuphanyar.week02.q04;

import javax.swing.JOptionPane;

public class HesapMakinesi { //hesap makinesi yapmak için ana sınıfımızı olusturduk.
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Birinci sayıyı girin:"); //joption kullanarak kullanıcıdan
        //değer aldık ve string input1 değişkenine atadık.
        double sayi1 = Double.parseDouble(input1); //string değişkenini double parse ettik ve sayi1'e atadık.

        String input2 = JOptionPane.showInputDialog("İkinci sayıyı girin:"); //ilk sayı için yaptıklarımızı yaptık.
        double sayi2 = Double.parseDouble(input2);

        String[] secenek = {"Toplama", "Çıkarma", "Çarpma", "Bölme"}; //bir string dizi oluşturduk.
        int secim = JOptionPane.showOptionDialog(null, //kullanıcıdan bir işlem seçmesini isteyip sonucu secim
                //değişkenine atadık.
                "İşlem seçiniz.",
                "İşlemler",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                secenek,
                secenek[0]);
        double sonuc = 0; //sonucları atayacağımız bir değişken oluşturduk.

        if(secim == 0){ //secim = toplama ise;
            sonuc= sayi1 + sayi2; //sayıları toplayıp sonuca aktardık.
        } else if(secim == 1){ //secim çıkarma ise:
            sonuc = sayi1 - sayi2; // sayıları çıkarıp sonuca aktardık
        } else if(secim == 2){ //secim çarpma ise:
            sonuc = sayi1 * sayi2; //sayıları çarpıp sonuca aktardık.
        } else if(secim == 3){ //secim bölme ise:
            if(sayi2 !=0){ //burda bir sayının sıfıra bölünmeyeceğini denetlemeliyiz.
                sonuc = sayi1 / sayi2;
            } else { //sayı2=0 ise hata mesajı gönderdik.
                JOptionPane.showMessageDialog(null,"Sıfıra bölemezsiniz.", "Hata", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        }
        JOptionPane.showMessageDialog(null, "Sonuç:" + sonuc, "İşlem Sonucu", JOptionPane.INFORMATION_MESSAGE);
    }//bir hata yok ise ekrana sonucu yazdırdık.

}
