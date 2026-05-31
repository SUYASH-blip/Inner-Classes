public class Anonymous_WithoutCreditCardTest {
    public static void main(String[] args) {
        Anonymous_ShoppingCart shoppingCart = new Anonymous_ShoppingCart(990);
        shoppingCart.Process_Payment(new Payment() {
            @Override
            public void pay(double Amount) {
                System.out.printf("Paid"+" "+Amount+" "+" using Credit Card");
            }
        });

    }
}

