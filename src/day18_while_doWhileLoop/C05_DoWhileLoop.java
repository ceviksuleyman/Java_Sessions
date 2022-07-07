package day18_while_doWhileLoop;

public class C05_DoWhileLoop {

    public static void main(String[] args) {
        /*
             9'dan 190'a kadar 7'nin kati olan tum tamsayilari ekrana yazdirin.
         */
        int baslangic=9;
        int bitis=190;

        int temp=baslangic;
        //======while loop ile ======
        while (temp < bitis) {

            if (temp % 7 == 0) {

                System.out.print(temp+" ");
            }
            temp++;
        }
        System.out.println("");
        //=====do-while loop ile=====
        temp=baslangic;
        do {
            if (temp % 7 == 0) {

                System.out.print(temp+" ");
            }
            temp++;

        }while (temp<bitis);
    }
}
