import java.util.*;

//Java class
public class DebugEleven4 {

    static Scanner input = new Scanner(System.in);
    static DebugBoat[] boatArray = new DebugBoat[5];

    public static void main(String[] args) {
        buildArray();   // buildArray is method parenthesis is missing
        displayArray(); // displayArray is method parenthesis is missing
    }

    public static void buildArray() {
        char boatType;

        // data type of x is missing
        for (int x = 0; x < boatArray.length; ++x) {
            boatType = getBoat();
            if (boatType == 'r')
                // new keyword is missing
                boatArray[x] = new DebugRowboat();
            else
               boatArray[x] = new DebugOceanLiner();
        }
    }

    public static char getBoat() {
        String boatType;
        System.out.println("Enter r for rowboat; o for ocean liner ");
        boatType = input.next();
        return boatType.charAt(0);
    }

    public static void displayArray() {
        // increment decrement is missing
        for (int x = 0; x < boatArray.length; ++x)
            System.out.println("Boat #" + (x + 1) + " " + boatArray[x].toString());
    }
}
