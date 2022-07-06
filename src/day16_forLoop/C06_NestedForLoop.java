package day16_forLoop;

public class C06_NestedForLoop {

    public static void main(String[] args) {

        /*Bazen tek degisken sorunu cozmeye yetmez
        *
        * *
        * * *
        * * * *
        * * * * *
         */
        for (int i = 1; i <=3 ; i++) {   //yan yana 3 tane * yaz

            System.out.print("* ");
        }

        System.out.println("");

        for (int i = 1; i <=4 ; i++) {  //yan yana 4 tane * yaz

            System.out.print("* ");
        }

        System.out.println("");

        //bu tur durumlarda ic ice(Nested) loop kullanmak gerekir

        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
