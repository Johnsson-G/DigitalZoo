
public class Main {
    public static void main(String[] args) {
        // Skapa controller
        Controller controller = new Controller();

        // Skapa UI och starta programmet
        UI ui = new UI(controller);
        ui.start();
    }
}