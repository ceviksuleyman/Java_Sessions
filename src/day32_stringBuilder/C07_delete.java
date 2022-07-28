package day32_stringBuilder;

public class C07_delete {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java her zaman guzel");

        sb.delete(8,9);

        System.out.println("sb = " + sb);// Java herzaman guzel

        sb.deleteCharAt(7);

        System.out.println("sb = " + sb);// Java hezaman guzel

        // bastan baslayarak her loop'da ilk harfi silip kalani yazdiralim

        int son = sb.length();

        for (int i = 0; i < son; i++) {

            sb.deleteCharAt(0);

            System.out.println("sb = " + sb);

        }

        //socrarive soru Interview
        StringBuilder sb1 = new StringBuilder("OCAJP8");

        sb1.subSequence(2, 4);

        sb1.deleteCharAt(3);

        sb1.reverse( );

        System.out.println(sb1);
    }
}
