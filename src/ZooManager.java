import animals.Animal;
import java.util.ArrayList;

/**
 * ZooManager - hanterar alla djur i zooet
 * Ansvarar för lagring, registrering och återläsning av djur
 */
public class ZooManager {
    private ArrayList<Animal> animals;

    /**
     * Konstruktor - skapar tom lista för djur
     */
    public ZooManager() {
        this.animals = new ArrayList<>();
    }

    /**
     * Registrera ett nytt djur i zooet
     * @param animal Djuret som ska läggas till
     */
    public void registerAnimal(Animal animal) {
        if (animal != null) {
            animals.add(animal);
            System.out.println("✅ " + animal.getName() + " the " + animal.getSpecies() + " has been registered!");
        }
    }

    /**
     * Hämta alla djur
     * @return Lista med alla djur
     */
    public ArrayList<Animal> getAllAnimals() {
        return animals;
    }

    /**
     * Hämta ett specifikt djur baserat på index
     * @param index Index i listan
     * @return Djuret på given plats, eller null om index är ogiltigt
     */
    public Animal getAnimal(int index) {
        if (index >= 0 && index < animals.size()) {
            return animals.get(index);
        }
        return null;
    }

    /**
     * Hämta antal djur i zooet
     * @return Antal djur
     */
    public int getAnimalCount() {
        return animals.size();
    }

    /**
     * Låt alla djur göra sina ljud (polymorfism!)
     */
    public void makeAllAnimalsSound() {
        System.out.println("\n🔊 All animals are making sounds:");
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " says: " + animal.makeSound());
        }
    }

    /**
     * Mata alla djur (polymorfism!)
     */
    public void feedAllAnimals() {
        System.out.println("\n🍽️ Feeding time:");
        for (Animal animal : animals) {
            System.out.println(animal.eat());
        }
    }

    /**
     * Visa information om alla djur
     */
    public void showAllAnimals() {
        System.out.println("\n📋 Animals in the zoo:");
        if (animals.isEmpty()) {
            System.out.println("No animals registered yet.");
        } else {
            for (int i = 0; i < animals.size(); i++) {
                System.out.println((i + 1) + ". " + animals.get(i).getInfo());
            }
        }
    }
}
