import java.io.*;
import java.util.*;
import java.text.*;

public class ComputeSum{
  public static void main(String [] args)
  {

      DecimalFormat df= new DecimalFormat("##.##");

      System.out.print("enter the value of i " );

      Scanner input = new Scanner(System.in);
      String str = input.next();
      int num = Integer.parseInt(str);

      if(num<1)
      {
        System.out.print("invalid entry.");
        System.exit(0);
      }
      double sum = computeSum(num);
      System.out.print("the sum is "+ df.format(sum));

    {
      System.out.print(" number had found. program exis");
      System.exit(0);
    }
  }
  static double computeSum(int num)
  {
    double s;

    if (num ==1)
    return 1;
    else
    s= 1.0 /num +computeSum(num-1);
    return s;
  }
}
