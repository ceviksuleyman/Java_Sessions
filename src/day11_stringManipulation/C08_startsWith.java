package day11_stringManipulation;

public class C08_startsWith {

    public static void main(String[] args) {

        String input="Java gun gectikce guzellesiyor";

        System.out.println(input.startsWith("J"));//true

        System.out.println(input.startsWith(""));//true

        System.out.println(input.startsWith("gun",5)); //true

    }
}
