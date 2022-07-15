package day01_variables;

public class C02_Variables {

    public static void main(String[] args) {

        String okul= "Papua Yeni Gine Koleji";

        //aynı isim ve degisken turu ıle ıkıncı defa variable olusturulamaz
        // String okul="Podoso Koleji";

        // int okul= 20;
        // farklı data turude olsa ayni isimle ikinci defa variable olusturulamaz

        //var olan bir variable a yeni deger atayabiliriz

        okul= "Podoso Koleji";

        System.out.println(okul);  // Podoso Koleji

        //yazdırma isleminde acıklama ekleme istersek
        //mesela okul adi: Podoso Koleji yazdiralim

        System.out.println("okul adi :" + okul); //okul adi :Podoso Koleji
        System.out.println("okul adi:" + "okul"); // okul adi: okul

    }
}
