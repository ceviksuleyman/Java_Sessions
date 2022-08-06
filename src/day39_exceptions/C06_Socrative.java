package day39_exceptions;

public class C06_Socrative {


    public static void main(String[] args) {

        //Object obj = new Integer(100);
        //System.out.println((Byte) obj); // ClassCastException


        try {

            calis();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }

    private static void calis() {

        throw new RuntimeException("Coook Calis");

        // throw ile kontrollu exception olustururken parametre olarak istedigimiz hata mesajini girebilir.

    }
}
