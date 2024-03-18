import java.util.Scanner;

public class AtividadeQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // O usuário escolhe qual operação
        System.out.println("\n Digite \n (1) para calcular e imprimir o perímetro do círculo\n (2) para calcular e imprimir a área do círculo.\n (3) para calcular e imprimir o volume da esfera.\n ");
        double valor1 = scanner.nextDouble();

        // Depois de escolhida a operação, ele coleta os dados para realiza - lá
        System.out.println("Digite o valor do Raio: ");
        double valor2 = scanner.nextDouble();
        double resposta1 = 1;
        double resposta2 = 2;
        double resposta3 = 3;

        // Abrimos as condições "If"...onde ele vai fazer a conta conforme a escolha da operação
        if (valor1 != resposta1 && valor1 != resposta2 && valor1 != resposta3) {
            System.out.println("Operação inválida, por favor digite o número da operação correto.");
            return;
        // Caso seja 1, esse comando será executado.
        }else if (valor1 == 1) {
            double pi = 3.141592;
            double perimetro = 2 * pi * valor2;
            System.out.println("O perímetro desse círculo é: " + perimetro);
        // Caso 2, esse será executado.
        }else if (valor1 == 2) {
            double pi = 3.141592;
            double area = pi * valor2 * valor2;
            System.out.println("A área do círculo é: " + area);
        // Caso não seja 1 e 2, será executado o abaixo.
        }else {
            double pi = 3.141592;
            double volume = (valor2 * valor2 * valor2) * 4 / 3 * pi;
            System.out.println("O volume desse círculo é: " + volume);
        }
        scanner.close();
    }
}
