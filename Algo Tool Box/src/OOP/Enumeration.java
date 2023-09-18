package OOP;

import java.util.logging.Level;

enum level{ //Enum java.lang.enum
    BEGINNER("B") , INTERMEDIATE("I"), ADVANCED("A");
    private String abbr;
    level(String ab){
        abbr = ab;
    }
    public String getabbr() {
        return abbr;
    }

}

public class Enumeration {
    public static void main(String[] args){
        level l1 = level.ADVANCED;
        System.out.println(l1);
        System.out.println(l1.getabbr());
        System.out.println(l1.toString());
        System.out.println(l1.ordinal());
        //System.out.println(l1.valueOf());
        //System.out.println(l1.compareTo());

    }
}
