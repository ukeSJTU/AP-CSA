package projects.BuildADroid_Solution;

/**
 * A Droid class implementation for AP Computer Science A Exam preparation.
 * This class simulates a robot with state (name, battery level) and behavior
 * (performing tasks).
 * It serves as a solution reference for the project.
 */
public class Droid {
    // Instance fields for droid state
    String name;
    int batteryLevel;

    /**
     * Constructor for Droid class.
     * 
     * @param droidName The name of the droid
     */
    public Droid(String droidName) {
        this.name = droidName;
        this.batteryLevel = 100; // Initialize battery level to 100
    }

    /**
     * Returns a descriptive string representation of the Droid.
     * 
     * @return A string introducing the Droid by name
     */
    public String toString() {
        return "Hello, I'm the droid: " + name;
    }

    /**
     * Simulates the Droid performing a task and reduces battery level.
     * 
     * @param task The task to be performed
     */
    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10; // Decrease battery level by 10 for each task
    }

    /**
     * Reports the current battery level of the Droid.
     */
    public void energyReport() {
        System.out.println(name + "'s current battery level: " + batteryLevel);
    }

    /**
     * Transfers energy (battery level) from this Droid to another Droid.
     * 
     * @param otherDroid The Droid to transfer energy to
     * @param amount     The amount of energy to transfer
     */
    public void energyTransfer(Droid otherDroid, int amount) {
        if (this.batteryLevel >= amount) {
            this.batteryLevel -= amount;
            otherDroid.batteryLevel += amount;
            System.out.println(amount + " energy transferred from " + this.name + " to " + otherDroid.name);
        } else {
            System.out.println("Insufficient energy to transfer from " + this.name);
        }
    }

    // Main method to test the Droid functionality
    public static void main(String[] args) {
        // Create Droid instances
        Droid codey = new Droid("Codey");
        Droid margot = new Droid("Margot");

        // Print Droid details
        System.out.println(codey);
        System.out.println(margot);

        // Have Droids perform tasks
        codey.performTask("dancing");
        codey.energyReport();

        margot.performTask("levitating");
        margot.energyReport();

        // Test energy transfer
        codey.energyTransfer(margot, 20);
        codey.energyReport();
        margot.energyReport();
    }
}
