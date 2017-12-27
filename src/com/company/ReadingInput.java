package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

class ReadingInput {

    int fromKeyboard() {
        System.out.println("Enter the number of rotations: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    ArrayList<Integer> ReadFile(String filePath) {

        String line = "";

        ArrayList<Integer> listFromFile = new ArrayList<>();
        try {
            FileReader inputFile = new FileReader(filePath);
            BufferedReader bufferReader = new BufferedReader(inputFile);
            int row = 0;
            while ((line = bufferReader.readLine()) != null) {

                System.out.println(line);
                String [] elements = line.split("\\s+");

                for(String i: elements){
                    listFromFile.add(Integer.parseInt(i));
                }
            }
            System.out.println("The array from file is: ");
            System.out.println(listFromFile);
            bufferReader.close();

        } catch (Exception e) {

            String exceptionDetails = e.toString() + "\n";
            StackTraceElement[] trace = e.getStackTrace();
            for (StackTraceElement i: trace) {
                exceptionDetails += i.toString() + "\n";
            }
            System.out.println("Error while reading file line by line:" + exceptionDetails);
        }
        return listFromFile;
    }
}


