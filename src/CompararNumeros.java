import java.util.Scanner;  // Importa o Scanner para ler a entrada do usuário

public class CompararNumeros {
    public static void main(String[] args) {
        // Criando o Scanner para pegar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pedindo ao usuário para digitar o primeiro número
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();  // Lê o primeiro número inteiro

        // Pedindo ao usuário para digitar o segundo número
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();  // Lê o segundo número inteiro

        // Comparando os dois números e exibindo a mensagem adequada
        if (numero1 == numero2) {
            System.out.println("Os números são iguais.");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro número é maior que o segundo  número digitado.");
        } else {
            System.out.println("O segundo número é maior que o primeiro número digitado.");
        }

        // Fechando o Scanner
        scanner.close();
    }
}
