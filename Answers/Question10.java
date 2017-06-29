//IT14118432
//M.F.Shazna
//Batch-02

import java.util.Scanner;

class Counting
{
        int lettercount(String sent)
        {
            int count=0;
            
            for( int n=0; n<sent.length(); n++)
            {
               if( Character.isLetter(sent.charAt(n)))
                       {
                           count++;
                       }
            }
            
            return count;
        }
        
        int digitcount(String word)
        {
            int cou = 0;
            for(int f=0; f<word.length() ; f++)
            {
                if(Character.isDigit(word.charAt(f)))
                {
                    cou++;
                }
            }
            return cou;
        }
        
        int spacecount(String given)
        {
            int num=0;
            for(int l=0; l<given.length(); l++)
            {
                if(Character.isWhitespace(given.charAt(l)))
                {
                    num++;
                }
            }
            return num;
        }
}


class Question10
{
	public static void main(String[] args)
	{
	     System.out.println("Give a String input: ");
             Scanner scr = new Scanner(System.in);
             String sha = scr.nextLine();

	     Counting ob = new Counting();
             int letcount=ob.lettercount(sha);
             int digcount=ob.digitcount(sha);
             int spacount=ob.spacecount(sha);

             System.out.println("Count of letters: "+ letcount);
             System.out.println("Count of digits: " + digcount);
             System.out.println("Count of whitespaces: " + spacount);
          
	}
}