// Elin Rudling elru4802

import java.util.Collections;
import java.util.ArrayList;

public class AssignmentSevenPointSeven {
    private ArrayList<Dog> dogList = new ArrayList<>();

    public boolean swapDogs(int smallerDog, int biggerDog) {
        if (smallerDog != biggerDog) {
            Dog dog = dogList.get(smallerDog);
            dogList.set(smallerDog, dogList.get(biggerDog));
            dogList.set(biggerDog, dog);
            return true;
        }
        return false;
    }

    public void swapDogsUsingClassLibrary(int smallerDog, int biggerDog) {
        Collections.swap(dogList, smallerDog, biggerDog);
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

    public int sortFromIndex(int i) {
        Dog smallestDog = dogList.get(i);
        for (int j = i + 1; j < dogList.size(); j++) {
            if (compareDogs(dogList.get(j), smallestDog)) {
                smallestDog = dogList.get(j);
            }
        }

        return dogList.indexOf(smallestDog);
    }

    public int sortDogs(){
        int counter = 0;

        for (int i = 0; i < dogList.size() - 1; i++) {
            if (swapDogs(sortFromIndex(i), i)){
                counter++;
            }

        }
        return counter;
    }
}