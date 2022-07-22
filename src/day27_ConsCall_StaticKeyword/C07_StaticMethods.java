package day27_ConsCall_StaticKeyword;

public class C07_StaticMethods {

    int count;
    static int stCount;

    public C07_StaticMethods(){  // parametresiz constructor
        count++;
        stCount++;
    }

    public int getCount(){ // static olmayan method

        return count;
    }

    public static int getStCount(){ // static method

        return stCount;
    }

    public static void main(String[] args) {

        C07_StaticMethods cs1 = new C07_StaticMethods();
        C07_StaticMethods cs2 = new C07_StaticMethods();
        C07_StaticMethods cs3 = new C07_StaticMethods();
        C07_StaticMethods cs4 = new C07_StaticMethods();
        C07_StaticMethods cs5 = new C07_StaticMethods();
        C07_StaticMethods cs6 = new C07_StaticMethods();

        System.out.println(cs6.getCount());
        System.out.println(cs6.getStCount());
    }
}
