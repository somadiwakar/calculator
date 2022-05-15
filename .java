import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        int a = SC.nextInt();
        int b = SC.nextInt();
        System.out.println(" Enter 1 to + \n Enter 2 to - \n Enter 3 to * \n Enter 4 to % \n Enter 5 to divide");
        int operation = SC.nextInt();
        
        switch(operation) {
        case 1 : System.out.println(a+b);
        break;
        case 2 : System.out.println(a-b);
        break;
        case 3 : System.out.println(a*b);
        break;
        case 4 : System.out.println(a%b);
        break;
        case 5 : System.out.println(a/b);
        break;
        default : System.out.println("Invaild");
        }
    
    }
}
