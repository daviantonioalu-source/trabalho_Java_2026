public class Produto {
    public int codigo;
    public String descricao;
    public Double preco;
    public int quantidade;

    // construtor do produto
    public Produto (int codigo, String descricao, double preco, int quantidade){
        this.codigo = codigo; //pega o valor e salva no objeto
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // usado pra mostrar o produto no console
    @Override
    public String toString() { //organiza e exibe
        return " Produto: " + codigo +
                "| ->" + descricao +
                "| R$" + preco +
                "| QTD: " + quantidade;
    }
}


