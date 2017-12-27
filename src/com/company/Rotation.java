package com.company;

import java.util.ArrayList;
import java.util.Arrays;

class Rotation {
    private static final int FIRST = 0;

    ArrayList<Integer> Rotate(int numberOfRotations, ArrayList<Integer> myList) {
        numberOfRotations = numberOfRotations % myList.size();
        int count = 0;
        for (int i = 0; i < numberOfRotations; i++) {
            int temp = myList.get(FIRST);
            myList.add(temp);
            myList.remove(FIRST);
            System.out.println(myList);

        }return myList;




    }
}