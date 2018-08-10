package pl.marek.software.deweloper.sort;

import java.util.Comparator;

public class PersonFirstNameLenghtComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        int length = person1.getFirstNameLength();
        int length2 = person2.getFirstNameLength();
        return length-length2;
    }
}
