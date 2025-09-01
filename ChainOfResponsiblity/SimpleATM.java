public class SimpleATM {
    public static void main(String[] args) {
        // create chain 500 -> 200 -> 100
        ATMHandler h500 = new ATMHandler(500);
        ATMHandler h200 = new ATMHandler(200);
        ATMHandler h100 = new ATMHandler(100);

        h500.setNext(h200);
        h200.setNext(h100);

        int withDrowAmount = 1200;
        System.out.println("User requested: " + withDrowAmount);
        h500.ProcessAmount(withDrowAmount);
    }
}

class ATMHandler {
    private int amount;
    private ATMHandler next;

    //Constructor to set the amount
    public ATMHandler(int amount) {
        this.amount = amount;
    }

    //Function to set the next handler
    public void setNext(ATMHandler next) {
        this.next = next;
    }

    //Function to process the amount
    public void ProcessAmount(int withDrowAmount) {
        if (withDrowAmount >= amount) {
            int notes = withDrowAmount / amount;
            int remainder = withDrowAmount % amount;
            System.out.println("Dispensing " + notes + " notes of " + amount);

            if (remainder != 0 && next != null) {
                next.ProcessAmount(remainder);
            }
        } else if (next != null) {
            next.ProcessAmount(withDrowAmount);
        }
    }
}

