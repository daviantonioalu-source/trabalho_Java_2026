public class FilaArray {

    private Produto[] estoque; // array da fila
    private int fim; // controla onde inserir

    public FilaArray(int tamanho){
        estoque = new Produto[tamanho];
        fim = 0; // começa vazia
    }

    // adiciona no final da fila
    public void enqueue(Produto p){
        if (isFull()){
            System.out.println("Fila cheia");
            return;
        }
        estoque[fim] = p; // insere no final
        fim++; // avança o fim
    }

    // remove o primeiro da fila
    public Produto dequeue(){
        if (!isEmpty()){
            Produto p = estoque[0]; // pega o primeiro

            // desloca todos para frente
            for (int i = 0; i < size() - 1; i++){
                estoque[i] = estoque[i + 1];
            }

            fim--; // diminui o tamanho
            return p;
        }
        System.out.println("Fila vazia!");
        return null;
    }

    // verifica se está vazia
    public boolean isEmpty() {
        return size() == 0;
    }

    // verifica se está cheia
    public boolean isFull(){
        return fim == estoque.length;
    }

    // quantidade de elementos
    public int size() {
        return fim;
    }

    // mostra o primeiro da fila
    public Produto front() {
        if (isEmpty()){
            System.out.println("Fila vazia!");
            return null;
        }
        return estoque[0];
    }

    // exibe todos os elementos
    public void display(){
        if (isEmpty()){
            System.out.println("Fila vazia");
            return;
        }

        for (int i = 0; i < size(); i++){
            System.out.println(estoque[i]);
        }
    }
}