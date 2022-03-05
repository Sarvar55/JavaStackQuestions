package com.company.MyGenericStack;

public abstract class MyAbstractClass  {

    protected int size;

    protected MyAbstractClass(){
        size=0;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int getSize() {
        return size;
    }

}
