package com.jiat.wickramage_uthila;

public class Test {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);


        System.out.println(stack);
        int pop = stack.pop();

        System.out.println(pop);

        System.out.println(stack);
    }
}
