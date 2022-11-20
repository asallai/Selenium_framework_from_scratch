package theory.factoryExample.car;

public class SuvCar implements Car {

    @Override
    public void buildCar() {
        System.out.println("Build a SUV car");
    }
}
