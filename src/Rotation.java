import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Rotation {
    private static final int FIRST = 0;

    private final static org.slf4j.Logger LOG = LoggerFactory.getLogger(Rotation.class);
    public ArrayList<Integer> Rotate(int numberOfRotations, ArrayList<Integer> myList) {
        int count = 0;
        for (int i = 0; i < numberOfRotations; i++) {
            int temp = myList.get(FIRST);
            myList.add(temp);
            myList.remove(FIRST);

            LOG.info(myList.toString());
           // System.out.println(myList);

        }return myList;




    }
}