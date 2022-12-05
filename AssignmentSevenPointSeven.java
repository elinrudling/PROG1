// Elin Rudling elru4802

public class AssignmentSevenPointSeven{

    private Dog[] dogList = new Dog[0];

    public void addDog(Dog dogToAdd) {
        if (dogToAdd != null && !checkDog(dogToAdd)) {
            Dog[] newDogList = new Dog[dogList.length + 1];
            newDogList[dogList.length] = dogToAdd;
            System.arraycopy(dogList, 0, newDogList, 0, dogList.length);
            dogList = newDogList;
        }
    }

    public boolean checkDog(Dog dog) {
        for (Dog d : dogList) {
            if (dog.getName().equalsIgnoreCase(d.getName())) {
                return true;
            }
        }
        return false;
    }
    public void swapDogs(){

    }

    public void swapDogsUsingClassLibrary(){

    }

    public void findSmallestDog(){

    }

    public void sortDogs(){

    }

}