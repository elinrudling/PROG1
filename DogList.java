// Elin Rudling elru4802

import java.util.Arrays;

public class DogList {
    private Dog[] ownedDogs = new Dog[0];

    public void addDogToOwnedDogs(Dog dogToAdd) {
        if (dogToAdd != null && !checkIfDogExists(dogToAdd)) {
            Dog[] newDogList = new Dog[ownedDogs.length + 1];
            newDogList[ownedDogs.length] = dogToAdd;
            System.arraycopy(ownedDogs, 0, newDogList, 0, ownedDogs.length);
            ownedDogs = newDogList;
        }
    }

    public void removeDogFromOwnedDogs(Dog dogToRemove) {
        if (dogToRemove != null && checkIfDogExists(dogToRemove)) {
            Dog[] newDogList = new Dog[ownedDogs.length - 1];
            boolean found = false;
            for (int i = 0; i < ownedDogs.length; i++) {
                if (found == false) {
                    if (ownedDogs[i].getName().equalsIgnoreCase(dogToRemove.getName())) {
                        found = true;
                        continue;
                    }
                    newDogList[i] = ownedDogs[i];
                } else {
                    newDogList[i - 1] = ownedDogs[i];
                }
            }
            ownedDogs = newDogList;
        }
    }

    public boolean checkIfDogExists(Dog dog) {
        for (Dog d : ownedDogs) {
            if (dog.getName().equalsIgnoreCase(d.getName())) {
                return true;
            }
        }
        return false;
    }

    public void printOwnedDogs() {
        String[] dogNames = new String[ownedDogs.length];
        for (int i = 0; i < ownedDogs.length; i++) {
            dogNames[i] = ownedDogs[i].getName();
        }
        System.out.println(" " + Arrays.toString(dogNames));
    }
}