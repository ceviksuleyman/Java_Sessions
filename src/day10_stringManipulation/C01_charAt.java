package day10_stringManipulation;

public class C01_charAt {

    public static void main(String[] args) {


        String str="Java ogrenmek ne guzel";

        System.out.println(str.charAt(0));  // ilk harfi yazdirir

        System.out.println(str.toUpperCase().charAt(7)); //R atama olmadigi icin sadece bu output icin buyuk harf oldu

        System.out.println(str.charAt(21)); //  l

        //System.out.println(str.charAt(22));  //StringIndexOutOfBoundsExpection
        //son harfi bulmak icin str'in uzunlugunun 1 eksigini index olarak gireriz
        //eger index olarak uzunlugu veya daha buyuk bir sayiyi girersek java expection verir..

        //charAt() method'u kullandigimizda sonuc char olacagi icin artik manipulation yapamayizzzz...
        //String method'larindan kullanmamiz gereken bir method varsa charAt()'den once kullanmaliyiz...





    }
}
