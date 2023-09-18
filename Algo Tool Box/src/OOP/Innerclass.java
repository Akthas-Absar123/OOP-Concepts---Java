package OOP;

class  outer{
    int num;
    void outerDisplay(){
        System.out.println("Outer display");

    }
    static class inner{
        int x;
        void innerdisplay(){
            System.out.println("Inner display");
        }
        //public static void main(String args[])
    }

}

public class Innerclass {

    public static void main(String args[]){
        outer o = new outer();
        o.num = 10;
        o.outerDisplay();
        //outer.inner i = o.new inner();// without static inner class
        outer.inner i = new outer.inner(); // with static class
        i.innerdisplay();

    }
}
