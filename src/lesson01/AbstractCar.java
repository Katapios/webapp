package lesson01;

/**
 * Package: lesson01
 * Creator: lordrumin
 * Has Created: 16.02.2018
 **/
public abstract class AbstractCar implements Car {
    protected int speed =20;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void getDesctiption() {
        out("\n" + this.getClass().getSimpleName() + "(Speed: " + speed  + ", EngineVolume:"+getEngineVolume()+ ")");
    }
    private void out(String str){
        System.out.println(str);
    }


}
