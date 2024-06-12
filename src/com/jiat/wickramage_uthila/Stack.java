package com.jiat.wickramage_uthila;

import java.util.EmptyStackException;

public class Stack {
    private int[] data;
    private int size;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
        this.top = -1;
    }

    public boolean isFull() {
        return top == capacity - 1;

    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int value) {
        if (!isFull()) {
            data[++top] = value;
            size++;
        } else {
            throw new StackOverflowError();
        }
    }

    public int pop() {
        if (!isEmpty()) {

            int returnValue =  data[top--];
            data[--size] = 0;
            return returnValue;
        } else {
            throw new EmptyStackException();
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            throw new EmptyStackException();
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < size; i++) {
            builder.append(data[i]);
            if (i != size - 1) {
                builder.append(", ");

            }
        }
        builder.append("]");
        return builder.toString();
    }
}
