import java.util.Scanner;

public class ConversaoWrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: "); // Mostra mensagem

        int numeroPrimitivo = scanner.nextInt(); // Lê número inteiro

        Integer numeroWrapper = numeroPrimitivo; // Converte para Wrapper

        System.out.println("Valor convertido para Wrapper: " + numeroWrapper); // Imprime

        scanner.close(); // Fecha o scanner
    }
}



