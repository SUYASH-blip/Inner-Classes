public class ShoppingCart {
    private double totalAmount;

    public ShoppingCart(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    public void Process_Payment(Payment paymentMethod){
        paymentMethod.pay(totalAmount);

    }
}
