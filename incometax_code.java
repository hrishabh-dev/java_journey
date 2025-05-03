import java.util.*;

public class incometax_code {

    public static void main(String[] args) {

        Scanner sc=new  Scanner(System.in);
        System.out.println("Income tax calculator");
        System.out.println("-------------------");
        System.out.print("Enter your Salary :-");
        int salary=sc.nextInt();

        sc.close();
        double tax=0;
        double amount=25000;
        double rebate=0;

        double taxincome=salary-75000;
        if (taxincome<0){
            taxincome=0;
        }
        double netincome=taxincome-300000;

        System.out.print("Net income:-");
        System.out.println(netincome);
        System.out.println("------------------");
        System.out.print("Standard deduction :-"); 
        System.out.println(75000);
        System.out.println("--------------------------");
        if (taxincome <= 300000) {
            System.out.println("You pay no tax");

        } else if (taxincome > 300000 && taxincome <= 700000) {
            tax = (taxincome - 300000) * 0.05;
            System.out.println("--------------------------");
            System.out.println("Tax at 5% :-"+tax);
            System.out.println("--------------------------");
            rebate=amount-tax;
            System.out.println("------------------------------------------");
            System.out.println("Income lower than or equal 7 lacs rebate :- 25000");
            System.out.println("-----------------------------------------");
            System.out.println("No tax payable");
            System.out.println("--------------------------");

        } else if (taxincome > 700000 && taxincome <= 1000000) {
            tax = 20000+ ((taxincome - 700000) * 0.10);
            double x=((taxincome-700000)*0.10);
            int a=20000;
            System.out.println("--------------------------");
            System.out.println("Tax on 5% :-"+a);
            System.out.println("Tax on 10% :-"+x);
            System.out.println("Total Tax calculated at 10% :-"+tax);
            rebate=amount-tax;
            System.out.println("------------------------------------------");
            System.out.println("Income lower than or equal 7 lacs rebate :- 25000");
            System.out.println("-----------------------------------------");
            System.out.println("No tax payable");
            System.out.println("--------------------------");
        }else if (taxincome>1000000 && taxincome <=1200000 ){
            tax=(20000+30000)+((taxincome-1000000)*0.15);
            System.out.println("Tax at 5% :- 20000");
            System.out.println("Tax at 10% :- 30000");
            System.out.println("Tax at 15 % :- "+tax);
            System.out.println("--------------------------------------");
            System.out.println("Total Tax calculated  :-"+tax);
            System.out.println("-------------------------------------");
            double totalTaxWithSurcharge = tax *0.04;
            System.out.println("Total  Health and education cess:-"+totalTaxWithSurcharge);
            double su=tax+totalTaxWithSurcharge;
            System.out.println("--------------------------------------");
            System.out.println("Total tax with Health and education cess to be payable:-"+su);
        }else if (taxincome>1200000 && taxincome<=1500000){
            tax=(20000+30000+30000)+((taxincome-1200000)*0.20);
            System.out.println("--------------------------------------");
            System.out.println("Total Tax calculated at 20% :-"+tax);
            System.out.println("--------------------------------------");
            double totalTaxWithSurcharge = tax *0.04;
            System.out.println("Total  Health and education cess:-"+totalTaxWithSurcharge);
            double su=tax+totalTaxWithSurcharge;
            System.out.println("Total tax with Health and education cess to be payable :-"+su);
        }
        

    }
}
