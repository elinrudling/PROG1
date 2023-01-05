// Elin Rudling elru4802

import java.util.ArrayList;
import java.util.Arrays;

public class AssignmentEightPointFour {

    private ArrayList<Owner> ownerList = new ArrayList<>();
    private ArrayList<Dog> dogList = new ArrayList<>();
    private InputScanner scanner = new InputScanner(System.in);

    public Owner findOwner(String nameOfOwner) {
        for (Owner owner : ownerList) {
            if (nameOfOwner.equalsIgnoreCase(owner.getName())) {
                return owner;
            }
        }
        return null;
    }

    public Dog findDog(String nameOfDog) {
        for (Dog dog : dogList) {
            if (nameOfDog.equalsIgnoreCase(dog.getName())) {
                return dog;
            }
        }
        return null;
    }

    private String fetchFormattedString(String inputCommand, String errorMessage) {
        String formattedString = scanner.inputString(inputCommand).trim();
        while (formattedString.length() < 1) {
            System.out.println(errorMessage);
            formattedString = scanner.inputString(inputCommand).trim();
        }
        return formattedString.substring(0, 1).toUpperCase() + formattedString.substring(1).toLowerCase();
    }

    public void addDog(Dog d) {
        dogList.add(d);
    }

    public void addOwner(Owner o) {
        ownerList.add(o);
    }

    public void giveDog() {
        String dogName = fetchFormattedString("Enter the name of the dog", "Error: no dog with that name");
        Dog dog = findDog(dogName);
        if (dog == null) {
            System.out.println("Error: no dog with that name");
            return;
        }
        if (dog.getOwner() != null) {
            System.out.println("Error: the dog already has an owner");
            return;
        }

        String ownerName = fetchFormattedString("Enter the name of the new owner", "Error: no such owner");
        Owner owner = findOwner(ownerName);
        if (owner == null) {
            System.out.println("Error: no such owner");
            return;
        }

        dog.setOwner(owner);

        System.out.println(owner.getName() + " now owns " + dog.getName());
    }

    public void listOwners() {
        if (ownerList.size() == 0) {
            System.out.println("Error: no owners in register");
        } else {
            for (Owner owner : ownerList) {
                System.out.println(owner.getName());
                
            }
        }
    }

    public void listDogs() {

        if (dogList.size() == 0) {
            System.out.println("Error: no dogs in register");
        } else  {
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