package com.tasks3.linkedlist;

/**
 * Created by Oleksandr_Mosin on 3/14/2017.
 */
public class Node {

    private Node next;
    private Integer data;

    public Node() {
    }

    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Integer getData() {
        return data;
    }
    public void setData(Integer data) {
        this.data = data;
    }
}
