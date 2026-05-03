class Car{
    private String model;

    class Engine{
        static final int x = 10;

        Engine(String model){
            Car.this.model = model;
            System.out.println(Car.this.model);
        }
    }


}

public class Member_Inner_Class {

    public static void main(String[] args) {
Car car = new Car();
Car.Engine engine = car.new Engine("Mercedes");
    }
}
