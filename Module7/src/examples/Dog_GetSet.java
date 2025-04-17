public class Dog {
    private String name;

    // Other methods and constructors
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.setName("Lassie");
    }
}
