package day18_while_doWhileLoop;

public class C03_DoWhileLoop {

    public static void main(String[] args) {

        int sayi=7;

        while (sayi < 10) {           // while loop once sart kontrolu yapar sonra islem yapar,
                                     //islem bittikten sonra loop'un kirilmasi icin bir kez daha basa doner fazladan
                                    //bir islem yapar...
            System.out.println(sayi); //7 8 9

            sayi++;  // artis olmazsa sonsuz donguye girer !!!!!!

        }
        /*
        do-while loop ile bu dezavantaj ortadan kalkar
         */

        int i= 0;

        do {

            System.out.print(i+" "); //0 1 2 3 4
            i++;

        }while (i<5);

    }
}
