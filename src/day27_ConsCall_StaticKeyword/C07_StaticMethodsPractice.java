package day27_ConsCall_StaticKeyword;

public class C07_StaticMethodsPractice {

    int count;
    static int stCount;

    public C07_StaticMethodsPractice(){  // parametresiz constructor
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

        C07_StaticMethodsPractice cs1 = new C07_StaticMethodsPractice();
        C07_StaticMethodsPractice cs2 = new C07_StaticMethodsPractice();
        C07_StaticMethodsPractice cs3 = new C07_StaticMethodsPractice();
        C07_StaticMethodsPractice cs4 = new C07_StaticMethodsPractice();
        C07_StaticMethodsPractice cs5 = new C07_StaticMethodsPractice();
        C07_StaticMethodsPractice cs6 = new C07_StaticMethodsPractice();

        System.out.println(cs6.getCount());
        System.out.println(cs6.getStCount());
    }
}
