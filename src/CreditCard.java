public class CreditCard implements Payment {
    private  int creditCardNumber;
    public int Amount;
    @Override
  public void pay(double Amount){
        System.out.println("Paid" + " "+Amount+" "+"using Credit Card");

  }
  public CreditCard(int creditCardNumber) {
      this.creditCardNumber = creditCardNumber;
  }
}

