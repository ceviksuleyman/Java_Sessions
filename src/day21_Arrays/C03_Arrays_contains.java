package day21_Arrays;

import java.util.Scanner;

public class C03_Arrays_contains {

    public static void main(String[] args) {
        //Kullanicidan aldiginiz bir ismin verilen array'da olup olmadigini kontrol edip,
        // sonucu true veya false donen bir method olusturun

        String[] isimler = {"Basak","Nurullah","Fatih","Adem","Enes"};

        Scanner scan = new Scanner(System.in);
        System.out.println("Aradiginiz ismi giriniz...");
        String arananIsim = scan.nextLine();

        boolean sonuc = contains(isimler,arananIsim);
        if (sonuc) {
            System.out.println("Girilen isim listede var");
        }else {
            System.out.println("Girilen isim listede yok");
        }

    }
    public static boolean contains(String[] isimler, String arananIsim) {

        boolean sonucMethod = false;

        for (int i = 0; i < isimler.length ; i++) {

            if (isimler[i].equalsIgnoreCase(arananIsim)) {
                sonucMethod=true;
            }
        }
        return sonucMethod;
    }
}
