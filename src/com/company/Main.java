package com.company;

import java.util.*;

public class Main {
    static int key = 0;

    public static void main(String[] args) {

        List<String> student = new ArrayList<>();
        student.add("Dima");
        student.add("Damir");
        student.add("Vlad");
        student.add("Olga");
        student.add("Oleg");
        System.out.println(student);
        System.out.println("==========================================");
        student.remove(1);
        student.remove(2);
        System.out.println(student);
        System.out.println("==========================================");
        List<String> student_group_2 = new ArrayList<>(List.copyOf(student));
        student_group_2.add("Den");
        student_group_2.add("Maks");
        System.out.println(student_group_2);
        System.out.println("размер "+student_group_2.size());
        System.out.println("==========================================");
        Map<Integer, Object> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            map.put(i, student_group_2.get(key));
            key++;
            System.out.println(map+" hashCode = "+map.hashCode()+";");
            map.clear();
        }
        System.out.println("==========================================");
        List<String> subject = new ArrayList<>(List.copyOf(student));
        subject.add("ОП");
        subject.add("ТФГТ");
        subject.add("Высш Мат");
        subject.add("История");
        System.out.println(subject);
        System.out.println("размер "+subject.size());
        System.out.println("==========================================");
    }

}
