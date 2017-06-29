//IT14118432
//M.F.Shazna
//Batch-02

class Question02
{
	public static void main(String[] args)
	{
		 int decino= 157;
       		 String out = "";
       		 int no;
       		 int rem;
       	 do{
           
            	 no = decino /8;
             	 rem = decino%8;
             	decino = no; 
           	 out =   rem +out  ;
       	   }
        while (no != 0);
        
		System.out.println("Given number : 157" );
        	System.out.println("Octal number : " +out);
	}
}