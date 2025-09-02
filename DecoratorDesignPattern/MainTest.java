public class MainTest {
    public static void main(String[] args) {
        Pizza myPizza = new BasicPizza();
        System.out.println(myPizza.getDescription()+" & the Cost is : $" + myPizza.getCost());
        Pizza cheesePizza = new CheeseDecorator(myPizza);//adding cheese on top of basic pizza
        System.out.println(cheesePizza.getDescription()+" & the Cost is : $" + cheesePizza.getCost());
        Pizza vegPizza = new VegDecorator(cheesePizza); // Adding veggies on top of cheese pizza
        System.out.println(vegPizza.getDescription()+" & the Cost is : $" + vegPizza.getCost());
    }
}
