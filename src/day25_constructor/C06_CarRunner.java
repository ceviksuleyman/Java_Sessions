package day25_constructor;

public class C06_CarRunner {

    public static void main(String[] args) {

        // C05 den object1
        C05_Car car1 = new C05_Car(); // default constructer ile objemizi olusturduk gormesek de o bizi gorur :)

        car1.fiyat = 150000;
        car1.yil = 2020;
        car1.marka = "Toyota";

        System.out.println("Car1 Bilgileri\n"
                +"Marka : "+car1.marka+"\n"
                +"Model : "+car1.model+"\n"
                +"Yil   : "+car1.yil+"\n"
                +"Fiyat : "+car1.fiyat);

        car1.benzinliArac();
        car1.maxHiz(180);

        // C05 den object2...
        C05_Car car2 = new C05_Car();

        System.out.println("Car2 Bilgileri\n"
                +"Marka : "+car2.marka+"\n"
                +"Model : "+car2.model+"\n"
                +"Yil   : "+car2.yil+"\n"
                +"Fiyat : "+car2.fiyat);

        /*
        Herhangi bir object uzerinden bir variable yazdirmaya calistigimizda java degeri su siralama ile arar.
        1 - o obje olusturulduktan sonra bir deger atandi mi diye bakar
        2 - Objectin olusturuldugu class'da variable'a bir deger atanmis mi diye bakar
        3 - iki secenekte uygulanmamissa o zaman java data turune gore default degeri atar.
         */
    }
}
