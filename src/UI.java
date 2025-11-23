import java.util.Scanner;

/**
 * UI - Användargränssnitt för DigitalZoo
 * Hanterar all interaktion med användaren
 */
public class UI {
    private Controller controller;
    private Scanner scanner;

    /**
     * Konstruktor
     * @param controller Controller-instans för kommunikation
     */
    public UI(Controller controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
        controller.setUI(this);
    }

    /**
     * Starta programmet
     */
    public void start() {
        System.out.println("🦁 Welcome to DigitalZoo! 🐧");
        System.out.println("================================\n");

        boolean running = true;

        while (running) {
            showMenu();
            int choice = getIntInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    addAnimal();
                    break;
                case 2:
                    controller.showAllAnimals();
                    break;
                case 3:
                    controller.makeAllAnimalsSound();
                    break;
                case 4:
                    controller.feedAllAnimals();
                    break;
                case 5:
                    showStatistics();
                    break;
                case 0:
                    System.out.println("\n👋 Thank you for visiting DigitalZoo!");
                    running = false;
                    break;
                default:
                    System.out.println("❌ Invalid choice. Try again.");
            }

            if (running) {
                System.out.println("\nPress Enter to continue...");
                scanner.nextLine();
            }
        }

        scanner.close();
    }

    /**
     * Visa huvudmeny
     */
    private void showMenu() {
        System.out.println("\n=== MAIN MENU ===");
        System.out.println("1. Add new animal");
        System.out.println("2. Show all animals");
        System.out.println("3. Make all animals sound");
        System.out.println("4. Feed all animals");
        System.out.println("5. Show statistics");
        System.out.println("0. Exit");
        System.out.println("=================");
    }

    /**
     * Lägg till nytt djur
     */
    private void addAnimal() {
        System.out.println("\n=== ADD NEW ANIMAL ===");
        System.out.println("1. Lion 🦁");
        System.out.println("2. Penguin 🐧");
        System.out.println("3. Elephant 🐘");

        int choice = getIntInput("Choose animal type: ");

        switch (choice) {
            case 1:
                addLion();
                break;
            case 2:
                addPenguin();
                break;
            case 3:
                addElephant();
                break;
            default:
                System.out.println("❌ Invalid animal type.");
        }
    }

    /**
     * Lägg till lejon
     */
    private void addLion() {
        System.out.println("\n--- Register Lion ---");
        String name = getStringInput("Enter lion's name: ");
        int age = getIntInput("Enter age: ");
        double maneLength = getDoubleInput("Enter mane length (cm): ");

        controller.registerLion(name, age, maneLength);
    }

    /**
     * Lägg till pingvin
     */
    private void addPenguin() {
        System.out.println("\n--- Register Penguin ---");
        String name = getStringInput("Enter penguin's name: ");
        int age = getIntInput("Enter age: ");
        double swimSpeed = getDoubleInput("Enter swim speed (m/s): ");

        controller.registerPenguin(name, age, swimSpeed);
    }

    /**
     * Lägg till elefant
     */
    private void addElephant() {
        System.out.println("\n--- Register Elephant ---");
        String name = getStringInput("Enter elephant's name: ");
        int age = getIntInput("Enter age: ");
        double trunkLength = getDoubleInput("Enter trunk length (m): ");
        double weight = getDoubleInput("Enter weight (kg): ");

        controller.registerElephant(name, age, trunkLength, weight);
    }

    /**
     * Visa statistik
     */
    private void showStatistics() {
        System.out.println("\n📊 Zoo Statistics:");
        System.out.println("Total animals: " + controller.getAnimalCount());
    }

    /**
     * Hjälpmetod för att läsa sträng-input
     */
    private String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    /**
     * Hjälpmetod för att läsa int-input med felhantering
     */
    private int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                String input = scanner.nextLine().trim();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("❌ Please enter a valid number.");
            }
        }
    }

    /**
     * Hjälpmetod för att läsa double-input med felhantering
     */
    private double getDoubleInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                String input = scanner.nextLine().trim();
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("❌ Please enter a valid number.");
            }
        }
    }
}