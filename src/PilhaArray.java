public class PilhaArray {
    private Produto[] produtos; // array onde ficam os produtos
    private int topo; // controla o topo da pilha

    public PilhaArray(int tamanho) {  //construtor
        produtos = new Produto[tamanho];
        topo = -1; // começa vazia
    }

    // adiciona um produto no topo
    public void push(Produto produto) {
        if (isFull()) {
            System.out.println("Pilha cheia!");
            return;
        }
        topo++; // sobe o topo
        produtos[topo] = produto; // coloca o produto na posição
    }

    // remove o produto do topo
    public Produto pop() {
        if (!isEmpty()) {
            Produto produto = produtos[topo]; // pega o topo
            produtos[topo] = null; // limpa a posição
            topo--; // desce o topo
            return produto;
        }
        System.out.println("Pilha vazia!");
        return null;
    }

    // mostra o topo sem remover
    public Produto peek() {
        if (!isEmpty()) {
            return produtos[topo];
        }
        System.out.println("Pilha vazia!");
        return null;
    }

    // verifica se a pilha está cheia
    public boolean isFull() {
        return topo == produtos.length - 1; //tamanho e indice
    }

    // exibe do topo até a base
    public void display() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");//evita vazio
            return;
        }

        for (int i = topo; i >= 0; i--) { //percorrer
            System.out.println(produtos[i]);
        }
    }

    // quantidade de elementos
    public int size() {
        return topo + 1;
    }//qtd elementos

    // verifica se está vazia
    public boolean isEmpty() {
        return topo == -1;
    } //verifica se não tem nada
}