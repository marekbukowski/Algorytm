package pl.marek.software.deweloper.sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class PersonHeightCompraratorTest {
    @Test
    public void shouldSortPeopleByHeight() {
        Person person = new Person("Robert", "Lewandowski", 185);
        Person person1 = new Person("Kuba", "Błaszczykowski", 176);
        Person person2 = new Person("Łukasz", "Piszczek", 180);
        Person person3 = new Person("Wojciech", "Szczęsny", 190);

        List<Person> personList = Arrays.asList(person,person1,person2,person3);

        PersonHeightComprarator personHeightComprarator = new PersonHeightComprarator();
        Collections.sort(personList, personHeightComprarator);

        System.out.println(Arrays.toString(personList.toArray()));
    }
}