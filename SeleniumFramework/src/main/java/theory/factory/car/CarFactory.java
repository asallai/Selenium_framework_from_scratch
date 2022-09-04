package theory.factory.car;

public class CarFactory {

    public Car chooseCar(String carType) {
        if(carType == "compact")
            return new CompactCar();
        else if(carType == "sedan")
            return new SedanCar();
        else
            return new SuvCar();
    }
}
