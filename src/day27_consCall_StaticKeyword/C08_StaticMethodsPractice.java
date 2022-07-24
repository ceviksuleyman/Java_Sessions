package day27_consCall_StaticKeyword;

public class C08_StaticMethodsPractice {

    int number;
    String name;
    static String college = "ITS";

    C08_StaticMethodsPractice(int r, String n, String college){
        this.number = r;
        this.name = n;
        this.college = college;

    }

    public static void main(String[] args) {

        C08_StaticMethodsPractice s1 = new C08_StaticMethodsPractice(111,"Karan","MIT");
        C08_StaticMethodsPractice s2 = new C08_StaticMethodsPractice(222,"Aryan","Harvard");

        System.out.println(s1.number);
        System.out.println(s2.number);

        System.out.println(s1.name);
        System.out.println(s2.name);

        System.out.println(s1.college);
        System.out.println(s2.college);
    }
}
