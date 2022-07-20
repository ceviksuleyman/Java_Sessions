package day26_constructor;

public class Ogretmen {

    String isim = "Isım Belirtilmedi.";
    String soyisim = "Soyisim Belirtilmedi.";
    String dogumTarihi = "Tarih Belirtilmedi.";
    String brans = "Brans Belirtilmedi.";
    String yanBrans = "Yan Brans Belirtilmedi.";

    public Ogretmen() {

    }

    public Ogretmen(String isim, String soyisim, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;
    }

    public Ogretmen(String isim, String soyisim, String dogumTarihi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return
                "\nIsim        : " + isim +
                "\nSoyisim     : " + soyisim +
                "\nDogumTarihi : " + dogumTarihi +
                "\nBrans       : " + brans +
                "\nYanBrans    : " + yanBrans;
    }
}
