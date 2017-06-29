//IT14118432
//M.F.Shazna
//Batch-02

import java.util.Scanner;
class  Question07
{

	public static void main(String[] args )
      
       {
            System.out.println("Give your GPA : ");
            Scanner d = new Scanner(System.in);
            double val = d.nextDouble();


            
            int myval = (int)(val*10);
            
            
            switch(myval)
            {
                case  40 :
		case  39 :
		case  38 :
		case  37 :
		case  36 :
		case  35 :	
                   	 System.out.println("First Class Hons");
                    	 break;
                case  34 :
		case  33 :
		case  32 :
		case  31 :
		case  30 :
		
                        System.out.println("Upper Second class Hons" );
                        break;
		case  29:
		case  28 :
		case  27 :
		case  26 :
		case  25 :
			
                   	 System.out.println("Lower Second Class Hons");
                    	 break;
                case  24 :
		case  23 :
		case  22 :
		case  21 :
		case  20 :
		
                   	 System.out.println("Pass");
                    	 break;
		case  19 :
		case  18 :
		case  17 :
		case  16 :
		case  15 :
		case  14 :	
                   	 System.out.println("Fail");
                    	 break;
		
                    
                default: System.out.println("Invalid GPA");
                    
                    
            }
      
       }

}