package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static void main(String[] args){
       String filePath = "D:\\Git_projects\\ListRotation\\List.txt";
       ReadingInput fileList = new ReadingInput();
       ArrayList<Integer> readList = fileList.ReadFile(filePath);

        Rotation result = new Rotation();
        ReadingInput input = new ReadingInput();
        int nbRotFromKeyboard = input.fromKeyboard();

        ArrayList<Integer> myList=result.Rotate(nbRotFromKeyboard,readList);
        System.out.println("My rotated list is: " + myList);
    }
}
