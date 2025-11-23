import animals.*;

/**
 * Controller - kommunikationscentral mellan UI och ZooManager
 * Tar emot anrop från UI och vidarebefordrar till ZooManager
 */
public class Controller {
    private ZooManager zooManager;
    private UI ui;

    /**
     * Konstruktor - skapar ZooManager
     */
    public Controller() {
        this.zooManager = new ZooManager();
    }

    /**
     * Sätt UI-referens
     * @param ui Användargränssnittet
     */
    public void setUI(UI ui) {
        this.ui = ui;
    }

    /**
     * Registrera ett lejon
     */
    public void registerLion(String name, int age, double maneLength) {
        Lion lion = new Lion(name, age, maneLength);
        zooManager.registerAnimal(lion);
    }

    /**
     * Registrera en pingvin
     */
    public void registerPenguin(String name, int age, double swimSpeed) {
        Penguin penguin = new Penguin(name, age, swimSpeed);
        zooManager.registerAnimal(penguin);
    }

    /**
     * Registrera en elefant
     */
    public void registerElephant(String name, int age, double trunkLength, double weight) {
        Elephant elephant = new Elephant(name, age, trunkLength, weight);
        zooManager.registerAnimal(elephant);
    }

    /**
     * Visa alla djur
     */
    public void showAllAnimals() {
        zooManager.showAllAnimals();
    }

    /**
     * Låt alla djur göra ljud
     */
    public void makeAllAnimalsSound() {
        zooManager.makeAllAnimalsSound();
    }

    /**
     * Mata alla djur
     */
    public void feedAllAnimals() {
        zooManager.feedAllAnimals();
    }

    /**
     * Hämta antal djur
     */
    public int getAnimalCount() {
        return zooManager.getAnimalCount();
    }
}