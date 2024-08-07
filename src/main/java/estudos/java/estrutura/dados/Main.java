package estudos.java.estrutura.dados;

public class Main {
    public static void main(String[] args) {

        Pilha minhaPilha = new Pilha();

        minhaPilha.push(new No(1));
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(4));
        minhaPilha.push(new No(5));
        minhaPilha.push(new No(6));
        minhaPilha.push(new No(7));
        System.out.println(minhaPilha);
        System.out.println("O topo da pilha nesse 1º momento é: " + minhaPilha.top() + "\n");

        System.out.println("Removendo o topo atual da pilha: " + minhaPilha.pop() + "\n");
        System.out.println(minhaPilha);

        minhaPilha.push(new No(777));
        System.out.println(minhaPilha);
        System.out.println("O topo da pilha agora é: " + minhaPilha.top() + "\n");

    }
}