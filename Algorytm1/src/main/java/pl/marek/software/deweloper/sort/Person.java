package pl.marek.software.deweloper.sort;

public class Person {

    private String firstName;
    private String secondName;
    private int height;

    public String getFirstName() {
        return firstName;
    }

    public int getFirstNameLength(){
        return firstName.length();
    }

    public String getSecondName() {
        return secondName;
    }

    public int getHeight() {
        return height;
    }

    public Person(String firstName, String secondName, int height) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.height = height;

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", height=" + height +
                '}';
    }
}
