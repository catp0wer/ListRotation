import java.util.ArrayList;
import java.util.Arrays;

public class Rotation {

    public void Rotate() {
        ArrayList<Integer> myList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));

        for (int i = 0; i < 1; i++) {
            int temp = myList.get(i);
            myList.add(temp);
            myList.remove(i);
            System.out.println(myList);
        }

    }
}