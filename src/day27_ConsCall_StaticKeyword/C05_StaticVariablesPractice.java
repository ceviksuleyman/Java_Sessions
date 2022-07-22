package day27_ConsCall_StaticKeyword;

public class C05_StaticVariablesPractice {

    int x;

    static int y;

    C05_StaticVariablesPractice(int i){ // bir paratmereli constructor

        x += i; // adsiz obje icin x = 2 ----obje1 icin x = 3
        y += i; // adsiz obje icin y = 2 ----obje1 icin y + 3 = 5

    }

    public static void main(String[] args) {

        new C05_StaticVariablesPractice(2); // adsiz bir obje bu objeyle (instance) x = 2  ve (static) y = 2 oldu

        C05_StaticVariablesPractice obj1 = new C05_StaticVariablesPractice(3);// yeni obje x = 3   ve static oldugu icin y=2 olmustu
                                                                 // ilk objede simdi +3 daha oldu ve 5 oldu y = 5


        System.out.println(obj1.x + "," +y); // 3,5
    }
}
