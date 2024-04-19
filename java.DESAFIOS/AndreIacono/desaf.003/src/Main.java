import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("Digite o num1 op num2 (2 * 4): ");

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        String op = sc.next();
        int num2 = sc.nextInt();

        calc(num1, op, num2);
    }

    private static void calc(int num1, String op, int num2) {
        switch (op) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
        }
    }
}
