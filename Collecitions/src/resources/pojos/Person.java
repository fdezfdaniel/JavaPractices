package resources.pojos;

/**
 * Created by dfernandez on 19/05/2017.
 */
public class Person implements Comparable<Person>{
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.valueOf(
                new StringBuilder().append(firstName).append(" ").append(middleName).append(" ").append(lastName));
    }

    @Override
    public int compareTo(Person o) {
        return firstName.compareTo(o.getFirstName());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
