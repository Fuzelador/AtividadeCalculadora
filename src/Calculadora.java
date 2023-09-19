import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            double num1, num2, resultado;
            char operacao;
            
            System.out.print("Digite o primeiro número: ");
            num1 = scanner.nextDouble();
            
            System.out.print("Digite o segundo número: ");
            num2 = scanner.nextDouble();
            
            System.out.print("Digite a operação (+, -, *, /): ");
            operacao = scanner.next().charAt(0);
            
            switch(operacao) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    resultado = num1 / num2;
                    break;
                default:
                    System.out.println("Operação inválida.");
                    return;
            }
            
            System.out.println(num1 + " " + operacao + " " + num2 + " = " + resultado);
        }

    }

}