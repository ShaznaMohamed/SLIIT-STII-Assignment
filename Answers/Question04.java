//IT14118432
//M.F.Shazna
//Batch-02

class Question04
{
	public static void main(String[] args)
	{
        int i=1;
        int r= 1;
        
        do{
              do
                {
                    
                    if(i<6)
                    {
                    System.out.print(" "+ " ");
                    }
                    else
                    {
                        System.out.print("&" +" " );
                    }
                    
                        i++;

                      if (r==4 && i==10)
                    {
                        break ;
                    }
                     
                }
             while(i<=10);
         
        System.out.print("\n" );
        r++;
        i=r;
       
                     
        }
        while (r!=7);
        
	}
}