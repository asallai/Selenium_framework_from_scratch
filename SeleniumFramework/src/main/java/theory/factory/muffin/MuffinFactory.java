package theory.factory.muffin;

public class MuffinFactory {

    public Muffin selectMuffin(String muffinType) {
        if(muffinType == "chocolate")
            return new ChocolateMuffin();
        else if(muffinType == "sour cherry")
            return new SourCherryMuffin();
        else
            return new StrawberryMuffin();
    }

}
