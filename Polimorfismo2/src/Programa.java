import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        CalculadoraAreas calc = new CalculadoraAreas();

        System.out.println("Digite o lado do quadrado: ");
        int lado = teclado.nextInt();

        System.out.println("Área do quadrado: " + calc.calcularArea(lado));


        System.out.println("\nDigite a base do retângulo: ");
        double base = teclado.nextDouble();

        System.out.println("Digite a altura do retângulo: ");
        double altura = teclado.nextDouble();

        System.out.println("Área do retângulo: " + calc.calcularArea(base, altura));


        System.out.println("\nDigite o raio do círculo: ");
        double raio = teclado.nextDouble();

        System.out.println("Área do círculo: " + calc.calcularArea(raio));

        teclado.close();
    }
}