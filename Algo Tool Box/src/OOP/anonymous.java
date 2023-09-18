package OOP;
class cycle{
    void display(){
        System.out.println("I am a cycle");

    }

}
class tricycle extends cycle{
    void display(){
        System.out.println("Iam a tricycle"); // we can call it in main function like below mentioned
    }
}
public class anonymous {
    public static void main(String[] args){
        cycle c = new cycle() {
            void display() {
                System.out.println("Iam a tricycle"); // ananymous method - call in a main function
            }
        };

        cycle d = new cycle();
        c.display();
        d.display();
    }
}
