public class Main {
    public static void main(String[] args) {
        Car car1 = new Car.CarBuilder()
                .setBrand("Lexus")
                .setModel("570")
                .build();

        Car car2 = new Car.CarBuilder()
                .setBrand("Porsche")
                .setModel("911")
                .build();

        System.out.println(car1);
        System.out.println(car2);
    }
}