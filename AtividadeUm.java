import java.util.Scanner;

public class AtividadeUm{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Recebe os números.
        System.out.print("Digite um número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();
        
        //Declarei as variáveis abaixo.
        double resposta1 = Math.max(numero1, Math.max(numero2, numero3));
        double resposta2 = Math.min(numero1, Math.min(numero2, numero3));
        double resposta3 = (numero1 + numero2 + numero3) / 3;

        //Imprimir as mensagens abaixo de acordo com a resposta.
        System.out.println("O maior número é: " + resposta1);
        System.out.println("O menor número é: " + resposta2);
        System.out.println("A média aritimetica é: " + resposta3);

        scanner.close();
    }
}