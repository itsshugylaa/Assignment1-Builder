public class Car {
    private String brand;
    private String model;

    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }

    public static class CarBuilder {
        private String brand;
        private String model;

        public CarBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
