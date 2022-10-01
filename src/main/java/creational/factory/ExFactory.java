package creational.factory;


import creational.singleton.Ex;

public class ExFactory {

    public Ex createEx() {
        return Ex.getInstance();
    }
}
