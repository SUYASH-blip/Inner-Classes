public class Anonymous_test {
    public static void main(String[] args) {

        Anonymous_ShoppingCart shoppingCart = new Anonymous_ShoppingCart(990);
        Anonymous_CreditCard creditCard = new Anonymous_CreditCard(3535);
         shoppingCart.Process_Payment(creditCard);

    }
}
