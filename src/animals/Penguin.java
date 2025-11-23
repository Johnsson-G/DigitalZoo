package animals;

public class Penguin extends Animal {
    private boolean canSwim;
    private double swimSpeed; // meter per sekund

    /**
     * Konstruktor för Penguin
     * @param name Pingvinens namn
     * @param age Pingvinens ålder
     * @param swimSpeed Simhastighet i m/s
     */
    public Penguin(String name, int age, double swimSpeed) {
        super(name, age);
        this.canSwim = true; // Alla pingviner kan simma!
        this.swimSpeed = swimSpeed;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public double getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    /**
     * Implementerar abstrakt metod från Animal
     */
    @Override
    public String getSpecies() {
        return "Penguin";
    }

    /**
     * Implementerar abstrakt metod från Animal
     * Pingviner gör ett kvitterande ljud
     */
    @Override
    public String makeSound() {
        return "Honk honk! 🐧";
    }

    /**
     * Implementerar abstrakt metod från Animal
     * Pingviner äter fisk
     */
    @Override
    public String eat() {
        return getName() + " the penguin is eating fish!";
    }

    /**
     * Överskuggar getInfo för att lägga till siminfo
     */
    @Override
    public String getInfo() {
        return super.getInfo() + ", Can Swim: " + canSwim + ", Swim Speed: " + swimSpeed + " m/s";
    }
}


