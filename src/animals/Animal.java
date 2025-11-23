package animals;

/**
 * Abstrakt basklass för alla djur i zooet.
 * Definierar gemensamma egenskaper och beteenden som alla djur måste ha.
 */
public abstract class Animal {
    // Gemensamma attribut för alla djur
    private String name;
    private int age;

    /**
     * Konstruktor för Animal
     * @param name Djurets namn
     * @param age Djurets ålder
     */
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    /**
     * Abstrakt metod - varje djur returnerar sin art
     * Måste implementeras av alla subklasser
     */
    public abstract String getSpecies();

    /**
     * Abstrakt metod - varje djur gör ett unikt ljud
     * Måste implementeras av alla subklasser
     */
    public abstract String makeSound();

    /**
     * Abstrakt metod - varje djur äter på sitt sätt
     * Måste implementeras av alla subklasser
     */
    public abstract String eat();

    /**
     * Konkret metod som kan användas av alla djur
     * Kan överskuggas av subklasser om de vill
     */
    public String getInfo() {
        return "Name: " + name + ", Age: " + age + ", Species: " + getSpecies();
    }

    /**
     * ToString för enkel utskrift
     */
    @Override
    public String toString() {
        return getInfo();
    }
}