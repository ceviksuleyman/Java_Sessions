package day17_nestedForLoop;

public class C07_WhileLoop {

    public static void main(String[] args) {
        /*
          WhileLoop:baslangic degeri, bitis sarti ve artis azalis  forloop gibi
          while loop'da da olmak zorunda
         */
        int input=0;

        while (input<=5){

            System.out.print(input+" ");

            input++;
        }
        System.out.println("");

        /*
        20 den 50(sinirlar dahil) ye cift sayilari yazdirin
         */

        int baslangic=20;
        int bitis=50;

        for (int i = baslangic; i <=bitis ; i++) {

            if (i%2==0){

                System.out.print(i+" ");
            }
        }
        System.out.println("");


        int temp=baslangic;

        while (temp<=bitis){

            if (temp%2==0){
                System.out.print(temp+" ");
            }
            temp++;
        }



    }
}
