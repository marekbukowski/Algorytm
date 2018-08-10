package pl.marek.software.deweloper.sort;

import java.util.Comparator;

public class PersonHeightComprarator implements Comparator<Person>{

    @Override
    public int compare(Person person1, Person person2) {
        return person1.getHeight()-person2.getHeight();
    }
}
