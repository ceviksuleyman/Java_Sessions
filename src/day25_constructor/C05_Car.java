package day25_constructor;

public class C05_Car {
    /*
    Bu class bizim kaliphanemiz,bir araba olusturmak icin ihtiyacimiz olan variable
    ve method'lari bu class'da belirleriz,sonra farkli class'larda araba olusturmamiz gerekirse bu class'dan
    bir object olusturup burada belirlenen veriable methodlara gore araba uretiriz.
     */

    public String marka = "Marka Belirtilmedi.";
    public String model = "Model Belirtilmedi.";

    public int yil;
    public int fiyat;

    public void benzinliArac(){

        System.out.println("Bu arac benzinli motora sahiptir.");
    }
    public void maxHiz(int hiz){

        System.out.println("Bu araba max "+hiz+" km hiz yapar.");
    }

}
