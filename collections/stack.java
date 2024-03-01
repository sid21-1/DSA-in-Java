package collections;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {

        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Eleplaht");
        animals.push("Cat");
        System.out.println("Stack" + animals);

        System.out.println(animals.peek());

        animals.pop();

        System.out.println(animals.peek());
    }
}
