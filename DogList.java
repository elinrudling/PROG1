// Elin Rudling elru4802

import java.util.Arrays;

public class DogList {

    private Dog[] ownedDogs = new Dog[0];

    //Lägger till en hund i ägarens lista.
    public void addDogToOwnedDogs(Dog dogToAdd) {
        if (dogToAdd != null && !checkDog(dogToAdd)) {
            Dog[] newDogList = new Dog[ownedDogs.length + 1];
            newDogList[ownedDogs.length] = dogToAdd;
            System.arraycopy(ownedDogs, 0, newDogList, 0, ownedDogs.length);
            ownedDogs = newDogList;
        }
    }

    //Tar bort en hund från ägarens lista.
    public void removeDogFromOwnedDogs(Dog dogToRemove) {
        if (dogToRemove != null && checkDog(dogToRemove)) {
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

    //Kollar om en hund finns i denna ägarens lista.
    public boolean checkDog(Dog dog) {
        for (Dog d : ownedDogs) {
            if (dog.getName().equalsIgnoreCase(d.getName())) {
                return true;
            }
        }
        return false;
    }

    //Skriver ut namnen på ägarens hundar.
    public void printOwnedDogs() {
        String[] dogNames = new String[ownedDogs.length];
        for (int i = 0; i < ownedDogs.length; i++) {
            dogNames[i] = ownedDogs[i].getName();
        }
        System.out.println(" " + Arrays.toString(dogNames));
    }
}