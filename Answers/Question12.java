//IT14118432
//M.F.Shazna
//Batch-02

import java.util.Scanner;
import java.util.StringTokenizer;

class Question12
{

		public static void main(String[] args)
		{ 
			
			  System.out.println("Give a sentence with more than 10 words ");
			  Scanner b = new Scanner(System.in);
			  String word = b.nextLine();
		
                          StringTokenizer tok = new StringTokenizer(word, " ");
             
          		  int cn = 1;
			  String hi = tok.nextToken();

          		  while(tok.hasMoreTokens())	
                          {
                		if (hi.charAt(0) == 'i')
                		{
                    			cn++;
                		}
               		     hi=tok.nextToken();
           		 }
                         System.out.println("Number of words starting with letter " +"i is "+ cn);
            
           
		}
} 