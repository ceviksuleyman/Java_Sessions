package day33_encapsulation;

public class Araba {
    String marka = "Marka Belirtilmedi.";//marka'nin access modifier'i default access modifier oldugundan
                                         // package icinde kullanilabilir.

    private String model = "Model Belirtilmedi.";
    // private yaptigimiz model ve yakit variable'larina erisimi yetkilendirelim
    // model'e deger atanabilsin ama gorulemesin (setter)
    // yakit ise gorulebilsin ama yeni deger atanamasin isteniyor(getter)
    private String yakit = "Elektrikli.";// tum arabalar elektrikli ise bu variable'in degistirilmemesi lazim


    public void setModel(String model) {

        this.model = model;
    }

    // NOTE => getter(), data'yi sadece okumamiza yarar,data'da degisiklik yapamaz !!!!
    // NOTE => setter(), baska Class'larda olusturulan objeler icin data degerini degistirmemizi saglar.!!

    public String getYakit() {

        return yakit;
    }
}
