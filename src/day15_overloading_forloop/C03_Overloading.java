package day15_overloading_forloop;

public class C03_Overloading {

    public static void main(String[] args) {


        topla(7,3);
        topla(5.3,4);//bir double ve bir integer'in toplami: 9.3
        topla(3.5,7.4);//iki double'in toplami: 10.9
        topla(8,6.3);//iki double'in toplami: 14.3 Java otomatik olarak cast eder int double'a gider

    }
    /*
    Java hani method'un calisacagina karar verirken optimizasyon yapar
    * eger hic cast yapmadan kullanabilecegi bir method varsa onu kullanir
    * eger cast yapmadan kullanacagi bir method yoksa,en az cast yaparak
    * kullanabilecegi method'u secer
     */
    public static void topla(int sayi1,int sayi2){
        System.out.println("iki integerin toplami: "+(sayi1+sayi2));
    }
    public static void topla(double sayi1,int sayi2){
        System.out.println("bir double ve bir integer'in toplami: "+(sayi1+sayi2));
    }
    public static void topla(double sayi1,double sayi2){
        System.out.println("iki double'in toplami: "+(sayi1+sayi2));
    }

}
