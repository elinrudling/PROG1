// Elin Rudling elru4802

public class Main {
    public static void main(String[] args){
        AssignmentEightPointThree hej = new AssignmentEightPointThree();

        Dog d = new Dog("Martin", "asd", 5, 4);
        Dog a = new Dog("Elin", "jkl", 4, 7);
        hej.addDog(d);
        hej.addDog(a);

        Owner o = new Owner("klö");
        hej.addOwner(o);

        hej.giveDog();

        o.listDogs();
        hej.giveDog();
        o.listDogs();
    }

}