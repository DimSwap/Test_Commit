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
        student.remove(1);
      student.remove(2);
        List<String> student_group_2 = new ArrayList<>(List.copyOf(student));

    }
}
