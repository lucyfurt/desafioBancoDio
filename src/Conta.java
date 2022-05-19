public abstract class Conta implements IConta{
    private static  int SEQUENCIAL = 1;

    private static  int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int numero;
  protected double saldo;

    public Conta() {

        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNome() {
        return numero;
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
