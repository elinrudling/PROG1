// Elin Rudling elru4802

//import java.util.Scanner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Program {
    private static final int EXIT_COMMAND = 0;
    private static String[] commands = {"Register new dog", "Register new owner", "Remove dog", "Remove owner",
            "Give dog", "Remove owned dog", "Increase age", "List dogs", "List owners", "Exit"};

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

    private void fillCommandDictionary() {

    }

    private void runCommandLoop() {
        int command;
        do {
            command = readCommand();
            handleCommand(command);
        } while (command != EXIT_COMMAND);
    }

    private boolean checkIfCommandExists(String input) {
        for (String command : commands) {
            if (input.equalsIgnoreCase(command)) {
                return true;
            }
        }
        System.out.println("Error: incorrect command");
        return false;
    }

    private int readCommand() {
        for (int i = 0; i < commands.length; i++) {
            System.out.println("* " + commands[i]);
        }

        String command;
        do {
            command = scanner.inputString("Choose command");
        }
        while (!commands.contains(command));

        return commandDictionary.get(command);
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
