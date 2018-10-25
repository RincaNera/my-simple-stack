package deqo.ysan.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    private Item item;
    private int data;

    @Before
    public void setUp() {
        data = 5;
        item = new Item(data);
    }

    @Test
    public void testGetData() {
        assertEquals(data, item.getData());
    }

    @Test
    public void testSetData() {
        item.setData(data + 1);
        assertEquals(data + 1, item.getData());
    }
}