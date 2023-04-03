import java.util.*;
public class Display{
    static String regno;
    static String name;
    static String cgpa;
    static String progname;
    static String schoolname;
    static String proctorname;
    public static void main(String[]args){
        try (Scanner nest = new Scanner(System.in)) {
            System.out.println("enter registration number");
            regno=nest.nextLine();
            System.out.println("enter your name");
            name=nest.nextLine();
            System.out.println("enter cgpa");
            cgpa=nest.nextLine();
            System.out.println("enter programme name");
            progname=nest.nextLine();
            System.out.println("enter school name");
            schoolname=nest.nextLine();
            System.out.println("enter proctorname");
            nest.nextLong();
        }




    }
    
}