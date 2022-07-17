package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C00_ArrayListiArrayeCevirmek {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("tavsan");
        list.add("horoz");

        System.out.println(list); //[tavsan,horoz]


        //1.yontem
        String[] arr = list.toArray(new String[0]);
        System.out.println(arr.length); // 2
        System. out.println(Arrays. toString(arr)); // [tavsan,horoz]

        //2.yontem
        //Object[] arr = list.toArray();
        //System.out.println(arr.length); // 2
        //System. out.println(Arrays. toString(arr)); // [tavsan,horoz]
    }
}
