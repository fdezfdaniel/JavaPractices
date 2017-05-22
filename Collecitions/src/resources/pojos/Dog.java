package resources.pojos;

/**
 * Created by dfernandez on 19/05/2017.
 */
public class Dog implements Comparable<Dog>{
    private int id;
    private String name;
    private String alias;
    private String sex;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public int compareTo(Dog o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(id).append(" ").append(name).append(" ").append(alias).
                append(" ").append(sex));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (getId() != dog.getId()) return false;
        if (getName() != null ? !getName().equals(dog.getName()) : dog.getName() != null) return false;
        if (getAlias() != null ? !getAlias().equals(dog.getAlias()) : dog.getAlias() != null) return false;
        if (getSex() != null ? !getSex().equals(dog.getSex()) : dog.getSex() != null) return false;
        return getAddress() != null ? getAddress().equals(dog.getAddress()) : dog.getAddress() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getAlias() != null ? getAlias().hashCode() : 0);
        result = 31 * result + (getSex() != null ? getSex().hashCode() : 0);
        result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
        return result;
    }
}
