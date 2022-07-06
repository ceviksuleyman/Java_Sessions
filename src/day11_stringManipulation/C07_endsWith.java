package day11_stringManipulation;

public class C07_endsWith {

    public static void main(String[] args) {

        /*
         Kullanicidan email adresini girmesini isteyin,
         mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
         @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
         @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
         */
        String input="suleyman@gmail.com";

        if (!input.contains("@gmail.com")){
            System.out.println("Lutfen gmail adresi giriniz...");


        } else if (input.endsWith("@gmail.com")) {
            System.out.println("email adresiniz kaydedildi..");


        }else {
            System.out.println("Lutfen yazimi kontrol edin!");
        }

    }
}
