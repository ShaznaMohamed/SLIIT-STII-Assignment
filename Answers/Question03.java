//IT14118432
//M.F.Shazna
//Batch-02

import java.io.*;
class Question03
{
	public static void main(String[] args)throws IOException 
	{
		
        InputStreamReader i = new InputStreamReader(System.in); 
        BufferedReader b = new BufferedReader(i);
        
        System.out.println("Give the distance in miles :");
        Double distanInMile = Double.parseDouble(b.readLine());
      
        System.out.println("Give the distance Yards :");
        Double distanInYard = Double.parseDouble(b.readLine());
         
        
        double kilfrommil = 1.6 * distanInMile ;
        double kilfromyard = (1.0/1760.0) * distanInYard * 1.6 ;
        
        
         System.out.println("The distance is "  +( kilfrommil + kilfromyard) + " kilometers"); 
         
        
        
        
	}
}