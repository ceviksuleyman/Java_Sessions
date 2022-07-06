package day11_stringManipulation;

import java.util.Scanner;

public class C04_contains {

    public static void main(String[] args) {

        /* contains---> char method'u icin kullanilamaz sadece String kullanmak zorunludur..
        Verilen String'in istenen karakter(ler)i icerip icermedigini kontrol eder true false

          Kullanicidan email adresini girmesini isteyin,
         mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
         @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
         @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("email adresini girin.");
        String email=scan.nextLine();

        if (!email.contains("gmail.com")){
            System.out.println("Lutfen gmail adresi girin");


        } else if (email.lastIndexOf("@gmail.com")==email.length()-10) {
            System.out.println("gmail adresiniz kaydedildi");


        }else {
            System.out.println("Lutfen yazimi kontrol edin");
        }



    }
}
