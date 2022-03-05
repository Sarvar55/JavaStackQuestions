package com.company.MyGenericStack;

public interface IStack<E> {

    public void push(E value);

    public E pop();

    public E peek();

}
