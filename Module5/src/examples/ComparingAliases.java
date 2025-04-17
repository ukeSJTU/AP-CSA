package examples;

public class ComparingAliases {
    public static void main(String[] args) {
        String animalNoise1 = new String("meow");
        String animalNoise2 = new String("moo");
        String animalNoise3 = animalNoise2;
        // comparing different objects
        System.out.println(animalNoise1 == animalNoise2);
        // comparing object aliases
        System.out.println(animalNoise2 == animalNoise3);
    }
}
