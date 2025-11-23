package animals;

/**
 * Elephant - konkret subklass av Animal
 * Representerar en elefant i zooet
 */
public class Elephant extends Animal {
    // Specifikt attribut för elefanter
    private double trunkLength; // Längd på snabeln i meter
    private double weight; // Vikt i kg

    /**
     * Konstruktor för Elephant
     * @param name Elefantens namn
     * @param age Elefantens ålder
     * @param trunkLength Längd på snabeln i meter
     * @param weight Vikt i kg
     */
    public Elephant(String name, int age, double trunkLength, double weight) {
        super(name, age);
        this.trunkLength = trunkLength;
        this.weight = weight;
    }

    public double getTrunkLength() {
        return trunkLength;
    }

    public void setTrunkLength(double trunkLength) {
        this.trunkLength = trunkLength;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Implementerar abstrakt metod från Animal
     */
    @Override
    public String getSpecies() {
        return "Elephant";
    }

    /**
     * Implementerar abstrakt metod från Animal
     * Elefanter trumpetar
     */
    @Override
    public String makeSound() {
        return "PAWOOOO! 🐘";
    }

    /**
     * Implementerar abstrakt metod från Animal
     * Elefanter äter växter
     */
    @Override
    public String eat() {
        return getName() + " the elephant is eating grass and leaves!";
    }

    /**
     * Överskuggar getInfo för att lägga till elefant-specifik info
     */
    @Override
    public String getInfo() {
        return super.getInfo() + ", Trunk Length: " + trunkLength + " m, Weight: " + weight + " kg";
    }
}
