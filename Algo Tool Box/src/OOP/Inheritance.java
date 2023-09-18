
package OOP;
import java.util.*;

// Object - cosmic super class
class  Employee implements Comparable<Employee>{   //"extends object" { // base class , super class
                  // and also we assign a class with the "final" we can't inheritance in any below classes..
    protected String name;
    protected double salary; // when we use private it gives error when we calling in below classes in extends format...

    Employee(String n , double s) {
        name = n;
        salary = s;
    }
    /*Employee(){
        name = " ";
        salary = 0.0 ;*/ //we no need when we use super() in the inheritance class...


    String getName() {
        return name;
    }

    void setName(String n) {
        name = n;
    }

    double getSalary() {
        return salary;
    }

    void setSalary(double s) {
        salary = s;
    }

    void raisesalary(double percent) {
        salary += salary * percent / 100;
    }
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(obj==null)
            return false;
        if(this.getClass()!=obj.getClass())
            return false;

        Employee e = (Employee)obj;
        return this.name.equals(e.name) && this.salary==e.salary;


    }

    @Override
    public int compareTo(Employee e) {//obj1.compareTo(obj2)  ---obj1 - obj2
            if(salary==e.salary)
                return 0;
            if (salary<e.salary)
                return -1;
            return 1;
    }
}
class Manager extends Employee{ // derived class
    double bonus;
    Manager(String n ,double s , double b){
        super(n,s);

        name = n ;
        salary =s ;
        bonus= b ;

    }
    void setBonus(double b){
        bonus = b;
    }
    public double getSalary() { // overridding
        return super.getSalary() + bonus;
    }


}
public class Inheritance {

    public static void main(String[] args) {


        Employee e1 = new Employee("Ram" , 35000);

        //e1.raisesalary(10);
        System.out.println(e1.getSalary());
        Manager m1 = new Manager("John" , 65000.0 , 0.0);
        m1.setBonus(25000);
        System.out.println(m1.getSalary());

        Employee e2 = new Manager("Ramya",68000.0 , 0.0);
        Employee e3 = new Employee("Ram" , 35000);
        System.out.println(e3.getSalary());
        System.out.println(e1.equals(e3)); // gives false. bcz, it is checking only the reference only. not override and check...But in String methods it will be overide(String provide the equals method)

        int[] arr = new int[50];
        Employee[] employees = new Employee[6]; // want to give how many employees in the array. o/w it gives null error...
        employees[0] = new Employee("Ram" , 350000.0);
        employees[1] = new Employee("Vith" , 330000.0);
        employees[2] = new Employee("Absar" , 450000.0);
        employees[3] = new Employee("Akthas" , 480000.0);
        employees[4]=m1; // this calles Manager class and it evaluate salary + bonus in Manager class...
        employees[5] = new Manager("John" , 45000 ,00.0);

        employees[5].setSalary(75000);
        Manager m2 = (Manager) employees[5];
        m2.setBonus(20000);

        //Manager m2 = (Manager) employees[3]; // error because employees[3] assign for Employee class. not Manager class..

        for (Employee e:employees){
            System.out.println(e.getName() + " " + e.getSalary());
        }
        Arrays.sort(employees);
        for (Employee e:employees){
            System.out.println(e.getName() + " " + e.getSalary());}
    }
}



