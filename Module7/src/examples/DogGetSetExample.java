public class DogGetSetExample {
    private String name;

    // Other methods and constructors
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public static void main(String[] args) {
        DogGetSetExample myDog = new DogGetSetExample();
        myDog.setName("Lassie");
    }
}
