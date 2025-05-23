package patterns.factory.abstracts.pizza;

import patterns.factory.abstracts.ingredients.*;

import java.util.ArrayList;

public abstract class Pizza {
    public String name;
    public Dough dough;
    public Sauce sauce;
    public Veggies veggies[];
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clam;

    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    };

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    };

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    };

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}
