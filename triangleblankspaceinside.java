public class triangleblankspaceinside {
    public static void main(String[] args) {
        System.out.println("print rectangle with blank space inside");
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if (i==1 && j==3){
                    System.out.print("*");
                }else if(i==2&&(j==2||j==4)){
                    System.out.print("*");
                }else if (i==3 && (j==1 || j==5)){
                    System.out.print("*");
                }else if (i==3 &&j==3 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
                
            }
            System.out.println();
        }
    }
    
}
