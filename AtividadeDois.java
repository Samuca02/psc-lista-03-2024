import java.util.Scanner;

public class AtividadeDois {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Recebe o número escolhido pelo usuário.
        System.out.println("Digite um número para o que deseja comprar: ");
        System.out.println("Digite (1) Salgadinho (2) Doces (3) Sucos e (4) Refrigerante: ");
        double num1 = scanner.nextDouble();
        //Recebe o valor do item.
        System.out.println("Qual o valor do item? ");
        double num2 = scanner.nextDouble();
        //Recebe o valor pago.
        System.out.println("Qual o valor pago? ");
        double num3 = scanner.nextDouble();
        
        scanner.close();
        //Declarei a variável troco e como ele será calculado.
        double troco = (num3 - num2);
        System.out.println("O troco é de: R$" + troco);

        if (troco < num2) {
            System.out.println("Valor insuficiente, por favor insira mais dinheiro. ");
            return;
        }
        //Depois criamos a variável cedula para armazenar os valores em R$, 
        //depois ele imprimi a mensagem com quantas cedulas ele devolverá o troco.
        int[] cedula = {50,20,10,5,2,1};
            for (int cedulas:cedula){
                int cedula2 = (int) troco/cedulas;
                System.out.println("\nNota(s) R$" + cedulas + ": " + cedula2);
            troco = troco - (cedula2 * cedulas);
            }

    }
}

