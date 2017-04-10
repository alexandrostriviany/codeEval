package com.tasks3.linkedlist;

/**
 * Created by Oleksandr_Mosin on 3/14/2017.
 */
public class LinkedList {

    private Node node;
    private int size;

    /* Конструктор без аргументів */
    public LinkedList() {
    }

    /* Додати елемент в кінець списку */
    public void add(Integer data) {
        Node localNode = new Node();
        localNode.setData(data);
        if (this.node == null) {
            this.node = localNode;
        } else {
            Node tNode = this.node;
            while (tNode.getNext() != null) {
                tNode = tNode.getNext();
            }
            tNode.setNext(localNode);
        }
        size++;
    }

    /* Отримати елемент по індексу, повертає null якщо такий елемент недоступний */
    public Integer get(int index) {
        Node locNode = this.node;
        if (locNode == null || index < 0 || index > size()) {
            return null;
        } else if (size() == 0) {
            return locNode.getData();
        } else {
            for (int i = 0; i < index; i++) {
                locNode = locNode.getNext();
            }
            return locNode.getData();
        }
    }

//    /* Вилучення елементу за індексом, повертає true у разі успіху або false в іншому випадку */
    public boolean delete(int index) {
        Node node = this.node;
        Node delNode = null;
        Node nextNode = null;
        if (node == null || index > size() || index <= 0) {
            return false;
        } else {
            for (int i = 1; i<index; i++){
               delNode = node.getNext().getNext();
               this.node.setNext(delNode);
            }
            size--;
            return true;
        }
    }

//    public boolean delete(int index) {
//        Node node = this.node;
//        Node delNode = null;
//        Node nextNode = null;
//        if (node == null || index >= size() || index < 0)
//            return false;
//        else {
//            if (index == 0){
//                this.node = this.node.getNext();
//                return true;
//            }
//            else{
//                if (index == 1 && size() != 2 ){
//                    nextNode = node.getNext().getNext();
//                    node.setNext(nextNode);
//                    return true;
//                }
//                else{
//                    if (index == 1 && size() == 2 ){
//                        node.setNext(null);
//                        return true;
//                    }
//                    else {
//                        for (int i = 0; i < index - 1; i++)
//                            node = node.getNext();
//                        delNode = node;
//                        if (index == (size()-1))
//                            node.setNext(null);
//                        else {
//                            nextNode = delNode.getNext();
//                            node.setNext(nextNode);
//                        }
//
//                        delNode = null;
//                        size --;
//
//                        return true;
//                    }
//                }
//            }
//        }
//    }


    /* Поверта розмір списку: якщо елементів в списку нема то повертає 0 (нуль) */
    public int size() {
        return size;
    }
}
