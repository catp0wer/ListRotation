import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    //private static Logger LOGGER = Logger.getLogger("InfoLogging");
    private final static Logger LOG = LoggerFactory.getLogger(App.class);
    public static void main(String[] args){
      //  LOGGER.setLevel(Level.FINE);
      //  LOGGER.info("Logging an INFO-level message");
        LOG.info("sad"); //non-static field cannot be referenced in a static context
        Rotation result = new Rotation();
        ArrayList<Integer> myList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("Enter the number of rotations: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfRotations = scanner.nextInt();

        myList=result.Rotate(numberOfRotations,myList);
        System.out.println("My rotated list is: " + myList);
    }

//    public void submain(){
//        LOG.info("initializing");
//        Rotation result = new Rotation();
//        ArrayList<Integer> myList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
//        System.out.println("Enter the number of rotations: ");
//        Scanner scanner = new Scanner(System.in);
//        int numberOfRotations = scanner.nextInt();
//
//        myList=result.Rotate(numberOfRotations,myList);
//        System.out.println("My rotated list is: " + myList);
//    }
}
