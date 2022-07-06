package day17_nestedForLoop;

public class C05_NestedForLoop {

    public static void main(String[] args) {
        /*
        verilen input'a gore *'lardan olusan asagidaki sekli olusturun
          *
          * *      input=4;
          * * *
          * * * *
          * * *
          * *
          *
      */

        int input=5;

        for (int i = 1; i <=input ; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print("* ");
            }
            System.out.println(" ");
        }

        for (int i = input-1; i >=1 ; i--) {

            for (int j = i; j >=1 ; j--) {   //i den baslayip 1 kadar gider  j = 1; j <=i ; j++ de olur

                System.out.print("* ");
            }
            System.out.println(" ");
        }


    }
}
