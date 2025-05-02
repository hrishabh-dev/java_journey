import java.util.*;

public class practice_question_conditional_statement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number1 :-");
        int a=sc.nextInt();
        System.out.print("Enter number2 :-");
        int b=sc.nextInt();
        if (a==b){
            System.out.println("Equal");

        }
        else{
            if(a>b){
                System.out.print(a);
                System.out.println(" is greater");
            }
            else{
                System.out.print(a);
                System.out.println(" is smaller");
            }
        }
    }
    
}
