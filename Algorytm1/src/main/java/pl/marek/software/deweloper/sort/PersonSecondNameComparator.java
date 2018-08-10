package pl.marek.software.deweloper.sort;

import java.util.Comparator;

public class PersonSecondNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        String secondName1 = person1.getSecondName();
        String secondName2 = person2.getSecondName();
        secondName1.compareTo(secondName2);
        return person1.getSecondName().compareTo(person2.getSecondName());
    }
}
