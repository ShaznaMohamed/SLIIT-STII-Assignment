//IT14118432
//M.F.Shazna
//Batch-02

class Question06
{
	public static void main(String[] args)
	{
		 for(int a=0 ; a<18 ; a++)
         	{
           	      System.out.print(9);
          	}
                    System.out.println();
         
           	int n= 1;
           	for(int q=8; q>0 ; q--)
           	{
               	      for(int w=0; w<18; w++ )
                      {
                
                          if( w >=q && w<=(q+n) )
                          {   
                              System.out.print(" ");
                          }
                 
                          else
                             System.out.print(q);
                     }
                 System.out.print("\n");
                 n=n+2;
              }
                
                
     }

}
