package lesson01;

/**
 * Package: lesson01
 * Creator: lordrumin
 * Has Created: 17.02.2018
 **/
public class SimpleCar extends AbstractCar {

    @Override
    public void getDesctiption() {
        super.getDesctiption();
        System.out.println("Something custom");
    }

    @Override
    public double getEngineVolume() {
        return 1.7;
    }
}
