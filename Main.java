// Elin Rudling elru4802

public class Main {
    public static void main(String[] args){
        AssignmentEightPointSeven testprogram = new AssignmentEightPointSeven();

        Dog a = new Dog("Zimba", "asd", 5, 4);
        Dog b = new Dog("Nala", "jkl", 4, 7);
        Dog c = new Dog("Aris", "hji", 7, 6);
        Dog d = new Dog("Filip", "dfg", 10, 3);

        Owner e = new Owner("Elin");
        Owner f = new Owner("Martin");

        testprogram.addDog(a);
        testprogram.addDog(b);
        testprogram.addDog(c);
        testprogram.addDog(d);

        testprogram.addOwner(e);
        testprogram.addOwner(f);

        testprogram.giveDog();
        testprogram.giveDog();
        testprogram.giveDog();

        testprogram.removeDog();
        testprogram.removeDog();

        testprogram.listAllDogs();
        testprogram.listAllOwners();

    }

}