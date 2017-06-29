//IT14118432
//M.F.Shazna
//Batch-02

import java.util.Scanner;
class Question11
{
	public static void main(String[] args)
	{
		    
            
            String opp;
            do
            {
                
            System.out.println("Enter");
            System.out.println("* : For multiplication");
            System.out.println("/ : For division");
            System.out.println("+ : For addition");
            System.out.println("- : For Subtraction");
            System.out.println("Any other character : To exit");
            System.out.println("Mathematical Operation : ");
            
            
            Scanner inval = new Scanner(System.in);
            opp = inval.nextLine();
            
            if( !opp.equals("*") && !opp.equals("/") && !opp.equals("+") && !opp.equals("-"))
            {
                break;
            }
            else
            {    
            System.out.println("Give the two numbers: ");
            double num1 = inval.nextDouble();
            double num2 = inval.nextDouble();
            
            
            double cal;
            
            if ( opp.equals("*") )
            {
                cal=num1 * num2;
                System.out.println("The Result of the operation: "+ num1 + opp + num2 +" = " + cal);
                
            }
              if ( opp.equals("/"))
            {   
                cal=num1 / num2;
                System.out.println("The Result of the operation: "+ num1 + opp + num2 +" = " + cal);
                
            }
            if ( opp.equals("+") )
            {   
                cal=num1 + num2;
                System.out.println("The Result of the operation: "+ num1 + opp + num2 +" = " + cal);
                 
            }
               if ( opp.equals("-"))
            {   
                cal=num1 - num2;
                System.out.println("The Result of the operation: "+ num1 + opp + num2 +" = " + cal);
                 
            }

             continue;     
            }

            }
             while ( opp.equals("*") || opp.equals("/") || opp.equals("+") || opp.equals("-"));
            
            
          
            
	}
}