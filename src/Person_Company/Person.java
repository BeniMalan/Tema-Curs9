package Person_Company;

public class Person {
    private String Name;

    private String Position;
    private int Age;

    public String getName() {
        return Name;
    }

    public String getPosition() {
        return Position;
    }

    public int getAge() {
        return Age;
    }

    public Person(String name, int age, String position) {
        Name = name;
        Age = age;
        Position = position;
    }

    public String toString() {
        return "Name: " + Name + ", Age: " + Age + ", Position: " + Position;
    }
}


