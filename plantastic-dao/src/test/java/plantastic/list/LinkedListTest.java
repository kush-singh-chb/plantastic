package plantastic.list;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    @Test void testConstructor() {
        var list = new LinkedList<String>();
        assertEquals(0, list.size());
    }

    @Test void testAdd() {
        var list = new LinkedList<String>();

        list.add("one");
        assertEquals(1, list.size());
        assertEquals("one", list.get(0));

        list.add("two");
        assertEquals(2, list.size());
        assertEquals("two", list.get(1));
    }

    @Test void testRemove() {
        var list = new LinkedList<String>();

        list.add("one");
        list.add("two");
        assertTrue(list.remove("one"));

        assertEquals(1, list.size());
        assertEquals("two", list.get(0));

        assertTrue(list.remove("two"));
        assertEquals(0, list.size());
    }

    @Test
    void testRemoveMissing() {
        var list = new LinkedList<String>();

        list.add("one");
        list.add("two");
        assertFalse(list.remove("three"));
        assertEquals(2, list.size());
    }
}
