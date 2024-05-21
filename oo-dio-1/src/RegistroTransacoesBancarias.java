import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        // TODO: Crie a lista para armazenar as transações:
        List<String> transacoes = new ArrayList<>();
        List<Double> valores = new ArrayList<>();
        // TODO: Implemente um loop 'for' para iterar sobre as transações:
        for (int i=0; i<quantidadeTransacoes; i++) {
            String tipoTransacao = scanner.next();
            double valorTransacao = scanner.nextDouble();
            // Aqui é verificar o tipo de transação e atualiza o saldo da conta de acordo:
            if (tipoTransacao.equalsIgnoreCase("D")) {
                saldo += valorTransacao;
                // TODO: Adicione a transação à lista:
                transacoes.add("Deposito");
                valores.add(valorTransacao);

            } else if (tipoTransacao.equalsIgnoreCase("S")) {
                saldo -= valorTransacao;
                // TODO: Adiciona a transação à lista
                transacoes.add("Saque");
                valores.add(valorTransacao);

            } else {
                // Se o tipo de transação não for reconhecido, exibe uma mensagem de erro
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--;
            }
        }
        // Aqui é exibido o saldo final e a lista de transações ao final do processo:
        System.out.println("\nSaldo: " + saldo);
        System.out.println("\nTransacoes:");

        // TODO: Crie um loop 'for' para exibir cada transação na lista:
        for (int i=0; i<transacoes.size(); i++) {
            // TODO: Agora exiba o número da transação seguido da descrição da transação:
            System.out.println((i + 1) + ". " + transacoes.get(i) + " de " + valores.get(i));
        }
        scanner.close();
    }
}
