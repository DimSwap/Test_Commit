package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> student = new ArrayList<>();
        student.add("Dima");
        student.add("Damir");
        student.add("Vlad");
        student.add("Olga");
        student.add("Oleg");
        System.out.println(student);
        System.out.println(student.remove(1));
        System.out.println(student.remove(2));
    }
}
