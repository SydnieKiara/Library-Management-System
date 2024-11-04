/**
 * Abstract class representing a person.
 */
public abstract class Person {
    protected String name;
    protected String id;

    /**
     * Constructor for the Person class.
     * @param name The name of the person.
     * @param id The ID of the person.
     */
    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    /**
     * Returns a description of the person.
     * @return A string describing the person.
     */
    public abstract String describe();
}
