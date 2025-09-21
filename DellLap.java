package factory;

public class DellLap implements Laptop {

    @Override
    public String getBrand() {
        return "Dell";
    }

    @Override
    public String getConfiguration() {
        return "Intel i3, 4GB RAM, Intel UHD Graphics 630";
    }
}
