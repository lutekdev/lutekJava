import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        desafio();
    }

    private static void desafio() {
        try {
            Scanner x = new Scanner(System.in);
            System.out.print("Dite um numero: ");
            int numero = Integer.parseInt(String.valueOf(x.nextInt()));

            if (String.valueOf(numero).length() == 5) {
                System.out.println("Este numero tem 5 digitos");
            } else if (String.valueOf(numero).length() > 5) {
                System.out.println("Este numero tem 5 ou mais digitos");
            } else {
                System.out.println("Este numero tem " + String.valueOf(numero).length() + " digitos");
            }
        } catch (Exception err) {
            System.out.println("Erro digite pelo menos até 10 digitos");
        }
    }

    private static void testeDay() {
        // Formatando Números em Java
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        String productValue = nf.format(120.12);
        System.out.println(productValue);

        // Operadores de Comparação
        // > maior
        // ≥ maior ou igual
        // < menor
        // ≤ menor, ou igual
        // == igual!
        // != diferente

        int a = 5;
        int b = 5;

        System.out.println(a >= b);

        // Operadores Logic's
        // && AND
        // || OR!
        // ! NOT

        // AND - Ambas as conditions precisam ser verdadeiras
        int priceProduct = 10;
        boolean isDiscount = priceProduct > 10 && priceProduct < 20;

        System.out.println(isDiscount);

        // OR - Uma das conditions precisa ser verdadeira
        boolean isDiscount2 = priceProduct > 15 || priceProduct < 10;
        System.out.println(isDiscount2);

        // IF e ELSE
        double priceCarObject = 80_000;

        if (priceCarObject == 90_000 && priceCarObject < 100_000) {
            System.out.println("Carro novo");
        } else {
            System.out.println("Carro velho");
        }

        // OPERATOR TERNARY
        int ingresso;

        Scanner x;
        x = new Scanner(System.in);
        System.out.print("Digite o Valor do Ingresso: ");
        ingresso = Integer.parseInt(String.valueOf(x.nextInt()));

        String terAcesso = ingresso >= 500 ? "VIP" : "Pista";
        System.out.println(terAcesso);
    }
}
