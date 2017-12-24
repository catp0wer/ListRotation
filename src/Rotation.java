import java.util.ArrayList;
import java.util.Arrays;

public class Rotation {
    private static final int FIRST = 0;

    public ArrayList<Integer> Rotate(int numberOfRotations, ArrayList<Integer> myList) {
        int count = 0;
        for (int i = 0; i < numberOfRotations; i++) {
            int temp = myList.get(FIRST);
            myList.add(temp);
            myList.remove(FIRST);
            System.out.println(myList);

        }return myList;




    }
}