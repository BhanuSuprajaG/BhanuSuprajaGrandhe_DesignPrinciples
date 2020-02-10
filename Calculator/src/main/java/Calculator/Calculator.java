package Calculator;
import java.util.*;
public class Calculator
   {
      public static void main(String args[])
      {
    	  String ope;
          int flag=1;
          double d1,d2;
          Scanner s=new Scanner(System.in);
          boolean a1=true;
          Calci[] o={new div(),new add(),new sub(),new mul()};
     	  String[] c= {"/","+","-","*"};
          while(a1)
            {
               System.out.println("Enter Operator");
               ope=s.next();
               for(int i=0;i<c.length;i++)
               {
              	 if(ope.equals(c[i]))
              	 {
              		 System.out.println("Enter no's");
                       d1=s.nextInt();
                       d2=s.nextInt();
              		 o[i].perform_calculate(d1,d2);
              		 flag=0;
              		 break;
              	 }
               }
               if(flag==1)
              	 System.out.println("Invalid operator");
               System.out.println("Do you wanna continue(Y/N)");
               char c1=s.next().charAt(0);
               if(c1=='n')
              	 a1=false;
             }
           s.close();
       }
  }
  