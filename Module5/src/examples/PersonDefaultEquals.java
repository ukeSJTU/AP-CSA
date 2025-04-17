package examples;

public class PersonDefaultEquals {
    private String firstname;
    private String lastname;

    public PersonDefaultEquals(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public static void main(String[] args) {
        PersonDefaultEquals person1 = new PersonDefaultEquals("Jennifer", "Smith");
        PersonDefaultEquals person2 = new PersonDefaultEquals("Jennifer", "Smith");
        // compare with `==`
        System.out.println(person1 == person2);
        // compare with `.equals()`
        System.out.println(person1.equals(person2));
    }
}
