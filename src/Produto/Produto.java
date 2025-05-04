package Produto;

public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private int estoque;

    public Produto(int codigo, String nome, double preco, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        setPreco(preco);
        this.estoque = estoque;
    }

    // Getters
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    // Setter para o preço (com validação)
    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("O preço deve positivo, o valor não foi alterado.");
        } else {
            this.preco = preco;
        }
    }


    public void exibirInfo() {
        System.out.println("Código: " +codigo);
        System.out.println("Nome: " +nome);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("Estoque: " +estoque + " unidades");
    }
}

