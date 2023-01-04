// Elin Rudling elru4802

public class Main {
    public static void main(String[] args){
        AssignmentEightPointThree testprogram = new AssignmentEightPointThree();

        Dog a = new Dog("Zimba", "asd", 5, 4);
        Dog b = new Dog("Nala", "jkl", 4, 7);
        Owner c = new Owner("Elin");
        Owner d = new Owner("Martin");

        testprogram.addDog(a);
        testprogram.addDog(b);

        testprogram.addOwner(c);
        testprogram.addOwner(d);

        testprogram.giveDog();

    }

}