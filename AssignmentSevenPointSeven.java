// Elin Rudling elru4802

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class AssignmentSevenPointSeven {

    private ArrayList<Dog> dogList = new ArrayList<>();
    public static int counter = 0;

    public void swapDogs(int smallerDog, int biggerDog) {
        Dog dog = dogList.get(smallerDog);
        dogList.set(smallerDog, dogList.get(biggerDog));
        dogList.set(biggerDog, dog);
    }

    public void swapDogsUsingClassLibrary(ArrayList<Object> dogList, int smallerDog, int biggerDog) {
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
                counter++;
                smallestDog = dogList.get(j);
            }
        }

        return dogList.indexOf(smallestDog);
    }

    public int sortDogs(){
        counter = 0;

        for (int i = 0; i < dogList.size() - 1; i++) {

            swapDogs(sortFromIndex(i), i);
        }
        return counter;
    }
}