package theory.factoryExample.muffin;

public class SourCherryMuffin implements Muffin {

    @Override
    public void mixIngredients() {
        System.out.println("Mix ingredients for Sour Cherry muffin");
    }

    @Override
    public void bakeMuffin(int degree) {
        System.out.println("Bake Sour Cherry muffin " + degree + " celsius degree");
    }
}
