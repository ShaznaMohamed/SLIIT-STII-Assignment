//IT14118432
//M.F.Shazna
//Batch-02

class Question05
{
	public static void main(String[] args)
	{
		 float gpa = Float.parseFloat(args[0]);
           
           if ( gpa>= 3.6)
           {
               System.out.println("First class Hons");
           }
           else if ( (3.6 > gpa) && (gpa >= 3.4))
           {
               System.out.println("Upper Second Class  Hons");
           }
           else if ((3.4 > gpa) && (gpa >= 3.00)  )
           {
               System.out.println("Lower Second class Hons");
           }
           else if ( (3.00 > gpa) && (gpa >= 2.00))
           {
               System.out.println("Pass");
           }
           
	}
}