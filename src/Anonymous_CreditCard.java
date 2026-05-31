public class Anonymous_CreditCard implements Payment {
    private  int creditCardNumber;
    public int Amount;
    @Override
  public void pay(double Amount){
        System.out.println("Paid" + " "+Amount+" "+"using Credit Card");

  }
  public Anonymous_CreditCard(int creditCardNumber) {
      this.creditCardNumber = creditCardNumber;
  }
}

