package com.iterator;

import java.util.NoSuchElementException;

public class DinerMenuIterator implements Iterator{

    MenuItem[] menuItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems){
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.length && menuItems[position] != null;
    }

    @Override
    public MenuItem next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more items in the menu.");
        }
        return menuItems[position++];
    }
}
