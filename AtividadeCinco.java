import java.util.Scanner;

public class AtividadeCinco {
    public static void main(String[] args){
        // Recebendo os números reais do usuário.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro númeoro real para a operação: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número real: ");
        double numero2 = scanner.nextDouble();

        //Recebendo a operação desejada do usuário.
        System.out.println("Digite o símbolo desejado para a operação (+, - ,/ ou ^): ");
        char simbolo = scanner.next().charAt(0);

        //Declarei as variavéis antes de usar o If, nomeei os sinais das operações.
        char subtração = '-';
        char soma = '+';
        char multiplicação = '*';
        char divisao = '/';
        char raiz = '^';
        
        //Utilizei o If para executar o comando de acordo com a escolha ja feita pelo usuário.
        if (simbolo == soma) {
            System.out.println("O resultado da soma desses números é: " + (numero1 + numero2));
        } else if (simbolo == subtração) {
            System.out.println("O resultado da subtração desses números é: " + (numero1 - numero2));
        } else if (simbolo == multiplicação) {
            System.out.println("O resultado da multiplicação desses números é: " + (numero1 * numero2));   
        } else if (simbolo == raiz) {
            System.out.println("A elevação desses números é: " +  Math.pow(numero1, numero2));
        } else if (simbolo == divisao && numero1 != 0 && numero2 != 0) {
            System.out.println("O resultado da divisão desses números é: " + (numero1 / numero2));
        } else if (numero1 == 0) {
            System.out.println("Não é possível a divisão por 0.");
            return;
        } else {
            System.out.println("Não é possível a divisão por 0.");
            return;
        }

        scanner.close();
    }
    
}
