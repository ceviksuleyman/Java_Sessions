package day33_encapsulation;

public class Tasit {

    private String tasitTuru;
    private boolean muayenesiVarMi;
    private int yil;

    // Eger sadece setter method olusturulursa data degerleri degistirilebilir ama ilk atanan
    // deger veya bizim atadigimiz yeni deger baska class'lardan okunamaz.

    public String getTasitTuru() {
        return tasitTuru;
        // getter method'u da tek bir satirlik islem yapiyor.
        // Baska class'larin private oldugu icin erisemedigi tasitTuru bilgisini class icinden
        // alip istenen farkli class'lara return ediyor.
    }

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
        // return olmadigi icin bu method'un cagrildigi TasitRun class'inden yazdirilamaz
        // burada bir satirlik islem yapiyor o bir satirlik islem de bizim gonderdigimiz
        // parametreyi instance variable'a atiyor.
    }

    public boolean isMuayenesiVarMi() {
        return muayenesiVarMi;
        //boolean variable'lar icin olusturulan getter method'larinin ismi isVariableIsmi
        //seklinde olur.
    }

    public void setMuayenesiVarMi(boolean muayenesiVarMi) {
        this.muayenesiVarMi = muayenesiVarMi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

}
