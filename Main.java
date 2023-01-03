// Elin Rudling elru4802

public class Main {
    public static void main(String[] args){
        AssignmentEightPointThree testprogram = new AssignmentEightPointThree();

        Dog d = new Dog("Martin", "asd", 5, 4);
        Dog a = new Dog("Elin", "jkl", 4, 7);
        testprogram.addDog(d);
        testprogram.addDog(a);

        Owner o = new Owner("klö");
        testprogram.addOwner(o);

        testprogram.giveDog();

    }

}