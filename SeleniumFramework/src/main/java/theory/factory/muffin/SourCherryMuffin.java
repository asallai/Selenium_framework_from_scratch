package theory.factory.muffin;

public class SourCherryMuffin implements Muffin {

    @Override
    public void mixIngredients() {
        System.out.println("Mix ingredients for Sour Cherry muffin");
    }

    @Override
    public void bakeMuffin() {
        System.out.println("Bak Sour Cherry muffin");
    }

}
