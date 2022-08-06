package day42_interfaces;

public class ChildClassOfInterfaces implements I01_Interfaces,I02_Interfaces{
    // birden fazla interface implement yapilabilir.

    /*
    Bir class'i bir interface'e child yapmak icin 'implements' keyword kullanilir.

    impelements dedikten sonra aralarda virgul yazarak istedigimiz kadar interface
    ekleyebiliriz.

    Bir interface bir class'i parent edinemez.
     */


    public static void main(String[] args) {

        System.out.println(I01_Interfaces.SAYI); // 35
        System.out.println(I02_Interfaces.SAYI); // 30
        System.out.println(ISIM); // YILDIZ KOLEJI

    }

    @Override
    public void yakit() {

    }

    @Override
    public void motor() {

    }

    @Override
    public void teker() {

    }
}
