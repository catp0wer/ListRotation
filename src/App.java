import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args){
        Rotation result = new Rotation();
        ArrayList<Integer> myList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("Enter the number of rotations: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfRotations = scanner.nextInt();

        myList=result.Rotate(numberOfRotations,myList);
        System.out.println("My rotated list is: " + myList);
    }
}
