package day07_ifStatements;

import java.util.Scanner;

public class C06_IfElseStatements {

    public static void main(String[] args) {

        //Kullaniciya yaşini sorun eger 65 yaşdan kucuk ise emekli olamazsin,calismalisin
        //65 e esit veya büyükse emekli olabilirsin yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi girin..");
        int yas= scan.nextInt();

        if (yas>=65){
            System.out.println("Emekli olabilirsin");
        }else {
            System.out.println("Emekli olamazsin "+(65-yas)+" yıl daha calismalisin");
        }


    }
}
