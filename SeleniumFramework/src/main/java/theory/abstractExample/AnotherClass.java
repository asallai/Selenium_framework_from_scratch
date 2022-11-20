package theory.abstractExample;

public class AnotherClass extends AbstractClass {

    void addNumber() {
        System.out.println("Add number");
    }

    void multiplyNumber() {
        System.out.println("Multiply number");
    }

    @Override
    void printNumber() {
        System.out.println("Number (in overridden method");
    }

}
