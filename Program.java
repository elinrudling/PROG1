// Elin Rudling elru4802

import java.util.ArrayList;

public class Program {

    private static final String[] COMMANDS = {"Register new dog", "Register new owner", "Remove dog", "Remove owner",
            "Give dog", "Remove owned dog", "Increase age", "List dogs", "List owners", "Exit"};
    private static final ArrayList<String> lowerCaseCommands = new ArrayList<>();
    private final InputScanner scanner = new InputScanner();
    private final AssignmentTenPointOne assignmentTenPointOne = new AssignmentTenPointOne();

    public static void main(String[] args) {
        new Program().run();
    }

    private void run() {
        startup();
        runCommandLoop();
    }

    private void startup() {
        assignmentTenPointOne.setScanner(scanner);

        for (String string : COMMANDS) {
            lowerCaseCommands.add(string.toLowerCase());
        }

        System.out.println("Welcome!");
        for (String command : COMMANDS) {
            System.out.println("* " + command);
        }
    }

    private void runCommandLoop() {
        String command;
        do {
            command = readCommand();
            handleCommand(command);
        } while (!command.equals("exit"));
    }

    private String readCommand() {
        String input;
        input = scanner.formatString("Enter command", "Error! Incorrect command").toLowerCase();
        while (!lowerCaseCommands.contains(input.toLowerCase())) {
            System.out.println("Error! Incorrect command");
            input = scanner.formatString("Enter command", "Error! Incorrect command").toLowerCase();
        }
        return input;
    }

    private void handleCommand(String command) {
        switch (command) {
            case "register new dog":
                assignmentTenPointOne.registerNewDog();
                break;
            case "register new owner":
                assignmentTenPointOne.registerNewOwner();
                break;
            case "remove dog":
                assignmentTenPointOne.removeDogFromRegister();
                break;
            case "remove owner":
                assignmentTenPointOne.removeOwnerFromRegister();
                break;
            case "give dog":
                assignmentTenPointOne.giveDog();
                break;
            case "remove owned dog":
                assignmentTenPointOne.removeOwnedDog();
                break;
            case "increase age":
                assignmentTenPointOne.increaseAgeOfDog();
                break;
            case "list dogs":
                assignmentTenPointOne.listAllDogs();
                break;
            case "list owners":
                assignmentTenPointOne.listAllOwners();
                break;
            default:
                shutdown();
                break;
        }
    }

    private void shutdown() {
        System.out.println("Bye bye");
    }
}
