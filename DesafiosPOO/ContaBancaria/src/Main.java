import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner (System.in);

                int numeroConta = scan.nextInt();
                scan.nextLine(); // Consome a quebra de linha após a entrada do número da conta
                String nomeTitular = scan.nextLine();
                double saldo = scan.nextDouble();

                //TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.
                ContaBancaria novoUsuario = new ContaBancaria(numeroConta, nomeTitular, saldo, df);
                System.out.println("Informacoes:");

                //TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
                novoUsuario.RetornoFormatado();
    }
}

class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    DecimalFormat df;


    public ContaBancaria(int numeroConta, String nomeTitular, double saldo, DecimalFormat df) {
                this.numero = numeroConta;
                this.titular = nomeTitular;
                this.saldo = saldo;
                this.df = df;
    }

    public void RetornoFormatado() {
        System.out.printf("Conta: %d\nTitular: %s\nSaldo: R$%s%n", numero, titular, df.format(saldo));
    }
}

