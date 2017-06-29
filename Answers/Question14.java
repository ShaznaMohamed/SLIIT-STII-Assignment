//IT14118432
//M.F.Shazna
//Batch-02

import java.io.*;

class Question14
{

	
        public static void main(String[] args)throws IOException 
        {
           String[][] arr = {{"STUDENT NO","ST2", "SPD" , "PS" , "DCCN2" , "SE1"},
                             {"DIT/10/C1/0001" , "A" , "A-", "B+", "A", "A-"},
                             {"DIT/10/M2/0123" , "C-" , "C","B","B","B+"},
                             {"DIT/10/M1/0054" , "D" , "C-", "C" , "B-", "B"},
                             {"DIT/10/M1/0025" , "A", "A","A-", "A", "A-"},
                             {"DIT/10/M1/1254" , "C" , "C-","B", "B+","B" }
                            };
        
            File statText = new File("C:/Users/Shaznaa/Desktop/IT14118432/student_data1.txt");
            FileOutputStream is = new FileOutputStream(statText);
            OutputStreamWriter osw = new OutputStreamWriter(is);
            BufferedWriter w = new BufferedWriter(osw);
        

		for( String a[] : arr)
		{
			for(String i : a)
			{
				w.write(i + "\t");
			} 
			w.newLine();	
		}
            w.close();
            
       }                   	

}