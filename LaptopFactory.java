package factory;

public class LaptopFactory {
    public static Laptop getLaptop(String brand) {
        if (brand == null) {
            throw new IllegalArgumentException("Brand cannot be null");
        }

        switch (brand.toLowerCase()) {
            case "dell":
                return new DellLap();
            case "hp":
                return new HpLap();
            default:
                throw new IllegalArgumentException("Invalid brand: " + brand);
        }
    }
}
