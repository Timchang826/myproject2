package com.tim.score;

import java.io.*;

public class ScoringFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("scores.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while (line != null){
     //           System.out.println(line);
                String[] token = line.split(",");
                String name = token[0];
                int eng = Integer.parseInt(token[1]);
                int math = Integer.parseInt(token[2]);
                Student stu = new Student(name,eng,math);
                stu.print();
                line = reader.readLine();
            }
        }catch (FileNotFoundException e){
            System.out.println("File Not Found");
        }catch (IOException e){
            System.out.println("File Read Fall");
        }
        System.out.println("testing");

    }
}
