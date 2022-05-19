public abstract class Conta implements IConta{
    private int agencia;
    private int nome;
    private double saldo;



    public int getAgencia() {
        return agencia;
    }

    public int getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }


    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

    }
}
