package OOP;
/*class vehicle{
    void ride(){

    }
}

class car extends vehicle{
    void ride(){
        System.out.println("you are riding a car");
    }
}
class mechanic{
    void check(vehicle v){
        System.out.println("Checking");
        v.ride();
    }
}
class bike extends vehicle{
    void ride(){
        System.out.println("you are riding a bike");
    }
}

public class Interface {
    public static void main(String args[]){
        mechanic m = new mechanic();
        car c = new car();
        bike b = new bike();
        m.check(c);
        m.check(b);

    }
}*/

//interface - what to do but not how to do
interface rideable{ // single abstract method interface - SAM interface
    int MAX_SPEED = 90; // FINAL , static
    void ride();// this is a abstarct method - no need abstract when using interface...
    static void display(){
        System.out.println("hello from rideable interface");

    }
}

class car implements rideable{
    public void ride(){
        System.out.println("you are riding a car");
    }
    public void display(){
        System.out.println("hello from car class");
    }
}
class mechanic{
    void check(rideable r){
        System.out.println("Checking");
        r.ride();
    }
}
class bike implements rideable{
    public void ride(){
        System.out.println("you are riding a bike");
    }
}

public class Interface {
    public static void main(String args[]){

        rideable r = new car();
        mechanic m = new mechanic();
        car c = new car();
        bike b = new bike();

        rideable.display();
        m.check(c);
        m.check(b);

        rideable r2 = new rideable (){

            public void ride(){
                System.out.println("you are riding a vintage car");
            }
        };
        r2.ride();

        //lembda expression - functional interface
        rideable r3 = () -> System.out.println("you are riding a convertible car");
        r3.ride();

    }
}