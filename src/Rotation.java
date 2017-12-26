import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Rotation {
    private static final int FIRST = 0;

    private static Logger LOGGER = Logger.getLogger("InfoLogging");
    static{
        LOGGER.setLevel(Level.FINE);
    }
   // LOGGER.setLevel(Level.FINE);
    public ArrayList<Integer> Rotate(int numberOfRotations, ArrayList<Integer> myList) {
        int count = 0;
        for (int i = 0; i < numberOfRotations; i++) {
            int temp = myList.get(FIRST);
            myList.add(temp);
            myList.remove(FIRST);

            LOGGER.fine(myList.toString());
           // System.out.println(myList);

        }return myList;




    }
}