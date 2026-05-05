public class test {
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart(990);
        CreditCard creditCard = new CreditCard(3535);
         shoppingCart.Process_Payment(creditCard);

    }
}
