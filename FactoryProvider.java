package abstractfactory;

public class FactoryProvider {
    public static LaptopAbstractFactory getFactory(String type) {
        switch (type.toLowerCase()) {
            case "gaming": return new GamingFactory();
            case "business": return new BusinessFactory();
            default: throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}
