package day13_14_methodCreation;

public class C01_MethodCreation {

    public static void main(String[] args) {

        /*
        input olarak verilen 2 integer'i toplayip sonucunu yazdiran bir method olusturun
         */
        int input1=10;
        int input2=20;
        /*
        Method 4 adimda olusturulur,
        1-method call
        2- argument eklenmesi gerekiyorsa ekleyelim eger methodun return type'i void'den farkli olacaksa
        bir variable olusturup,method call'u assign edelim
         */
        topla(input1,input2);

    }

    public static void topla(int input1, int input2) {
        /*
        3-method deklarasyonunda degistirilmesi gereken bolumleri degistir(access modifier,return type vb..)
        4-eger return type void disinda birseyse return keyword'u ve donecek degeri hesaplamaliyiz
         */
        System.out.println("girilen iki sayinin toplami: "+(input1+input2));
    }

}
