package day32_stringBuilder;

public class C02_append_insert {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java daha ne yapsin");

        // StringBuilder'de istedigimiz String'i sona ekler append(),

        sb.append("?");

        System.out.println("sb = " + sb); // Java daha ne yapsin

        sb.append("Java",2,4);

        System.out.println("sb = " + sb);// Java daha ne yapsin?va


        // araya ekleme yapmak istedigimizde append() degil insert() kullanmaliyiz.

        sb.insert(0," herseyi dusunmus,"); // Java herseyi dusunmus, daha ne yapsin?

        System.out.println("sb = " + sb);

        sb.insert(22,"valla valla",5,11);

        System.out.println("sb = " + sb); // Java herseyi dusunmus, valla daha ne yapsin?


        String str = sb.toString().toUpperCase();
        System.out.println("str = " + str);

    }
}
