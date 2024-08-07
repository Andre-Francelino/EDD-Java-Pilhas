package estudosExtrasPilha;

public class MainStack {
    public static void main(String[] args) {
        Stack pilha = new Stack(5);
        pilha.push(100);
        pilha.push(99);
        pilha.push(874);
        pilha.push(4);
        pilha.push(16);

        System.out.println(pilha);
        System.out.println(pilha.peek());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.peek());

        System.out.println(pilha.isEmpty());

        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());

        System.out.println(pilha);

        System.out.println(pilha.isEmpty());
        System.out.println(pilha.peek());
    }
}
