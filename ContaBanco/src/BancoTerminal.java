public class BancoTerminal {
    public static void main(String[] args) {
        // Definindo os valores iniciais
        double saldo = 25;
        double valorSolicitado = 18;

        // Verificando se o saldo é suficiente para o saque
        if (saldo >= valorSolicitado) {
            // Realizando o saque
            saldo = saldo - valorSolicitado;
        } else {
            // Exibindo mensagem de saldo insuficiente
            System.out.println("Saldo insuficiente");
        }

        // Imprimindo o saldo atual
        System.out.println("Saldo atual: " + saldo);

        // Realizando a mesma operação com outros valores
        saldo = 15;
        valorSolicitado = 22;

        // Verificando se o saldo é suficiente para o saque
        if (saldo >= valorSolicitado) {
            // Realizando o saque
            saldo = saldo - valorSolicitado;
        } else {
            // Exibindo mensagem de saldo insuficiente
            System.out.println("Saldo insuficiente");
        }

        // Imprimindo o saldo atual
        System.out.println("Saldo atual: " + saldo);
    }
}
