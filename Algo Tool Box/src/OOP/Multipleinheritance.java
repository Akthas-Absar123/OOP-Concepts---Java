package OOP;

class A{
    void display(){
        System.out.println("From class B");
    }
}
class B{
    void display(){
        System.out.println("From class C");
    }
}
class C extends B{ // we cant use multiple inheritance ... : extends B,A{ cant use this...

}
public class Multipleinheritance {
    public static void main(String args[]){
        C c = new C();
        c.display();
    }
}
