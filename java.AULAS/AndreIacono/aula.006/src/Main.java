public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "X6", 2024, 130000);

        System.out.println(car.getMarca());
        System.out.println(car.getModelo());
        System.out.println(car.getAno());
        System.out.println(car.getPreco());
    }
//    private void test() {
//        Clients c001 = new Clients();
//        c001.firstName = "Lutek";
//        c001.age = 20;
//
//        Clients c002 = new Clients();
//        c002.firstName = "Andre";
//        c002.age = 28;
//
//        c001.newAccount();
//        //        c002.newAccount();
//
//        //        System.out.println(c001.firstName + " " + c001.age);
//        //        System.out.println(c002.firstName + " " + c002.age);
//    }
}
