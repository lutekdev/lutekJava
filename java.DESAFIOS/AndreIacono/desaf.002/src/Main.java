import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int input = sc.nextInt();

        String numPar = (input % 2 == 0) ? (input == 0) ? "Par" : (input >= 2 && input < 5) ? "A" : (input >= 6 && input < 20) ? "B" : (input > 20) ? "C" : "" : "Impar";

        System.out.println(numPar);
    }
}
