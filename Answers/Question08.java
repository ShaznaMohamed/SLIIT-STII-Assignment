//IT14118432
//M.F.Shazna
//Batch-02

 class Display
{
			
	         
         void print(int matrix1[][],  int matrix2[][], int Result[][] )
	{

		   
	      System.out.println("Matrix1 + Matrix2 = Result");
              System.out.print("|");
              for(int g=0 ; g<3 ; g++)
              {
                   System.out.print( matrix1[0][g] );
              }
              System.out.print("|     |");
              for(int g=0 ; g<3 ; g++)
              {
                   System.out.print( matrix2[0][g] );
              }
               System.out.print("|     |");
               for(int g=0 ; g<3 ; g++)
              {
                   System.out.print( matrix2[0][g] + matrix1[0][g]+" " );
              } 
                System.out.print("|");
                System.out.println();
                
                  System.out.print("|");
              for(int g=0 ; g<3 ; g++)
              {
                   System.out.print( matrix1[1][g] );
              }
              System.out.print("|     |");
              for(int g=0 ; g<3 ; g++)
              {
                   System.out.print( matrix2[1][g] );
              }
               System.out.print("|     |");
               for(int g=0 ; g<3 ; g++)
              {
                   System.out.print( matrix2[1][g] + matrix1[1][g] );
              } 
                System.out.print("|");
            
                	

	}

}
           
class Question08
{

	public static void main(String[] args)
	{


	          int[][] matrix1  =  {{0,1,2}, {9,8,7} };    
                  int[][] matrix2 = {{6,5,4}, {3,4,5} };
                  int[][] Result = new int[2][3];
	
               
	  
                               
           for(int z=0; z<2; z++)
           {
               for(int p=0; p<3; p++)
               {
                    Result[z][p] = matrix1[z][p] +  matrix2[z][p];
               }
           }
           
           System.out.println("Result is ");

            for(int w=0; w<2; w++)
           {
               for(int t=0; t<3; t++)
               {
                
                 System.out.print( Result[w][t] );
		 if( w==0)
                 System.out.print(" ");
                  
               }
                 
               System.out.print("\n");
           }

	  
	  System.out.println();
	Display n = new Display(); 
        n.print(matrix1, matrix2, Result);

}
}

