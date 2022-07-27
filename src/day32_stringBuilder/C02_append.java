package day32_stringBuilder;

public class C02_append {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java daha ne yapsin");

        sb.append("?");

        // append istedigimiz String'i sona ekler
        System.out.println("sb = " + sb);// Java daha ne yapsin?

        // araya ekleme yapmak istedigimizde append() degil insert() kullanmaliyiz.
        sb.insert(4," herseyi dusunmus"); // Java herseyi dusunmus, daha ne yapsin?

        System.out.println("sb = " + sb);

        sb.insert(22,"valla valla",5,11);

        System.out.println("sb = " + sb); // Java herseyi dusunmus, valla daha ne yapsin?



    }
}
