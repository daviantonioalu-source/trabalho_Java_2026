public class Produto {
    public int codigo;
    public String descricao;
    public Double preco;
    public int quantidade;

    // construtor do produto
    public Produto (int codigo, String descricao, double preco, int quantidade){
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // usado pra mostrar o produto no console
    @Override
    public String toString() {
        return " Produto: " + codigo +
                "| ->" + descricao +
                "| R$" + preco +
                "| QTD: " + quantidade;
    }
}



//O que é uma pilha
//2. O que é uma fila
//3. Por que a pilha segue a lógica LIFO
//4. Por que a fila segue a lógica FIFO
//5. Como o array foi usado para armazenar os dados
//6. Como funcionam as variáveis de controle, como:
//o topo da pilha
//o início e fim da fila