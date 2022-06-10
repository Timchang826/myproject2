package com.tim.score;

import java.util.ArrayList;

public class Scoring {
    public static void main(String[] args) {
        Student matt = new Student("Matt", 60, 70);
        Student rayy = new Student("Rayy", 59, 58);
        Student s = new Student();
        Student s1 = new Student("mattt");
        Student s2 = new Student("hi", 0, 0);
        GraduateStudent hank = new GraduateStudent("Hank", 60, 70, 79);
        ArrayList<Student> students = new ArrayList<>();
        students.add(matt);
        students.add(rayy);
        students.add(hank);
        students.add(s);
        for(int i = 0; i < students.size() ; i++){
            Student stu = students.get(i);
            stu.print();
        }

    }
}
