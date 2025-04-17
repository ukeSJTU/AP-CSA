public class DogStaticAccess {
    public static void main(String[] args) {
        DogStatic snoopy = new DogStatic(3, "Snoopy");
        DogStatic ringo = new DogStatic(5, "Ringo");
        System.out.println(DogStatic.genus); // Prints Canis
        System.out.println(snoopy.genus); // Prints Canis
        System.out.println(ringo.genus); // Prints Canis
    }
}
