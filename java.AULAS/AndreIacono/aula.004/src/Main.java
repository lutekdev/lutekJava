import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        desafioDay04b();
    }

    private static void switchStatement() {
        System.out.print("Digite o nome do produto: ");
        Scanner x = new Scanner(System.in);

        String nome = x.next().toLowerCase();

        switch (nome) {
            case "maça", "manga", "pera":
                System.out.println("O Produto escolhido foi: " + nome.toUpperCase());
                break;
            default:
                System.out.println("O produto falado não está na lista de produtos");
                break;
        }
    }

    private static void forLoop() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Gol", "Chevrolet", "Ferrari"};

        System.out.println("Quantidade de Carros: " + cars.length);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(i + " Modelo do Carro: " + cars[i]);
        }
    }

    private static void forLoopNested() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }

    private static void whileLoop() {
        int i = 0;

        while (i <= 10) {
            System.out.println(i + " - Hi");
            i++;
        }
    }

    private static void desafioDay04a() {
        for (int i = 0; i <= 100; i++) {
            //            if (i % 2 == 0) {
            //                System.out.print(i + " ");
            //            }

            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void desafioDay04b() {
        System.out.print("Digite algo: ");
        Scanner x  = new Scanner(System.in);

        String nome = x.nextLine();

        for (int i = 0; i < nome.length(); i++) {
            System.out.print(nome.charAt(i) + " ");
        }
    }
}
