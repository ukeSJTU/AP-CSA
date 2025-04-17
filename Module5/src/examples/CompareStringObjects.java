package examples;

public class CompareStringObjects {
    public static void main(String[] args) {
        String duckNoise1 = new String("quack");
        String duckNoise2 = new String("quack");
        System.out.println(duckNoise1 == duckNoise2);
    }
}
