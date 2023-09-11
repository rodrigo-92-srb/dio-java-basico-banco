import java.text.DecimalFormat;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("---------- BANCO DIO ----------");
        System.out.println("------- CRIAÇÃO DE CONTA ------");

        System.out.println("Por favor insira o número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Por favor insira o número da agência: ");
        String agencia = scanner.next();
        StringBuilder agenciaFormatada = new StringBuilder();
        agenciaFormatada.append(agencia.substring(0, 3)).append("-");
        agenciaFormatada.append(agencia.charAt(3));

        System.out.println("Por favor insira o nome do cliente: ");
        String cliente = scanner.next();

        System.out.println("Por favor insira o saldo da conta: ");
        double saldo = scanner.nextDouble();
        DecimalFormat formatoMoeda = new DecimalFormat("R$ #,##0.00");
        String saldoFormatado = formatoMoeda.format(saldo);

        System.out.println("Olá "+cliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agenciaFormatada+", conta "+conta+" e seu saldo "+saldoFormatado+" já está disponível para saque.");

    }
}