package OOP;

public class wrapper {
    public static void main(String args[]){
        int i =10; // primitive data type
        float f ;

        Integer i2= Integer.valueOf(i); //Boxing , wrapping

        int j = i2.intValue(); //
         // unboxing

        Integer i3 = 20 ;// Integer,ValueOf(20) - autobpoxing

        int k = i2 ; // auto Unboxing

        String s = "123";
        // int i = s; // error
        int i4 = Integer.parseInt(s);

        System.out.println(i4);
    }
}
