abstract class Payment {
   
    public abstract void pay(double amount);

    
    public void printPaymentDetails(double amount) {
        System.out.println("Payment Details:");
        System.out.println("Amount: $" + amount);
    }
}


class CreditCardPayment extends Payment {
    @Override
    public void pay(double amount) {
        printPaymentDetails(amount);
        System.out.println("Paying with Credit Card...");
      
    }
}


class UPIPayment extends Payment {
    @Override
    public void pay(double amount) {
        printPaymentDetails(amount);
        System.out.println("Paying with UPI...");
        // Add UPI payment logic here
    }
}


public class Payment1 {
    public static void main(String[] args) {
        
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        UPIPayment upiPayment = new UPIPayment();

        
        creditCardPayment.pay(100.0);
        upiPayment.pay(50.0);
    }
}