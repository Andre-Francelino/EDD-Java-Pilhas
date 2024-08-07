package estudosExtrasPilha;

import java.util.Arrays;

public class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    // construtor
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // adicionando elemento na pilha
    public void push(int value) {
        if (isFull()) {
            System.out.println("A pilha encontra-se cheia.");
        } else {
            stackArray[++top] = value;
        }
    }

    // verificando se pilha está cheia
    private boolean isFull() {
        return (top == maxSize - 1);
    }

    // removendo um elemento do topo da pilha
    public int pop() {
        if (isEmpty()) {
            System.out.println("A pilha encontra-se vazia!");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    // verificando se pilha está vazia
    public boolean isEmpty() {
        return (top == -1);
    }

    // retornando o elemento que está no topo da pilha sem removê-lo
    public int peek() {
        if (isEmpty()) {
            System.out.println("A pilha encontra-se vazia!");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    // reescrevendo o método toString para exibir dados da pilha.
    @Override
    public String toString() {
        return "Stack{" +
                "maxSize=" + maxSize +
                ", top=" + top +
                ", stackArray=" + Arrays.toString(stackArray) +
                '}';
    }
}
