

import java.util.Scanner;
public class Practice2{
    public int amount;

    public Practice2(Payment payment) {
    }

    //    Practice2(int amount){
//        this.amount = amount;
//    }
    public static void main(String[] args) {

    
        Practice2 p2 = new Practice2(new Payment(){
            public void Pay_Emi(int amount){
                System.out.println("Emi Paid!!");
            }
        });
    }
}