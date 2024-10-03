package OOPSdemo;

abstract class Vehicle{
    abstract void start();

    void run(){
        System.out.println("Vehicle is running....");
    }
}

class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("Car is starting.....");
    }
}

class Bus extends Vehicle{
    @Override
    void start(){
        System.out.println("Bus is starting.....");

    }
}
public class AbstractionDemo {
    public static void main(String args[]){
        Vehicle  car1 = new Car();
        Vehicle bus1 = new Bus();
        car1.start();
        car1.run();

        bus1.start();
        bus1.run();
    }

}
