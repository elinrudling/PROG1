// Elin Rudling elru4802

import java.util.ArrayList;

public class AssignmentEightPointSeven {

    private ArrayList<Owner> allOwners = new ArrayList<>();
    private ArrayList<Dog> allDogs = new ArrayList<>();
    private InputScanner scanner = new InputScanner(System.in);

    public void addDog(Dog d) {
        allDogs.add(d);
    }

    public void addOwner(Owner o) {
        allOwners.add(o);
    }

    private String fetchFormattedString(String inputCommand, String errorMessage) {
        String formattedString = scanner.inputString(inputCommand).trim();
        while (formattedString.length() < 1) {
            System.out.println(errorMessage);
            formattedString = scanner.inputString(inputCommand).trim();
        }
        return formattedString.substring(0, 1).toUpperCase() + formattedString.substring(1).toLowerCase();
    }

    public Owner findOwner(String nameOfOwner) {
        for (Owner owner : allOwners) {
            if (nameOfOwner.equalsIgnoreCase(owner.getName())) {
                return owner;
            }
        }
        return null;
    }

    public Dog findDog(String nameOfDog) {
        for (Dog dog : allDogs) {
            if (nameOfDog.equalsIgnoreCase(dog.getName())) {
                return dog;
            }
        }
        return null;
    }

    public void removeDogFromRegister() {
        String nameOfDog = scanner.inputString("Enter the name of the dog");
        Dog dog = findDog(nameOfDog);
        if (dog != null){
            allDogs.remove(dog);
        } else {
            System.out.println("Error: no such dog");
        }
    }

    public void removeOwnerFromRegister() {
        String nameOfOwner = scanner.inputString("Enter the name of the owner");
        Owner owner = findOwner(nameOfOwner);
        if (owner != null){
            allOwners.remove(owner);
        } else {
            System.out.println("Error: no such dog");
        }
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

        dog.addOwnerToDog(owner);

        System.out.println(owner.getName() + " now owns " + dog.getName());
    }

    public void removeDog() {
        String dogName = fetchFormattedString("Enter the name of the dog", "Error: no dog with that name");
        Dog dog = findDog(dogName);
        if (dog == null) {
            System.out.println("Error: no such dog");
            return;
        }
        if (dog.getOwner() == null) {
            System.out.println("Error: " + dog.getName() + " is not owned by anyone");
            return;
        }

        dog.removeOwnerFromDog();

        System.out.println(dog.getName() + " is removed");
    }

    public void listAllOwners() {
        if (allOwners.size() == 0) {
            System.out.println("Error: no owners in register");
        } else {
            for (Owner owner : allOwners) {
                System.out.print(owner.getName());
                owner.getDogList().printOwnedDogs();
            }
        }
    }

    public void listAllDogs() {

        if (allDogs.size() == 0) {
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
        for (Dog d : allDogs) {
            if (d.getTailLength() >= smallestTailLength) {
                dogsWithCorrectLength.add(d);
            }
        }
        return dogsWithCorrectLength;
    }

}