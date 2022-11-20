package theory.factoryExample.muffin;

public class StrawberryMuffin implements Muffin {

    @Override
    public void mixIngredients() {
        System.out.println("Mix ingredients for Strawberry muffin");
    }

    @Override
    public void bakeMuffin(int degree) {
        System.out.println("Bake Strawberry muffin " + degree + " celsius degree");
    }
}
