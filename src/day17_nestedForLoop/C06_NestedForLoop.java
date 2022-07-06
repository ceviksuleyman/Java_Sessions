package day17_nestedForLoop;

public class C06_NestedForLoop {

    public static void main(String[] args) {
        /*
        verilen String'i asagidaki gibi yazdiran bir program yazin
          input="Cevik"
          C
          C e
          C e v
          C e v i
          C e v i k
          C e v i
          C e v
          C e
          C
     */
        String input="Istabul";

        for (int i = 1; i <=input.length() ; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print(input.substring(j-1,j )+" "); // substring ile ilk harf almak icin (0,1)
            }
            System.out.println(" ");
        }

        for (int i = input.length()-1; i >=1 ; i--) {

            for (int j = 1; j <=i ; j++) {  //String ifade oldugu icin yine bastan basliyoruz

                System.out.print(input.substring(j-1,j )+" "); // substring ile ilk harf almak icin (0,1)
            }
            System.out.println(" ");
        }

    }
}
