package day26_constructor;

public class Araba {

    public String marka = "Marka Belirtilmedi.";
    public String model = "Model Belirtilmedi.";

    public int yil;
    public int fiyat;

    public Araba(String markaRun, String modelRun, int yilRun, int fiyatRun) {

        marka = markaRun;
        model = modelRun;
        yil = yilRun;
        fiyat = fiyatRun;

    }
    public Araba(){  // parametresiz constructor !

    }
    // Biz herhangi bir constructor olusturdugumuz da Java default constructor'i siler.
    // Eger biz projemizde bir sorun yasanmasini istemiyorsak mutlaka default constructor yerine
    // parametresiz bir constructor olusturmaliyiz.

    public void benzinliArac(){

        System.out.println("Bu arac benzinli motora sahiptir.");
    }
    public void maxHiz(int hiz){

        System.out.println("Bu araba max "+hiz+" km hiz yapar.");
    }

}
