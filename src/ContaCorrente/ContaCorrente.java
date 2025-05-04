package ContaCorrente;

public class ContaCorrente {
    private int numero;
    private String titular;
    private float saldo;

    public ContaCorrente(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0f;
    }

    public boolean sacar(float valor) {
        if (valor <= 0 || valor > 10000) {
            System.out.println("Saque inválido, o saque deve ser maior que 0 e até R$10.000.");
            return false;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
            return false;
        }
        saldo -= valor;
        System.out.println("Saque realizado.");
        return true;
    }

    public boolean depositar(float valor) {
        if (valor <= 0 || valor > 10000) {
            System.out.println("Depósito inválido, o depósito deve ser maior que 0 e menor que R$10.000.");
            return false;
        }
        saldo += valor;
        System.out.println("Depósito realizado.");
        return true;
    }

    public float consultarSaldo() {
        return saldo;
    }
}

