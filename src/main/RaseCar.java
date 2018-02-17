package main;

/**
 * Package: main
 * Creator: lordrumin
 * Has Created: 17.02.2018
 **/
public class RaseCar extends AbstractCar {
    RaseCar() {
         speed =300;
    }

    @Override
    public double getEngineVolume() {
        return 2.3;
    }
}
