package com.example.iterable;


import java.util.Iterator;
import  java.util.*;


public class Bag<t> implements Container<t>
{

    List<t> BagItems;

    public Bag()
    {
        BagItems = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return this.BagItems.isEmpty();
    }

    @Override
    public int size() {
        return BagItems.size();
    }


//void does not return anything
    @Override
    public void add(t item) {
       this.BagItems.add(item);
    }

    @Override
    public Iterator iterator() {
        return this.BagItems.iterator();
    }

    //@Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Bag{");
        sb.append(BagItems);
        sb.append('}');
        return sb.toString();
    }
}
