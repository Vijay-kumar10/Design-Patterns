public class VegDecorator extends PizzaDecorator {
    public VegDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Veggies";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 5.00; // Cost of adding veggies
    }
    
}
