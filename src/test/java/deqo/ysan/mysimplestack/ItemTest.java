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
        assertNotEquals(data + 1, item.getData());
    }

    @Test
    public void testSetData() {
        item.setData(data + 1);
        assertNotEquals(data + 2, item.getData());
    }
}