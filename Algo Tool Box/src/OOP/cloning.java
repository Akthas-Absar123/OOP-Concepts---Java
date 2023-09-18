/*package OOP;
import java.util.*;


class department {
    int deptid;
    String name;

    department(int id, String n) {
        deptid = id;
        name = n;
    }

    void display() {
        System.out.println("dept Id is :" + deptid);
        System.out.println("dept Name is :" + name);

    }


}

class studen implements Cloneable {
    int id;
    Date dob;
    String name;
    department dept;


    studen(int i, String n, department d) {
        id = i;
        name = n;
        dept = d;
    }
    studen(studen s){
        this.id = s.id;
    }

    void display() {
        System.out.println("Id is :" + id);
        System.out.println("Name is :" + name);
        dept.display();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        studen s = (studen) super.clone();
        return s;

    }



}

public  class cloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        department dept = new department(1, "physics");
        studen s1 = new studen(1, "hari", dept);
        studen s2 = (studen) s1.clone();// shallow copy

        studen s3 = new studen(s1);


        dept.name = "maths";

        s1.display();

        s2.display();
    }

}*/

// this is the method that giving maths and physics seperately in different references.
package OOP;
import java.util.*;


class department {
    int deptid;
    String name;

    department(int id, String n) {
        deptid = id;
        name = n;
    }

    void display() {
        System.out.println("dept Id is :" + deptid);
        System.out.println("dept Name is :" + name);

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class studen implements Cloneable {
    int id;
    Date dob;
    String name;
    department dept;


    studen(int i, String n, department d) {
        id = i;
        name = n;
        dept = d;
    }
    studen(studen s){
        this.id = s.id;
    }

    void display() {
        System.out.println("Id is :" + id);
        System.out.println("Name is :" + name);
        dept.display();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        studen s = (studen) super.clone();
        s.dept = (department) s.dept.clone();
        s.dob = (Date)s.dob.clone();
        return s;
    }



}

public  class cloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        department dept = new department(1, "physics");
        studen s1 = new studen(1, "hari", dept);
        studen s2 = (studen) s1.clone();// shallow copy

        studen s3 = new studen(s1);


        dept.name = "maths";

        s1.display();

        s2.display();
    }

}












