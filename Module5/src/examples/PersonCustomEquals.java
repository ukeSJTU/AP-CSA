package examples;

public class PersonCustomEquals {
    private String firstname;
    private String lastname;

    public PersonCustomEquals(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public boolean equals(PersonCustomEquals p) {
        return (p.firstname == firstname && p.lastname == lastname);
    }

    public static void main(String[] args) {
        PersonCustomEquals person1 = new PersonCustomEquals("Jennifer", "Smith");
        PersonCustomEquals person2 = new PersonCustomEquals("Jennifer", "Smith");
        // compare with `==`
        System.out.println(person1 == person2);
        // compare with `.equals()`
        System.out.println(person1.equals(person2));
    }
}
