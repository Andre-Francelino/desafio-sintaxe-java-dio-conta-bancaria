import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        /* 
            Desafio Conta Bancária - trilha Java Básico - DIO
                * Etapa 1 - Conhecer e importar a classe Scanner
                * Etapa 2 - Exibir mensagens para o usuário inserir valores
                * Etapa 3 - Obter via Scanner os valores digitados pelo usuário
                * Etapa 4 - Exibir para o usuário mensagem com dados da conta criada
        */

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Crie aqui sua conta!");

        System.out.println("Digite o seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Informe o número de sua conta: ");
        int numConta = sc.nextInt();

        System.out.println("Informe o número de sua agencia: ");
        String numAgencia = sc.next();
        
        System.out.println("Digite o valor do seu saldo: ");
        double saldo = sc.nextDouble();

        sc.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numAgencia + ", conta " + numConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
