package com.company.MyGenericStack;

public class Node <E>{
    private E value;
    private Node<E> next;

    public Node(E value) {
        this.value = value;
        this.next = null;
    }

    public E getValue() {
        return value;
    }

    public Node<E> setValue(E value) {
        this.value = value;
        return this;
    }

    public Node<E> getNext() {
        return next;
    }

    public Node<E> setNext(Node<E> next) {
        this.next = next;
        return this;
    }
}
