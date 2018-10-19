package deqo.ysan.mysimplestack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack implements SimpleStack {
    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public int getSize() {
        return items.size();
    }

    @Override
    public void push(Item item) {
        items.add(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        if (getSize() == 0)
            throw new EmptyStackException();
        return items.get(0);
    }

    @Override
    public Item pop() throws EmptyStackException {
        if (getSize() == 0)
            throw new EmptyStackException();
        Item unItem = items.get(0);
        items.remove(0);
        return unItem;
    }

    public Stack() {
        items = new ArrayList<Item>();
    }

    private List<Item> items;
}
