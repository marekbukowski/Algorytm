package pl.marek.software.deweloper.sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class PersonFirstNameLenghtComparatorTest {
    @Test
    public void shouldSortPeopleByFirstNameLength() {

        Person person = new Person("Robert", "Lewandowski", 185);
        Person person1 = new Person("Kuba", "Błaszczykowski", 176);
        Person person2 = new Person("Łukasz", "Piszczek", 180);
        Person person3 = new Person("Wojciech", "Szczęsny", 190);

        List<Person> personList = Arrays.asList(person,person1,person2,person3);

        Comparator<Person> personFirstNameLengthComparator = new PersonFirstNameLenghtComparator();
        Collections.sort(personList, personFirstNameLengthComparator);

        System.out.println(Arrays.toString(personList.toArray()));
    }
}