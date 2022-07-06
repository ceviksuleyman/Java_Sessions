package day04_dataCasting;

public class C05_Pre_Post_Increment {

    public static void main(String[] args) {
        //Pre-Post Increment
        int sayi1= 10;
        int sayi2= sayi1+1;    // sayi2-->11

        sayi2+=5; //sayi2 --> 16
        System.out.println("sayi2= "+sayi2);//16
        //Pre veya Post increment veya decrement sadece ++ ve -- islemi icin gecerlidir.
        //Bu iki islem icin sayidan sonra veya once yazılmasına gore farkli iki isleyis olur..


        int sayi3= sayi2++;        //1-sayi2 degeri sayi3 'atanacak
                                   //2- sayi2  1 artirilacak

                                                        //++ veya -- variableden sonra olursa post increment veya
        System.out.println("sayi3= "+sayi3);//16        //decrement olur bu durumda o satırda yapılan ıkı ıslemden
        System.out.println("sayi2= "+sayi2);//17        // artırma veya azalma atamadan sonradır.


        int sayi4=++sayi1;     //1- sayi1 1 artıralacak
                               //2- sayi1 degeri,sayi4 e atanacak..


        System.out.println("sayi4= "+sayi4); //11     //eger ++ veya -- variableden once olursa buna pre increment
        System.out.println("sayi1= "+sayi1); //11     //decrement denir. bu durumda o satirda iki islemden oncelikli
                                                      // olan artırma veya azaltmadır






    }
}
