public class Anonymous_ShoppingCart {
    private double totalAmount;

    public Anonymous_ShoppingCart(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    public void Process_Payment(Payment paymentMethod){
        paymentMethod.pay(totalAmount);

    }
}
