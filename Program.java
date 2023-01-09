// Elin Rudling elru4802

import java.util.ArrayList;

public class Program {
    private static final int EXIT_COMMAND = 9;
    private static final String[] COMMANDS = {"Register new dog", "Register new owner", "Remove dog", "Remove owner",
            "Give dog", "Remove owned dog", "Increase age", "List dogs", "List owners", "Exit"};
    private static ArrayList<String> finalCommands = new ArrayList<>();
    private AssignmentTenPointOne assignmentTenPointOne;
    private InputScanner scanner;
    public static void main(String[] args) {
        new Program().run();
    }

    private void run() {
        startup();
        runCommandLoop();
        shutdown();
    }

    private void startup() {
        for (String string : COMMANDS) {
            finalCommands.add(string.toLowerCase());
        }
        scanner = new InputScanner(System.in);
        assignmentTenPointOne = new AssignmentTenPointOne();
        assignmentTenPointOne.setScanner(scanner);
        System.out.print("Welcome!");
    }

    private void runCommandLoop() {
        int command;
        do {
            command = readCommand();
            handleCommand(command);
        } while (command != EXIT_COMMAND);
    }

    private boolean checkIfCommandExists(String input) {
        if (finalCommands.contains(input.toLowerCase()))
            return true;

        System.out.println("Error! Incorrect command");
        return false;
    }

    private int readCommand() {
        System.out.println();
        for (String command : COMMANDS) {
            System.out.println("* " + command);
        }

        String input;

        do {
            input = scanner.inputString("Enter command").toLowerCase();
        } while (!checkIfCommandExists(input));

        return finalCommands.indexOf(input);
    }

    private void handleCommand(int command) {
        switch (command) {
            case 0:
                assignmentTenPointOne.registerNewDog();
                break;
            case 1:
                assignmentTenPointOne.registerNewOwner();
                break;
            case 2:
                assignmentTenPointOne.removeDogFromRegister();
                break;
            case 3:
                assignmentTenPointOne.removeOwnerFromRegister();
                break;
            case 4:
                assignmentTenPointOne.giveDog();
                break;
            case 5:
                assignmentTenPointOne.removeOwnedDog();
                break;
            case 6:
                assignmentTenPointOne.increaseAgeOfDog();
                break;
            case 7:
                assignmentTenPointOne.listAllDogs();
                break;
            case 8:
                assignmentTenPointOne.listAllOwners();
                break;
            default:
                shutdown();
                break;
        }
    }

    private void shutdown() {
        // exit
    }
}
