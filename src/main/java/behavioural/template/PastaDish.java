package behavioural.template;

public abstract class PastaDish {

    public PastaDish() {
    }

    public final void makeRecipe() {
        boilWater();
        addPasta();
        addSauce();
        addProtein();
        addGarnish();
    }

    abstract void addSauce();

    abstract void addProtein();

    abstract void addGarnish();

    private void boilWater() {
        System.out.println("Boil water");
    }

    private void addPasta() {
        System.out.println("Add pasta");
    }

}
