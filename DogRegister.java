// Elin Rudling elru4802

import java.util.ArrayList;
import java.util.Collections;

public class DogRegister {
    private InputScanner scanner;
    private ArrayList<Owner> allOwners = new ArrayList<>();
    private ArrayList<Dog> allDogs = new ArrayList<>();

    public void setScanner(InputScanner sc) {
        scanner = sc;
    }

    public void registerNewOwner() {
        String ownerName = scanner.formatString("Name", "Error: the name can’t be empty");
        Owner owner = new Owner(ownerName);
        allOwners.add(owner);
        System.out.println(ownerName + " added to the register");
    }

    public void registerNewDog() {
        String dogName = scanner.formatString("Name", "Error: the name can’t be empty");
        String dogBreed = scanner.formatString("Breed", "Error: the breed can’t be empty");
        int dogAge = scanner.inputInt("Age");
        int dogWeight = scanner.inputInt("Weight");
        Dog dog = new Dog(dogName, dogBreed, dogAge, dogWeight);
        allDogs.add(dog);
        System.out.println(dogName + " added to the register");
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

    public void increaseAgeOfDog() {
        String nameOfDog = scanner.formatString("Enter the name of the dog", "Error: incorrect name format");
        Dog dog = findDog(nameOfDog);
        if (dog != null) {
            dog.changeAge();
        } else {
            System.out.println("Error: no such dog");
        }
    }

    public void removeOwnerFromRegister() {
        String nameOfOwner = scanner.formatString("Enter the name of the owner", "Error: incorrect name format");
        Owner owner = findOwner(nameOfOwner);
        if (owner != null) {
            removeOwnedDogsFromRegister(owner);
            allOwners.remove(owner);
        } else {
            System.out.println("Error: no such owner");
        }
        System.out.println(nameOfOwner + " is removed from the register");
    }

    public void removeDogFromRegister() {
        String nameOfDog = scanner.formatString("Enter the name of the dog", "Error: incorrect name format");
        Dog dog = findDog(nameOfDog);
        if (dog != null) {
            dog.removeOwnerFromDog();
            allDogs.remove(dog);
        } else {
            System.out.println("Error: no such dog");
        }
        System.out.println(nameOfDog + " is removed from the register");
    }

    private void removeOwnedDogsFromRegister(Owner owner) {
        ArrayList<Dog> tempDogList = new ArrayList<>();
        for (Dog dog : allDogs) {
            if (dog.getOwner() == owner) {
                tempDogList.add(dog);
            }
        }
        for (Dog dog : tempDogList) {
            allDogs.remove(dog);
        }
    }

    public void giveDog() {
        String nameOfDog = scanner.formatString("Enter the name of the dog", "Error: no dog with that name");
        Dog dog = findDog(nameOfDog);
        if (dog == null) {
            System.out.println("Error: no dog with that name");
            return;
        }

        if (dog.getOwner() != null) {
            System.out.println("Error: the dog already has an owner");
            return;
        }

        String nameOfOwner = scanner.formatString("Enter the name of the new owner", "Error: no such owner");
        Owner owner = findOwner(nameOfOwner);
        if (owner == null) {
            System.out.println("Error: no such owner");
            return;
        }

        dog.addOwnerToDog(owner);

        System.out.println(owner.getName() + " now owns " + dog.getName());
    }

    public void removeOwnedDog() {
        String dogName = scanner.formatString("Enter the name of the dog", "Error: no dog with that name");
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
        } else {
            sortDogs();
            double smallestTailLength = scanner.inputDouble("Smallest tail length to display");

            ArrayList<Dog> dogsWithCorrectTailLength = getDogsWithCorrectTailLength(smallestTailLength);

            if (dogsWithCorrectTailLength.size() > 0) {
                System.out.println("The following dogs have such a large tail:");
                for (Dog dog : dogsWithCorrectTailLength) {
                    System.out.println(dog.toString());
                }
            } else {
                System.out.println("Error: no dog has a tail that long");
            }
        }
    }

    private ArrayList<Dog> getDogsWithCorrectTailLength(double smallestTailLength) {
        ArrayList<Dog> dogsWithCorrectTailLength = new ArrayList<>();
        for (Dog dog : allDogs) {
            if (dog.getTailLength() >= smallestTailLength) {
                dogsWithCorrectTailLength.add(dog);
            }
        }
        return dogsWithCorrectTailLength;
    }

    public boolean swapDogs(int smallerDog, int biggerDog) {
        if (smallerDog != biggerDog) {
            Dog dog = allDogs.get(smallerDog);
            allDogs.set(smallerDog, allDogs.get(biggerDog));
            allDogs.set(biggerDog, dog);
            return true;
        }
        return false;
    }

    public void swapDogsUsingClassLibrary(int smallerDog, int biggerDog) {
        Collections.swap(allDogs, smallerDog, biggerDog);
    }


    public boolean compareDogs(Dog a, Dog b) {
        if (a.getTailLength() == b.getTailLength()) {
            if (a.getName().compareToIgnoreCase(b.getName()) < 0) {
                return true;
            }
            return false;
        }
        if (a.getTailLength() < b.getTailLength()) {
            return true;
        }
        return false;
    }

    public int findSmallestDog(int index) {
        Dog smallestDog = allDogs.get(index);
        for (int i = index + 1; i < allDogs.size(); i++) {
            if (compareDogs(allDogs.get(i), smallestDog)) {
                smallestDog = allDogs.get(i);
            }
        }
        return allDogs.indexOf(smallestDog);
    }

    public int sortDogs() {
        int counter = 0;
        for (int i = 0; i < allDogs.size() - 1; i++) {
            if (swapDogs(findSmallestDog(i), i)) {
                counter++;
            }
        }
        return counter;
    }
}