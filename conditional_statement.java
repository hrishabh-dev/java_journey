import java.util.*;//used to get Scanner package so that we can Scanner  to get user input
public class conditional_statement {
    public static void main(String[] args) {
        // basic if else condition code to check even or odd number
        System.out.println("Check even or odd number baased on user input");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();// getting user input as integer
        if (x%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    
}
