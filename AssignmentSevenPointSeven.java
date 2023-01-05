// Elin Rudling elru4802

import java.util.Collections;
import java.util.ArrayList;

public class AssignmentSevenPointSeven {
    private ArrayList<Dog> allDogs = new ArrayList<>();

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

    public int sortFromIndex(int i) {
        Dog smallestDog = allDogs.get(i);
        for (int j = i + 1; j < allDogs.size(); j++) {
            if (compareDogs(allDogs.get(j), smallestDog)) {
                smallestDog = allDogs.get(j);
            }
        }

        return allDogs.indexOf(smallestDog);
    }

    public int sortDogs(){
        int counter = 0;

        for (int i = 0; i < allDogs.size() - 1; i++) {
            if (swapDogs(sortFromIndex(i), i)){
                counter++;
            }

        }
        return counter;
    }
}