package com.company.MyGenericStack;

import com.company.hackerrankStack.MyAbstractClass;

public class MyStack<E> extends MyAbstractClass implements IStack<E> {
    private Node<E> top;

    @Override
    public void push(E value) {
        if (isEmpty())
            top = new Node<>(value);

        else {
            Node<E> temp = new Node<>(value);
            temp.setNext(top);
            top = temp;
        }
        size++;
    }

    @Override
    public E pop() {
        Node<E> temp = null;
        if (!isEmpty()) {
            temp = top;
            top = top.getNext();
            size--;
        }
        return temp.getValue();
    }

    @Override
    public E peek() {
        return top.getValue();
    }

    public void printStack() {
        Node<E> iter = top;
        for (int i = 0; i < size; i++) {
            System.out.println(iter.getValue());
            iter = iter.getNext();
        }
    }
}
