package com.tasks3.linkedlist;

import java.io.IOException;

/**
 * Created by Oleksandr_Mosin on 3/16/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        LinkedList list = new LinkedList();
        list.size();
        list.add(9);
        list.add(70);
        list.size();
        list.add(99);
        list.size();
        list.add(88);
        list.size();
        list.delete(3);
        list.size();
    }
}
