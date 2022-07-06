package day06_concatenation;

public class C01_Concatenation {

    public static void main(String[] args) {

        //Concatenation-->String Datalari Birlestirme

        String str1= "Java";
        String str2= "Guzeldir";
        int sayi1=5;
        int sayi2=4;

        //yukaridaki variable'lari kullanarak istenen metinleri yazdıralım..

        System.out.println(str1+" "+str2+" "+sayi1+sayi2);//Java Guzeldir 54
        System.out.println(str1+" "+str2+" "+(sayi1+sayi2));//Java Guzeldir 9
        System.out.println(sayi1+sayi2+" "+str1);// 9 Java
        System.out.println(""+sayi1+sayi2+" "+str2);//54 Guzeldir
        System.out.println(str2+" "+str1+" "+sayi2+" "+sayi1); //Guzeldir Java 4 5

        str1.concat(str2);
        System.out.println(str1.concat(str2));//JavaGuzeldir
        System.out.println(str1.concat(" ").concat(str2)); //Java Guzeldir
        //Stringlerde + yerine .concat da birleştirme isleminde
        //method olarak kullanilabilir


    }
}
