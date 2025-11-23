package animals;

/**
 * Lion - konkret subklass av Animal
 * Representerar ett lejon i zooet
 */
public class Lion extends Animal {
    // Specifikt attribut för lejon
    private double maneLength; // Längd på man (cm)

    /**
     * Konstruktor för Lion
     * @param name Lejonets namn
     * @param age Lejonets ålder
     * @param maneLength Längd på manen i cm
     */
    public Lion(String name, int age, double maneLength) {
        super(name, age); // Anropa Animal-konstruktorn
        this.maneLength = maneLength;
    }

    public double getManeLength() {
        return maneLength;
    }

    public void setManeLength(double maneLength) {
        this.maneLength = maneLength;
    }

    /**
     * Implementerar abstrakt metod från Animal
     */
    @Override
    public String getSpecies() {
        return "Lion";
    }

    /**
     * Implementerar abstrakt metod från Animal
     * Lejon ger ifrån sig ett rytande
     */
    @Override
    public String makeSound() {
        return "ROAAAR! 🦁";
    }

    /**
     * Implementerar abstrakt metod från Animal
     * Lejon äter kött
     */
    @Override
    public String eat() {
        return getName() + " the lion is eating meat!";
    }

    /**
     * Överskuggar getInfo för att lägga till mane-info
     */
    @Override
    public String getInfo() {
        return super.getInfo() + ", Mane Length: " + maneLength + " cm";
    }
}
