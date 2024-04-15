//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        productList("Laranja", 20.0);
        productList("Banana", 5.5);
    }

    // Create New Method
    public static void productList(String productName, double productValue) {
        System.out.println(productName + " de valor $" + productValue);
    }
}