package abstractfactory;

import factory.DellLap;
import factory.Laptop;

public class GamingFactory implements LaptopAbstractFactory{
    @Override
    public Laptop createLaptop() {
        return new DellLap();
    }
}
