package day35_inheritancedaConstructorOlusturma.toyota;

public class DizelCorolla extends Corolla {

    DizelCorolla(){
        System.out.println("DizelCorolla parametresiz constructor.");
    }

    DizelCorolla(String isim){
        super(isim);// ilk satirda parametreli super olusturduk ve Corolla parametreliye gitti
        System.out.println("DizelCorolla parametreli constructor.");
    }

    public static void main(String[] args) {

        DizelCorolla obje1 = new DizelCorolla("murtaza");



    }
}
