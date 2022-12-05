public class Director {
    private String name;
    private String lastName;

    @Override
    public String toString() {
        return name + " "+
                 lastName  ;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Director(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}
