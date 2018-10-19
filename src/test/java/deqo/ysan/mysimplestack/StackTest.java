package deqo.ysan.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class StackTest {
    @Before
    public void setUp() {
        stack = new Stack();
    }

    @Test
    public void testIsEmptyOnEmptyStack() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testIsEmptyOnNotEmptyStack() {
        stack.push(new Item(5));
        assertTrue(!stack.isEmpty());
    }

    @Test
    public void testGetSizeOnEmptyStack() {
        assertNotEquals(1, stack.getSize());
    }

    @Test
    public void testGetSizeOnNotEmptyStack() {
        stack.push(new Item(5));
        assertNotEquals(0, stack.getSize());
    }

    @Test (expected = EmptyStackException.class)
    public void testPeekOnEmptyStack() {
        stack.peek();
    }

    @Test
    public void testPeekOnNotEmptyStack() {
        Item unItem = new Item(5);
        stack.push(unItem);
        assertSame(unItem, stack.peek());
        assertEquals(1, stack.getSize());
    }

    @Test (expected = EmptyStackException.class)
    public void testPopOnEmptyStack() {
        stack.pop();
    }

    @Test
    public void testPopOnNotEmptyStack() {
        stack.push(new Item(5));
        stack.pop();
        assertNotEquals(1, stack.getSize());
    }

    @Test
    public void testPush() {
        stack.push(new Item(5));
        assertNotEquals(0, stack.getSize());
    }

    private Stack stack;
}