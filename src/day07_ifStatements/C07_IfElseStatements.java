package day07_ifStatements;

import java.util.Scanner;

public class C07_IfElseStatements {

    public static void main(String[] args) {
        //Kullaniciya yaşini sorun eger 65 yaşdan kucuk ise emekli olamazsin,calismalisin
        //65 e esit veya büyükse emekli olabilirsin yazdirin
        //Kullanici negatif deger girerse uyaralim

        // not: birden fazla if-else if birbirine baglanmişsa son durum önemlidir
        //eger else ile bitiyorsa butun ihtimaller kapsaniyor demektir
        //else if ile bitiyorsa kapsanmayan durumlar olabilir


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi girin..");
        int yas= scan.nextInt();

        if (yas<0){
            System.out.println("Lutfen gecerli bir yas girin");
        } else if (yas>=65){
            System.out.println("Emekli olabilirsin"); //else if girdikten sonra bir şart daha girilmeli
        }else {
            System.out.println("Emekli olamazsin "+(65-yas)+" yıl daha calismalisin");//else varsa olay biter sart yok
        }

    }
}
