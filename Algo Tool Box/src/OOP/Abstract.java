package OOP;
abstract  class Member{
    private  String name;
    abstract void Welcomemessage(); // abstract 2 other classes using Welcomemessage()......
    public String getName(){
        return name;
    }
}
class student extends Member{
    @Override
    void Welcomemessage() {
        System.out.println("Hello student....");
    }
}
class teacher extends Member{
    @Override
    void Welcomemessage() {
        System.out.println("Hello teacher....");
    }
}

public class Abstract {
    public static void main(String args[]){
        student s1 = new student();
        teacher t1 = new teacher();
        //Member m1 = new Member() ; // we cant call Member as a object. bcz, it is a abstract class...
        //Member m1 = new student(); // we can use this...

        Member[] m = new Member[4];
        m[0] = new student();
        m[1]= new student();
        m[2]= new teacher();
        m[3]= new teacher();

        for (Member m1: m){
            m1.Welcomemessage();
        }
    }


}
