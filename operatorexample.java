

public class operatorexample {
    public static void main(String[] args) {
        // expression is axb/a-b 
        // in java we don't use bodmass rule 
        // java uses priority rule - * / %
        int a=10;
        int b=5;
        int result=(a*b)/(a-b);
        int result1=a*b/a-b;
        System.out.println(result1);
        System.out.println("-----------------");
        System.out.println(result);
    }
    
}
