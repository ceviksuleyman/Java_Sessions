package day16_forLoop;

import java.util.Scanner;

public class C04_ForLoop {

    public static void main(String[] args) {
          /*
              Kullanicidan 100’den kucuk bir tamsayi isteyin.
              1’den baslayarak girilen sayiya kadar tum sayilari yazdirin.
              Ancak;
              -Sayi 3’un kati ise sayi yerine “Java” yazdirin.
              -Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
              -Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.
           */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 100 den kucuk pozitif bir tamsayi girin...");
        int sayi= scan.nextInt();

        for (int i = 1; i <=sayi ; i++) {

            if (i%3==0 && i%5==0){
                System.out.print("Java Guzeldir"+"\n");
            } else if (i%3==0) {
                System.out.print("Java"+" ");
            } else if (i%5==0) {
                System.out.print("Guzeldir"+" ");
            }else {
                System.out.print(i+" ");
            }
        }


    }
}
