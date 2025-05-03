import java.util.*;
public class loop_questions {
    public static void main(String[] args) {
        //print sum of first n natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :-");
        int n=sc.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){
            sum=sum+i;

        }
        System.out.println(sum);

    }
    
}
