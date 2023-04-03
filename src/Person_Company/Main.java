package Person_Company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args){
Company company=new Company();
        System.out.println(company.getManager());
        System.out.println(company.getPersons("plummer"));
        System.out.println(company.getPersonOlderThan(30));
        System.out.println(company.getPersonByFilter("hai"));
        System.out.println(company.employPerson(new Person("Lucian",30,"driver")));




    }
}
