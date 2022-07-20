package day26_constructor;

public class Kamyon {

    public String marka = "Marka Belirtilmedi.";
    public String model = "Model Belirtilmedi.";

    public int yil;
    public int fiyat;

    public Kamyon(String marka, String model, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
        /*
          Bizim temel amacimiz KamyonRun class'inda argumant olarak girilen degerin Kamyon class'inda
        instance variable'a atanmasi.
          Ancak Scope konusunda ogrendigimiz gibi Kamyon Constructor scope'unda marka oldugu icin instance
        markaya gitmiyor.
          Bu karisikligi gidermek icin instance variable'lari belirli hale getirmemiz lazim , Java
        bunun icin this. Keyword'u olusturmustur.

          Genel kullanim acisindan this keyword'u kodu herkesin anlamasini kolaylastirdigi icin tercih edilir.
         */

    }

    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Kamyon(){

    }

    @Override
    public String toString() {
        return
                "\nmarka : " + marka +
                "\nmodel : " + model +
                "\nyil   : " + yil   +
                "\nfiyat : " + fiyat;
    }

}
