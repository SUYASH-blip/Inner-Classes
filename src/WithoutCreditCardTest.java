public class WithoutCreditCardTest {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart(990);
        shoppingCart.Process_Payment(new Payment() {
            @Override
            public void pay(double Amount) {
                System.out.printf("Paid"+" "+Amount+" "+" using Credit Card");
            }
        });

    }
}

