package com.iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class PancakeHouseIterator implements Iterator{

    private List<MenuItem> menuItems;
    private int position = 0;

    public PancakeHouseIterator(List<MenuItem> menuItems){
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size() && menuItems.get(position) != null;
    }

    @Override
    public MenuItem next() {
        if(!hasNext()){
            throw new NoSuchElementException("No more items in the menu.");
        }
        return menuItems.get(position++);
    }
}
