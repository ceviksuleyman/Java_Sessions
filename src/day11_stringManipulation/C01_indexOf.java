package day11_stringManipulation;

public class C01_indexOf {

    public static void main(String[] args) {

        //indexOf bize her zaman int dondurur !!!!!!!!!!

        String str1="Java ogrenmek cok guzel";

        System.out.println(str1.indexOf("o"));//5
        System.out.println(str1.indexOf('g'));//6
        System.out.println(str1.indexOf("t"));//-1 //bana integer donduruyor , int' de yok diye bir deger bulunmuyor
                                               //0 dersek j'nin index'idir - bir deger donerse biz aranan String'in
                                               //str1' de olmadigini anlariz Java -1 dondurmeyi tercih etmistir..

        String str5="sdfsdjfhjsdfkjdkdkfkdkfsjkjkdfjkscvc";

        //str5' de p harfi kullanilmis midir ?
        if (str5.indexOf("p")==-1){
            System.out.println("str5 de istenen karakter kullanilmamis");
        }else {
            System.out.println("str5 de istenen karakter kullanilmis..");
        }

    }
}
