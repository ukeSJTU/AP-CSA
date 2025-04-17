package examples;

public class ComparingStringLiterals {
    public static void main(String[] args) {
        String duckNoise1 = "quack";
        String duckNoise2 = "bark";
        String duckNoise3 = "quack";
        System.out.println(duckNoise1 == duckNoise2);
        System.out.println(duckNoise1 != duckNoise2);
        System.out.println(duckNoise1 == duckNoise3);
    }
}
