public class Main {
    public static void main(String[] args) {
    Conta cc = new contaCorrente();
        Conta cp = new contaPoupanca();
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
