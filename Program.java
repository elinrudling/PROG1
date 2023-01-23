// Elin Rudling elru4802

import java.util.ArrayList;

public class Program {
    private static final String[] COMMANDS = {"Register new dog", "Register new owner", "Remove dog", "Remove owner",
            "Give dog", "Remove owned dog", "Increase age", "List dogs", "List owners", "Exit"};
    private static final ArrayList<String> LOWER_CASE_COMMANDS = new ArrayList<>();
    private final InputScanner scanner = new InputScanner();
    private final DogRegister dogRegister = new DogRegister();

    public static void main(String[] args) {
        new Program().run();
    }

    private void run() {
        startup();
        runCommandLoop();
    }

    private void startup() {
        dogRegister.setScanner(scanner);

        for (String string : COMMANDS) {
            LOWER_CASE_COMMANDS.add(string.toLowerCase());
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
        String command;
        command = scanner.formatString("Enter command", "Error! Incorrect command").toLowerCase();
        while (!LOWER_CASE_COMMANDS.contains(command.toLowerCase())) {
            System.out.println("Error! Incorrect command");
            command = scanner.formatString("Enter command", "Error! Incorrect command").toLowerCase();
        }
        return command;
    }

    private void handleCommand(String command) {
        switch (command) {
            case "register new dog":
                dogRegister.registerNewDog();
                break;
            case "register new owner":
                dogRegister.registerNewOwner();
                break;
            case "remove dog":
                dogRegister.removeDogFromRegister();
                break;
            case "remove owner":
                dogRegister.removeOwnerFromRegister();
                break;
            case "give dog":
                dogRegister.giveDog();
                break;
            case "remove owned dog":
                dogRegister.removeOwnedDog();
                break;
            case "increase age":
                dogRegister.increaseAgeOfDog();
                break;
            case "list dogs":
                dogRegister.listAllDogs();
                break;
            case "list owners":
                dogRegister.listAllOwners();
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