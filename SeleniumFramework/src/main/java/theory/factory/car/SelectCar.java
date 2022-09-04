package theory.factory.car;

public class SelectCar {

    public void selectCar() {
        CarFactory carFactory = new CarFactory();
        carFactory.chooseCar("suv");
    }
}
