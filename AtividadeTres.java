import java.util.Scanner;
public class AtividadeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Recebendo os valores de a, b e c
        System.out.println("Equação do segundo grau: ax² + bx + c = 0");
        System.out.println("Discriminante: delta = b² – 4ac");

        System.out.println("Digite o coeficiente 'a' da equação de segundo grau:");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o coeficiente 'b' da equação de segundo grau:");
        double numero2 = scanner.nextDouble();

        System.out.println("Digite o coeficiente 'c' da equação de segundo grau:");
        double numero3 = scanner.nextDouble();

        double delta = numero2 * numero2 - 4 * numero1 * numero3;
        //Coloco as condições para que seja realizado as operações.
        if (numero1 == 0 && numero2 == 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (numero1 == 0) {
            double raiz = -numero3 / numero2;
            System.out.println("Esta é uma equação de primeiro grau.");
            System.out.println("O valor da raiz real da equação é: " + raiz);
        } else if (delta < 0) {
            System.out.println("Esta equação não possui raízes reais.");
        } else if (delta == 0) {
            double raiz = -numero2 / (2 * numero1);
            System.out.println("Esta equação possui duas raízes reais e iguais.");
            System.out.println("O valor das raízes é: " + raiz);
        } else {
            double raiz1 = (-numero2 + Math.sqrt(delta)) / (2 * numero1);
            double raiz2 = (-numero2 - Math.sqrt(delta)) / (2 * numero1);
            System.out.println("Esta equação possui duas raízes reais e diferentes.");
            System.out.println("Os valores das raízes são: " + raiz1 + " e " + raiz2);
        }

        scanner.close();
            
    }
}