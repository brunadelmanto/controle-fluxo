public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 225.0;
        double valorSolicitado = 17.0;

        // CONDIÇÃO ENCADEADA
        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: " + saldo);
        } else
            System.out.println("Saldo insuficiente");

        // CONDIÇÃO TERNÁRIA
        String saldoBancario = valorSolicitado < saldo ? "Novo saldo: " + saldo : "Saldo insuficiente";
        System.out.println(saldoBancario);



    }

}
