package patterns.factory.simple;

public class PepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Pepperoni Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut Pepperoni Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Pepperoni Pizza");
    }
}
