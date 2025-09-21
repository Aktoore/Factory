package factory;

public class HpLap implements Laptop {
    @Override
    public String getBrand() {
        return "HP";
    }

    @Override
    public String getConfiguration() {
        return "Ryzen 7, 16GB RAM, RTX 9090Ti";
    }
}

