public abstract class Car {
    int wheels = 4;
    String name;
    int steringWheel = 1;

    Car(){
       System.out.println("Inside default constructor");
    }
    Car(String name){
        this();
        this.name = name;
        System.out.println("Inside parametrized constructor");
    }
    public abstract void accelarate();

    public void stop(){

    }

    public void start(){

    }
}
