
public class Main {
    public static void main(String[] args){
        InputScanner scanner = new InputScanner();

        String dogName = scanner.inputString("Enter name of dog: ");
        String dogBreed = scanner.inputString("Enter breed of dog: ");
        int dogAge = scanner.inputInt("Enter age of dog: ");
        int dogWeight = scanner.inputInt("Enter weight of dog: ");

       
        // Scanner ownerInput = new Scanner(System.in);

        // System.out.print("\nEnter name of owner: ");
        // String ownerName = ownerInput.nextLine();

        // System.out.print("Enter age of owner: ");
        // int ownerAge = ownerInput.nextInt();


        // dogInput.close();
        // ownerInput.close();

        Dog dog = new Dog (dogName, dogBreed, dogAge, dogWeight);
        System.out.println(dog.toString());

        // Owner owner = new Owner (ownerName, ownerAge);
        // System.out.println(owner.toString());

    }

}