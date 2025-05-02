// import module in java to use input function
import java.util.*;

public class user_input {
    public static void main(String[] args) {
        System.out.println("Getting user input");
        System.out.println("------------------");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("output");
        System.out.println(name);

    }

    
}
