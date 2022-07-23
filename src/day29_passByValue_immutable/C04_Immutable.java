package day29_passByValue_immutable;

public class C04_Immutable {

    public static void main(String[] args) {
           /*
          Immutable : degistirelemez class, objeleri bir kez olusturduktan sonra degistiremedigimiz class'lar
          mutable   : degistirilebilir , tam tersi olusturdugumuz objeleri degistirebildigimiz class'lardir.

          en meshur immutable class : String
         */
        String str = "Yildiz Bank";

        System.out.println(str.toUpperCase()); // YİLDİZ BANK sadece bu satir icin

        str.toLowerCase(); // sadece bu satir icin gecerlidir.

        System.out.println(str); // Yildiz Bank

        str.substring(3,5); // Sout icinde yazarsak    `di`

        System.out.println(str);// Yildiz Bank


        // Java'da String gibi metin ifadelerde kullanabilecegimiz mutable StringBuilder class'i da vardir.

        StringBuilder sb = new StringBuilder("Java Bank");

        System.out.println(sb);// Java Bank

        sb.reverse();

        System.out.println(sb);// knaB avaJ

        sb.append(".");

        System.out.println(sb); // knaB avaJ.

    }
}
