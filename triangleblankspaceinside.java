public class triangleblankspaceinside {
    public static void main(String[] args) {
        System.out.println("print rectangle with blank space inside");
        for(int i=1;i<=5;i++){
        for (int j=1;j<=7;j++){
            if (i==1 || j==1 || j==7  || i==5){
                System.out.print("*");
            
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
       }
    }
    
}
