package abstractfactory;

import factory.HpLap;
import factory.Laptop;

public class BusinessFactory implements LaptopAbstractFactory {
    @Override
    public Laptop createLaptop() {
        return new HpLap();
    }
}
