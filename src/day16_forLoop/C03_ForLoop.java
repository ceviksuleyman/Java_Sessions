package day16_forLoop;

public class C03_ForLoop {

    public static void main(String[] args) {
        /*
        10 ile 30(dahiller) arasindaki sayilari aralarinda virgul olarak ayni satirda yazdirin
         */

        int baslangic=10;
        int bitis=30;

        for (int i = baslangic; i <=bitis ; i++) {

            if (i<bitis){
                System.out.print(i+",");
            }else {
                System.out.print(i);
            }
        }
    }
}
