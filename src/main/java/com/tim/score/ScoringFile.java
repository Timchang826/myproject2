package com.tim.score;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoringFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("scores.txt");
            int data = fileReader.read();
            while (data != -1){
                System.out.println((char)data);
                data = fileReader.read();
            }
        }catch (FileNotFoundException e){
            System.out.println("File Not Found");
        }catch (IOException e){
            System.out.println("File Read Fall");
        }
        System.out.println("testing");

    }
}
