import java.util.*;
public class loop_questions {
    public static void main(String[] args) {
        //print sum of first n natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :-");
        int s=sc.nextInt();
        int sum=0;
        for (int i=1;i<=s;i++){
            sum=sum+i;
            
        }
        System.out.println(sum);




        //print table of a number input by the user 
        int x=sc.nextInt();
        for (int i=1;i<11;i++){
            System.out.println(x*i);
        }

    }
    
}
