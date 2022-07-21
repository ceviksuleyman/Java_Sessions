package day27_ConsCall_StaticKeyword;

public class C04_StaticVariables {

    /*
    1- Class yuklendiginde, memory'de static variable'lar olusturulur.
    Obje olusturulmadan da onlari kullanmamiz gerekebilir.
    2- Static variable'lar bir tane olusturulur ve class'daki tum objeler onu gurur ve kullanir.
    3- Memory kullanimi static variable'lar icin sadece bir kere olur.
    4- Static variable'lar static veya static olmayan method'larin icinde kullanilabilir.
    5- Static variable'lara baska class'lardan sadece class ismi kullanilarak ulasilabilir,obje olusturmaya gerek yoktur.
     */
    static int count = 0;

    public void incerement(){ // static olmayan method

        count++;
    }

    public static void main(String[] args) {

        C04_StaticVariables obj1 = new C04_StaticVariables(); // obje'ler default constructor'la olusturulmus

        C04_StaticVariables obj2 = new C04_StaticVariables();

        obj1.incerement(); // count obje1 ile 1 oldu

        System.out.println(count);// 1

        obj2.incerement(); // static variable oldugu icin obje2 ile count 1 daha artarak 2 oldu

        System.out.println("obj1 icin count : "+count);// 2

        System.out.println("obj2 icin count : "+count);// 2
    }
}
