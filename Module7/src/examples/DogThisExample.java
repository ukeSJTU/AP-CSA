public class DogThisExample {
    public String name;

    public DogThisExample(String inputName) {
        name = inputName;
    }

    public void speakNewName(String name) {
        System.out.println("Hello, my new name is " + this.name);
    }

    public static void main(String[] args) {
        DogThisExample a = new DogThisExample("Fido");
        DogThisExample b = new DogThisExample("Odie");
        a.speakNewName("Winston"); // "Fido", the instance variable of Dog a is printed
        b.speakNewName("Darla"); // "Odie", the instance variable of Dog b is printed
    }
}
