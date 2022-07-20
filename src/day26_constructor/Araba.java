package day26_constructor;

public class Araba {

    /*-------------------------------- Onceki Dersten Aklimizda Kalanlar -----------------------------------------
      1- Constructor : Java'nin obje olusturmak icin kullandigi kod blogudur.Bir constructor calismadan, obje olusmasi
      mumkun degildir.
      2- Bir class olusturdugumuzda, java o class'tan obje olusturulmasini saglamak icin her class'a default constructor
      koyar.Default constructor gorunmez,parametresi yoktur,constructor body'sinde extra bir kod yoktur.
      3- Biz constructor'dan spesifik ozelliklere sahip bir obje istiyorsak bunu parametre ile constructor'a iletmemiz
      veya objeyi base ozelliklerde olusturup sonra istedigimiz degerleri atamamiz gerekir.
      4- Biz de constructor olusturabiliriz,urettigimiz constructor ister parametreli, isterse de default constructor
      gibi parametresiz olsun,biz olusturdugumuzda Java default constructor'i siler.
      5- Her obje olusturuldugunda, obje olusturulan class'daki temel atamalara sahip olur. Bir objenin herhangi bir
      ozelliginin degerini bulmak istedigimizde Java su siralamaya bakar;
          1) Obje olusturulduktan sonra deger atanmis mi ?
          2) 1. madde yoksa ,obje olusturulan class'a gidip o variable'a atanmis bir deger var mi?
          3) 2 secenek de yoksa Java'nin data turune gore belirledigi default degeri alir.
      6- Constructor ismi class ismi ile ayni olmalidir,costructor isminden sonra () ve varsa parametreler,
      ve sonra da {} constructor body olmalidir.
       */
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
