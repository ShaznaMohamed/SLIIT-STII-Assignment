//IT14118432
//M.F.Shazna
//Batch-02

import java.util.Scanner;

class Question09
{
	public static void main(String[] args)
	{
		   Scanner e = new Scanner(System.in);
            
                   System.out.println("Give the email address");
                   String email = e.nextLine();

                   int  index = email.indexOf("@");
                   String sub = email.substring(0,index);
                   
                   System.out.println("Email    : " + email);
                   System.out.println("UserID   : " + sub);
           
	}
}