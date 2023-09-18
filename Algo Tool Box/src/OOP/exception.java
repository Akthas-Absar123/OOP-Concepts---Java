package OOP;

import javax.naming.InsufficientResourcesException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import  java.util.Scanner;

// exception handling
public class exception {
    public static void main(String[] args) {

        int a = 10, b = 0;
        int c = 0;
        try {

            int arr[] = null;
            //System.out.println(arr[1]);
            c = a / b; // throw
            System.out.println("try block");

            //throw NullPointerException("demo"); // custom exception

        }
        catch (ArithmeticException | NullPointerException e) {
            System.err.println("Arithmetic Error occured");
            System.out.println("Error occured");
        }
        /*catch(NullPointerException e){
            System.err.println("null pointer  Error occured");
        }*/ catch (Exception e) {
            System.err.println("  Error occured");
        } finally {
            System.err.println("no matter what exception occured .. run it self");
        }
        // checked exception
        File file = new File("abc.txt");
        try (FileInputStream fs = new FileInputStream(file)) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(c);
        System.out.println("end of programme");
        /*int i;
        try (Scanner scanner = new Scanner(System.in)) {
            i = scanner.nextInt();
        }


        System.out.println(i);*/

        double bal = 500 , withdraw =  700;

        try {
            if (bal < withdraw)
                throw new InsufficientFundException(withdraw - bal);
            ;
        }
        catch (InsufficientFundException e){
            System.out.println("not enough money");
        }

    }
}
