package day26_constructor;

public class OgretmenRun {

    public static void main(String[] args) {

        Ogretmen ogretmen1 = new Ogretmen();
        System.out.println("*** Ogretmen 1 ***"+ogretmen1);


        Ogretmen ogretmen2 = new Ogretmen(
                "Suleyman",
                "Cevik",
                "1.1.1993",
                "Economics",
                "Java");
        System.out.println("*** Ogretmen 2 ***"+ogretmen2);


        Ogretmen ogretmen3 = new Ogretmen("Java","Cevik","1.1.1999");
        System.out.println("*** Ogretmen 3 ***"+ogretmen3);

    }
}
