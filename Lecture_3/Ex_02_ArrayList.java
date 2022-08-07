package Lecture_3;

import java.util.ArrayList;

public class Ex_02_ArrayList {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(123);
        //list.add("1234");

        for (Object o : list) {
            System.out.println(o);
        }
    }
}
