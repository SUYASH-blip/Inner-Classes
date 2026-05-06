class Pen{
   private static String ink;
    private String model;

    class Inner {

        Inner(String model,String ink ){
            Pen.this.model = model;
            Pen.this.ink = ink;

        }

        void display() {

            System.out.println(model+" "+ink+" ");

        }
    }


}
public class Practice2 {
    public static void main(String[] args) {
     Pen p1 = new Pen();
     Pen.Inner i1 = p1.new Inner("Pentonic","Blue");
     i1.display();
     Pen.Inner i2 = p1.new Inner("Pentonic","Black");
     i2.display();

    }
}
