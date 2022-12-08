// Elin Rudling elru4802

import java.util.ArrayList;

public class AssignmentSevenPointTwo {
    private InputScanner scanner = new InputScanner(System.in);
    private ArrayList<Dog> dogList = new ArrayList<>();

    public void listDogs() {

        if (dogList.size() == 0) {
            System.out.println("Error: no dogs in register");
        } else {
            double smallestTailLength = scanner.inputDouble("Smallest tail length to display");

            ArrayList<Dog> dogsWithCorrectLength = getDogsWithLength(smallestTailLength);

            if (dogsWithCorrectLength.size() > 0) {
                System.out.println("The following dogs have such a large tail:");
                for (Dog d : dogsWithCorrectLength) {
                    System.out.println(d.toString());
                }
            } else {
                System.out.println("Error: no dog has a tail that long");
            }
        }
    }

    private ArrayList<Dog> getDogsWithLength(double smallestTailLength) {
        ArrayList<Dog> dogsWithCorrectLength = new ArrayList<>();
        for (Dog d : dogList) {
            if (d.getTailLength() >= smallestTailLength) {
                dogsWithCorrectLength.add(d);
            }
        }
        return dogsWithCorrectLength;
    }
}
