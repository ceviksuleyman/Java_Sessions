package day07_ifStatements;

import java.util.Scanner;

public class C05_IfElseStatements {

    public static void main(String[] args) {

        //kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter girin..");
        char harf=scan.next().charAt(0);

        if((harf>='a' && harf<='z') || (harf>='A' && harf<='Z')){
            System.out.println("girilen karakter harf: "+harf);
        }else {
            System.out.println("Girilen karakter harf değil");
        }


    }
}
