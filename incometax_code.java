import java.util.*;

public class incometax_code {

    public static void main(String[] args) {

        Scanner sc=new  Scanner(System.in);
        System.out.print("Enter your Salary :-");
        int salary=sc.nextInt();

        sc.close();
        double tax=0;

        double taxincome=salary-75000;
        if (taxincome<0){
            taxincome=0;
        }
        double netincome=taxincome-300000;

        System.out.print("Net income:-");
        System.out.println(netincome);
        System.out.print("Standard deduction :-"); 
        System.out.println(75000);
        if (taxincome <= 300000) {
            System.out.println("You pay no tax");

        } else if (taxincome > 300000 && taxincome <= 700000) {
            tax = (taxincome - 300000) * 0.05;
            System.out.println("---------------");
            System.out.println("Tax at 5% :-"+tax);
            System.out.println("---------------");

        } else if (taxincome > 700000 && taxincome <= 1000000) {
            tax = 20000+ ((taxincome - 700000) * 0.10);
            double x=((taxincome-700000)*0.10);
            int a=20000;
            System.out.println("---------------------");
            System.out.print("Tax on 5% :-");
            System.out.println(a);
            System.out.println("Tax on 10% :-"+x);
            System.out.println("Total Tax calculated at 10% :-"+tax);
            System.out.println("---------------------");
        }else if (taxincome>1000000 && taxincome <=1200000 ){
            tax=(20000+30000)+((taxincome-1000000)*0.15);
            System.out.println("----------------------");
            System.out.println("Total Tax calculated at 15% :-"+tax);
            System.out.println("--------------------");
        }else if (taxincome>1200000 && taxincome<=1500000){
            tax=(20000+30000+30000)+((taxincome-1200000)*0.20);
            System.out.println("----------------------");
            System.out.println("Total Tax calculated at 20% :-"+tax);
            System.out.println("---------------------");
        }
        double totalTaxWithSurcharge = tax *0.04;
        System.out.println("Total tax surchage:-"+totalTaxWithSurcharge);
        double su=tax+totalTaxWithSurcharge;
        System.out.println("Total tax with surcharge :-"+su);
    }
}
