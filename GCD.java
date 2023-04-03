import java.util.Scanner;

interface GCD{
    int computeGCD(int num1,int num2);
}
class APPROACH1 implements GCD{
    // Euclid Method (num1>num2)
    public int computeGCD(int num1, int num2){
        if (num2 == 0){
            return num1;
        }
        return computeGCD(num2, num1 % num2);
    }
}
class APPROACH2 implements GCD{
    // Listing all factors (Assuming num1>num2)
        public int computeGCD(int num1, int num2){
            int i;int gcd = 1;
        for(i=num2;i>1;i--){
            if(num1%i == 0 && num2%i==0){
                gcd = i;
                break;
    }
}
return(gcd);
}
}
class Problem{
    private static GCD newAPPROACH2() {
        return null;
    }

    private static GCD newAPPROACH1() {
        return null;
    }


    public static void main(String[] args){
        
        try (Scanner in = new Scanner(System.in)) {
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            System.out.println("GCD by Euclid's method: " +newAPPROACH1().computeGCD(num1,num2));
            System.out.println("GCD by listing all factors: " + newAPPROACH2().computeGCD(num1,num2));
        }
    }
}

