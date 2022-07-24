package day27_consCall_StaticKeyword;

public class C02_ConsCall {

    //Class calistirildinda output ne olur ?

    public static void swing(){    //method 1 static

        System.out.print("swing ");

    }
    public void climp(){    // method 2 static DEGIL

        System.out.println("climp ");

    }
    public static void play(){  // method 3 static

        swing(); //swing method'unu cagirdi ve static method oldugu icin swing method'una gitti
        // climp(); //climp method'u static olmadigi icin static olan bir method'dan cagiramayiz CTE verir.

    }

    public static void main(String[] args) {

        C02_ConsCall call = new C02_ConsCall();  // default constructor calisir tum degerler standart

        call.play(); // objeler uzerinden variable'lara ulasabildigimiz gibi method'lara da ulasabiliriz.

        C02_ConsCall call2 = null;

        call2.play();
    }


}
