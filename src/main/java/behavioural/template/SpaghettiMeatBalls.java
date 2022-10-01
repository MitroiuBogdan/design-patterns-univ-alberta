package behavioural.template;

public class SpaghettiMeatBalls extends PastaDish {

    @Override
    void addSauce() {
        System.out.println("SpaghettiMeatBalls : addSauce");
    }

    @Override
    void addProtein() {
        System.out.println("SpaghettiMeatBalls : addProtein");
    }

    @Override
    void addGarnish() {
        System.out.println("SpaghettiMeatBalls : addGarnish");
    }

}

