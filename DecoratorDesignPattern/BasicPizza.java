public class BasicPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Name : Basic Pizza";
    }

    @Override
    public double getCost() {
        return 5.00; // Base cost of a basic pizza
    }
    
}
