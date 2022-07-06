package day17_nestedForLoop;

import java.util.Scanner;

public class C04_NestedForLoop {

    public static void main(String[] args) {
        /*
        verilen input'a gore *'lardan olusan bir ucgen olusturun
          ornek input=4
          *
          * *
          * * *
          * * * *
    */
        Scanner scan=new Scanner(System.in);
        System.out.println("Ucgenin kac satir olacagini girin..");
        int input= scan.nextInt();

        for (int i = 1; i <=input ; i++) { //satir sayisi

            for (int j = 1; j <=i ; j++) {  // her turda i kadar satira * yaziyor

                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
