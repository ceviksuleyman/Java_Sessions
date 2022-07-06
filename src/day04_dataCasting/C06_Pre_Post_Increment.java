package day04_dataCasting;

public class C06_Pre_Post_Increment {
    public static void main(String[] args) {

        int sayi=10;


        System.out.println("pre-increment : "+ ++sayi); //11     //ilk önce artırma sonra yazdırma


        System.out.println("post-increment : "+ sayi++); //11     // ilk once yazdırma sonra artırma
                                                                   //yani sayi=12 olcak

        System.out.println("post-increment'den sonra : "+sayi);//12   //yeni ataması 12 oldu

    }
}
