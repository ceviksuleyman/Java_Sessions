package day27_consCall_StaticKeyword;

public class C03_StaticKeyword {

    /*---------------------- Onceki Dersten Aklimizda Kalanlar --------------------------------------------
    1- Parametreli constructor'lar : Eger default constructor kullanirsak objemizi olusturabilir,ancak tum
    ozellikleri defult olarak gelir.Bu sekilde olusturulan objelere istedigimiz degerleri atayabilmek icin
    tek tek atama yapmamiz gerekir.
    2- Parametresiz bir constructor ile obje olusturup, tum ozellikleri tek tek atamak yerine constructor'i
    parametreli yapip, o constructor icinde atamalarimizi yapabiliriz. Bu atamalari yaparken instance variable'lara
    parametre olarak gonderdigimiz degerleri atamaliyiz.
    3- Scope konusundan hatirlayacagimiz gibi,bir scope'da marka yazarsak, java o scope'da marka variable'i
    varsa onu kullanir. Instance variable'lari java'nin ayirt edebilmesi icin this. keyword'u kullanilir.
    4- this. keyword'u constructor icin kullanilir ve this.variableIsmi seklinde yazildiginda, instance variable'a gider.
    5- this() ise constructor icinden baska bir constructor cagirmak icin kullanilir.Uygulamada bu cok kullanilmaz,
    ancak OOP'nin 4 temel ozelliginden biri olan Inheritance'i anlamamiz icin oncelikle this() kullanimini anlamamiz
    gereklidir.
    6- this contructor call icin 2 onemli kural vardir;
       1. this() constructor call, bulundugu constructor'in ilk satirinda olmak ZORUNDADIR !
       2. 1.kuraldan dolayi bir constructor icerisinde 2 tane constructor OLAMAZ !
     */

    static  int sayi = 10;
    int rakam = 5;

    public static void main(String[] args) {
           /*
        Class level'da iki tur variable olusturabiliriz.
           -Static(Class) variable
           -Instance(obje) variable
        * Static variable'lar tum class'dan kullanilabilirken ,instance variable'lar sadece static olmayan method'lardan
        direk kullanilabilir.
        * Instance variable'lara static method'dan ulasmak istersek obje olusturmamiz gerekir.
        * Instance variable'lar obje variable'i oldugu icin herhangi bir satirda instance variable'in degerinin
        ne oldugunu bulmak icin  OBJE OLUSTURULAN SATIRDAN itibaren kod incelenmelidir.
        * Static variable'lar class variable'lar class variable'i oldugu icin herhangi bir satirda,static variable'in
        degerini bulmak icin CLASS'IN BASINDAN itibaren kod incelenmelidir.
         */
        C03_StaticKeyword obj1 = new C03_StaticKeyword();  // obje1

        System.out.println("obj1'in rakam degeri : "+obj1.rakam); // 5
        System.out.println("obj1'in sayi degeri : "+sayi); //10  obje olusturmadan ulasabiliriz sayi zaten static!

        obj1.rakam +=1;// 5 + 1 = 6 // instance(obje) variable'a obje kullanmadan islem yapamazsin
        sayi += 1;// 10 + 1 = 11 static (class) variable oldugu icin obje olusturmadan islem yapabilirim.

        System.out.println("1 artirdiktan sonra obje1'in rakam degeri : "+obj1.rakam);// 6
        System.out.println("1 artirdiktan sonra obje1'in sayi degeri : "+sayi);// 11


        C03_StaticKeyword obj2 = new C03_StaticKeyword();  // obje2

        System.out.println("obje2'in rakam degeri : "+obj2.rakam);// 5
        System.out.println("obje2'in sayi degeri : "+sayi); //obj2.sayi yazsak da kabul eder. 11


        obj2.rakam++;// 5 + 1 = 6 instance(obje) variable her objenin basindan itibaren bakilir
        sayi++;// 11 + 1 = 12   static variable class'in en basindan kontrol edilir.

        System.out.println("1 artirdiktan sonra obje2'nin rakam degeri : "+obj2.rakam);// 6
        System.out.println("1 artirdiktan sonra obje2'nin sayi degeri : "+sayi);// 12

    }
}
