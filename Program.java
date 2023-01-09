// Elin Rudling elru4802

//import java.util.Scanner;

public class Program {
    private static final int EXIT_COMMAND = 0;
    //private Scanner input = new Scanner(System.in);
    private InputScanner scanner = new InputScanner(System.in);

    public static void main(String[] args) {
        new Program().run();
    }

    private void run() {
        startup();
        runCommandLoop();
        shutdown();
    }

    private void startup() {
        System.out.println("Welcome!");
    }

    private void runCommandLoop() {
        int command;
        do {
            command = readCommand();
            handleCommand(command);
        } while (command != EXIT_COMMAND);
    }

    private int readCommand() {
        System.out.print("Commands: \n1 Register new dog\n2 Register new owner\n3 Remove dog\n4 Remove owner\n" +
                "5 Give dog\n6 Remove owned dog\n7 Increase age\n8 List dogs\n9 List owners\n10 Exit\n");
        int command = scanner.inputInt("Choose command");
        return command;
    }

    private void handleCommand(int command) {
        switch (command) {
            case EXIT_COMMAND:
                shutdown();
                break;
//            case 1:
//                registerNewDog();
//                break;
//            case 2:
//                registerNewOwner();
//                break;
//            case 3:
//                removeDogFromRegister();
//                break;
//            case 4:
//                removeOwnerFromRegister();
//                break;
//            case 5:
//                giveDog();
//                break;
//            case 6:
//                removeOwnedDog();
//                break;
//            case 7:
//                increaseAgeOfDog();
//                break;
//            case 8:
//                listAllDogs();
//                break;
//            case 9:
//                listAllOwners();
//                break;
            default:
                System.out.println("Error: incorrect command");
        }
    }

    private void shutdown() {
        // Innehåller kod som ska köras en enda gång precis när programmet avslutas
    }
}
