package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_NestedTryCatch {

    public static void main(String[] args) {

        int k;
        try {

            FileInputStream fis = new FileInputStream("src/day39_exceptions/odak.txt");
            while ((k = fis.read()) != -1) {

                System.err.print((char) k);

            }
        } catch (FileNotFoundException e) {  // IOException'in child'i -> FileNotFoundException

            System.out.println("Dosya Bulunamadi.");

        } catch (IOException e) {

            System.out.println("Dosyadan Bilgiler Okunamadi.");
        }

    }
}
