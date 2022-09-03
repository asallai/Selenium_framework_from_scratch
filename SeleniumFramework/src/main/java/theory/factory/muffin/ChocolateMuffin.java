package theory.factory.muffin;

public class ChocolateMuffin implements Muffin {

    @Override
    public void mixIngredients() {
        System.out.println("Mix ingredients for Chocolate muffin");
    }

    @Override
    public void bakeMuffin(int degree) {
        System.out.println("Bake Chocolate muffin " + degree + " celsius degree");
    }
}
