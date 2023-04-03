package Person_Company;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Person> persons;

    public Company() {
        this.persons = new ArrayList<>();
        persons.add(new Person("Mihai", 30, "Manager"));
        persons.add(new Person("Ion", 32, "carpenter"));
        persons.add(new Person("Vasile", 33, "plummer"));
        persons.add(new Person("Luca", 45, "welder"));
        persons.add(new Person("Ionel", 50, "plummer"+" "));
    }

    public Person getManager() {
        for (Person pers : persons) {
            if (pers.getPosition().equals("Manager")) {
                pers.getName().toString();
            }
            return pers;

        }
        return null;

    }

    public List<Person> getPersons(String profesion) {
        List<Person> pers = new ArrayList<>();
        for (Person pers2 : persons) {
            if (pers2.getPosition().equals(profesion)) {
                pers.add(pers2);
            }
        }
        return pers;
    }

    public List<Person> getPersonOlderThan(int age) {
        List<Person> pers = new ArrayList<>();
        for (Person pers2 : persons) {
            if (pers2.getAge() > age) {
                pers.add(pers2);
            }
        }
        return pers;
    }

    public List<Person> getPersonByFilter(String filterName) {
        List<Person> pers = new ArrayList<>();
        for (Person pers2 : persons) {
            if (pers2.getName().contains(filterName)) {
                pers.add(pers2);
            }
        }
        return pers;
    }

    public Person employPerson(Person personNew) {
        persons.add(personNew);
        System.out.print(persons.get(1));
        System.out.print(" "+persons.get(2));
        System.out.print(" "+persons.get(3));
        System.out.print(" "+persons.get(4));
        return personNew;
    }
}
