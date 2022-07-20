package day26_constructor;

public class MyConstructor {


    int x ;
    String y = "cevik";

    public MyConstructor() {

        System.out.println("-x" + x);

    }

    public MyConstructor(String y){

        System.out.println(y);

    }

    public MyConstructor(int x) {
        this(); // this()bir constructorden digerini cagirmak icin kullanilir
        // cagrildigi constructorun ilk satirina yazilmalidir !!!
        // bir constructor icinede sadece 1 tane constructor cagrilabilir
        System.out.println("-x" + x);

    }

    @Override
    public String toString() {
        return
                "x : "+x+
                "y : "+y;
    }
}
