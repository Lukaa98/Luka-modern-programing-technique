import java.util.Scanner;

public class FederalIncomeTaxClient {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("enter the status ");

int Status = input.nextInt();

System.out.println("enter the icnome ");

double Income= input.nextDouble();

//creater the object

FederalIncomeTax federalIncomeTax1 = new FederalIncomeTax (Status, Income, 0);

System.out.println( "total taxes are "+ federalIncomeTax1.getTotalTax() );

}

}
