import java.util.Scanner;

public class Main {
    void main() {
        byte myAge = 10;
        int myAmount = 5002;
        String test = "Hello, World";
        String firstName = "Lutek";

        /*
            Documentação de Documento;
        */

        //        System.out.println(STR."\{myAge} \{myAmount}");
        //        System.out.println(STR."Meu nome é \{firstName} esse meu nome possue \{firstName.length()} Letras");
        //inputTeste();
        //projeto01();
        desafio01();
    }

    void inputTeste() {

        try {
            System.out.print("Digite a sua idade: ");
            Scanner ageScanner = new Scanner(System.in);
            byte ageClient = ageScanner.nextByte();

            System.out.println(STR."A idade que você digitou, corresponde a: \{ageClient} anos");
        } catch (Exception error) {
            System.out.println("Você digitou um valor invalido!");
        }
    }

    void projeto01() {
        // FAZENDO UMA CALCULADORA QUE FAÇA APENAS SOMA
        try {
            Scanner firstNumber = new Scanner(System.in);
            System.out.print("- Digite o primeiro numero: ");
            byte number1 = firstNumber.nextByte();

            Scanner secondNumber = new Scanner(System.in);
            System.out.print("- Digite o segundo numero: ");
            byte number2 = secondNumber.nextByte();

            System.out.println(STR."A Soma é: \{number1 + number2}");
        } catch (Exception err) {
            System.out.println("- Desculpe, você digitou um valor invalido, tente digitar números.");
        }
    }

    void desafio01() {
        // FAZENDO UMA CALCULADORA QUE FAÇA APENAS SOMA COM DECIMAIS
        try {
            Scanner firstNumber = new Scanner(System.in);
            System.out.print("- Digite o primeiro numero: ");
            float number1 = firstNumber.nextFloat();

            Scanner secondNumber = new Scanner(System.in);
            System.out.print("- Digite o segundo numero: ");
            float number2 = secondNumber.nextFloat();

            System.out.println(STR."A Soma é: \{number1 + number2}");
        } catch (Exception err) {
            System.out.println("- Desculpe, você digitou um valor invalido, tente digitar números.");
        }
    }
}
