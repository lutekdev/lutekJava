import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // int[] valores = {10, 15, 25, 30, 40};
        //
        // Arrays.sort(valores);
        //
        // System.out.println(Arrays.toString(valores));
        // System.out.println(STR."Dentro do Array possui \{valores.length}");

        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        //
        // System.out.println(Arrays.toString(cars));
        //
        // System.out.println(STR."Index of Ford: \{Arrays.asList(cars).indexOf("Ford")}");

        //        String[][] cars = {{"Volvo", "BMW"}, {"Ford", "Mazda"}};
        //
        //        Multidimensional Array
        //        System.out.println(Arrays.deepToString(cars));
        //
        //        Single Dimensional
        //        System.out.println(cars[0][1]);

        //         Definindo Contantes

        //        final double taxaJuros = 11.92;
        //        System.out.println(taxaJuros);

        // Operadores
        //        int a = 4;
        //        a++;
        //        a--;
        //        a--;
        //
        //        System.out.println(a);

        // Ordem dos operadores
        // 1.ºˢ Parenteses
        // 2.º Exponencial
        // 3.º Multiplicação,
        // 4.º Divisão,
        // 5.º Adição,
        // 6.º Subtração

        // Convertendo String em Integers
        //        String valorProduto = "10";
        //
        //        int valorTotal = Integer.parseInt(valorProduto)+ 2;
        //        System.out.println(valorTotal);

        // A Classe MATH
        //        double value = 10.2;
        //        System.out.println(Math.round(value)); // arredonda para o valor
        //        System.out.println(Math.ceil(value)); // arredonda para cima inteiro
        //        System.out.println(Math.floor(value)); // arredonda para baixo
        //
        //        System.out.println(Math.random()); // Gera um valor aleatory
        //        System.out.println(Math.round(Math.random() * 20)); // Gera um valor aleatory arredondado de 0 a 20

        System.out.println("\n");
        int[] my_array1 = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};

        String[] my_array2 = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};

        System.out.println(STR."Array 1 Original: \{Arrays.toString(my_array1)}");

        Arrays.sort(my_array1);
        System.out.println(STR."Array 1 Ordenada: \{Arrays.toString(my_array1)}\n");


        System.out.println(STR."Array 2 Original: \{Arrays.toString(my_array2)}");

        Arrays.sort(my_array2);
        System.out.println(STR."Array 2 Ordenada : \{Arrays.toString(my_array2)}");

        System.out.println(Math.abs(-5)); // valor absoluto sem sinal negativo
        System.out.println(Math.max(5, 10)); // maior valor entre 5 e 10
        System.out.println(Math.min(5, 10)); // menor valor entre 5 e 10
        System.out.println(Math.acos(0.25)); // arco cosseno
        System.out.println(Math.sqrt(64)); // raiz quadrada


        System.out.printf("%.2f%n", Math.PI); // 3.14 aproximadamente (Conta com 2 casas decimais)
        System.out.println(String.format("%2.2f", 20.5)); // 20.50 aproximadamente (2 casas decimais)
    }
}