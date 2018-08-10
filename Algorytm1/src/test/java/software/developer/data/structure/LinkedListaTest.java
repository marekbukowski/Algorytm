package software.developer.data.structure;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListaTest {
    @Test
    public void ShouldPushElements() {
        List<String> list = new LinkedLista<String>();
        list.push("Kraków");
        list.push("Warszawa");
        list.push("Lublin");
        list.print();
    }

    @Test
    public void shuldInsertElementAfter() {
        List<String> list = new LinkedLista<String>();
        list.push("Kraków");
        list.push("Warszawa");
        list.push("Lublin");

    }
    @Test
    public void shuldAppendElement() {
        List<String> list = new LinkedLista<String>();
        list.push("Kraków");
        list.push("Warszawa");
        list.push("Lublin");
        list.append("Kielce");

        list.print();
    }
    @Test
    public void shouldDeleteElement(){
        List<String> list = new LinkedLista<String>();
        list.push("Kraków");
        list.push("Warszawa");
        list.push("Lublin");
        list.append("Kielce");
        list.delete("Lublin");

        list.print();
    }
}