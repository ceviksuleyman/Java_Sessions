package day27_consCall_StaticKeyword;

public class C01_ConsCall {


    int x = 3;
    int y = 5;

    public C01_ConsCall() {   // parametresiz constructor

        x += 1; // 3 + 1 = 4
        System.out.println("-x" + x); // -x4

    }

    public C01_ConsCall(int i) {  // tek parametresi olan constructor
        this(); // buraya gelince de parametresiz constructor'cagirdi o satira gider

        this.y = i;   // i=3

        x += y;  // 4 + 3 = 7

        System.out.println("-x" + x); // -x7

    }

    public C01_ConsCall(int i, int i2) {  // iki parametresi olan constructor  // maindan ilk bu satir calisti
        this(3);  //  tek parametresi olan constructoru cagirdi ve o satira gitti

        this.x -= 4; // 7 - 4 = 3

        System.out.println("-x" + x); // -x3

        //this. diyorsa , instance (obje uzerindeki variable'a bakiyoruz)
    }

    public static void main(String[] args) {

        C01_ConsCall mc1 = new C01_ConsCall(4,3);

    }

}
