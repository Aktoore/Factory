import abstractfactory.FactoryProvider;
import abstractfactory.LaptopAbstractFactory;
import factory.Laptop;
import factory.LaptopFactory;
import data.LaptopData;

public class Main {
    public static void main(String[] args) {
        System.out.println("Simple Factory");
        for (String brand : LaptopData.brands) {
            Laptop laptop = LaptopFactory.getLaptop(brand);
            System.out.println(laptop.getBrand() + " -> " + laptop.getConfiguration());
        }
        System.out.println("Abstract Factory");
        for (String type : LaptopData.types) {
            LaptopAbstractFactory factory = FactoryProvider.getFactory(type);
            Laptop laptop = factory.createLaptop();
            System.out.println(type + " Laptop:" + laptop.getBrand() + "->" + laptop.getConfiguration());
        }
    }
}