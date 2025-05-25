
import java.util.*;
public class SimpleCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        double a = sc.nextDouble();
        double b =  sc.nextDouble();
         sc.nextLine();
         System.out.println("Enter operation");
        String op = sc.nextLine();
        switch(op) {
            case "+" :
            System.out.println(a+b);
            break;
            case "-" :
            System.out.println(a-b);
            break;
            case "*" :
            System.out.println(a*b);
            break;
            case "/" :
            if(b!=0){
                System.out.println(a/b);
            }
            else{
                System.out.println("cannot divide by zero");
            }
            break;
           default :
                System.out.println("Invalid operator");
                break;
        }
    }
    
}
