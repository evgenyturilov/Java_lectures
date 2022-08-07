package Lecture_3;

import java.util.ArrayList;
import java.util.List;

public class Ex_04_ListOf {
    public static void main(String[] args) {
        Character value = null;
        List<Character> list1 = List.of('S','e','r','g','e', 'y');
        System.out.println(list1);
        // list1.remove(1);
        System.out.println(list1);

        List<Character> list2 = new ArrayList<Character>();
        list2.add('S');
        list2.add('e');
        list2.add('r');
        System.out.println(list2);
        list2.remove(1);
        System.out.println(list2);
    }
}
