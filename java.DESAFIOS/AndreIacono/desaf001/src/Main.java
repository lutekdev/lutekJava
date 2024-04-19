import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num1 = x.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = x.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int num3 = x.nextInt();

        System.out.println("Primeiro Numero digitado foi " + num1);
        System.out.println("Segundo Numero digitado foi " + num2);
        System.out.println("Terceiro Numero digitado foi " + num3);
    }
}
