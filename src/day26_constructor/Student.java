package day26_constructor;

public class Student {


    String name ;
    int age ;
    String phone ;

    public Student() {

    }

    public Student(String name, int age, String phone) {
        this.phone = phone;
        this.name = name;
        //this.age = age;
    }

    @Override
    public String toString() {
        return
                        "\nname  : " + name +
                        "\nage   : " + age +
                        "\nphone : " + phone;

    }
}