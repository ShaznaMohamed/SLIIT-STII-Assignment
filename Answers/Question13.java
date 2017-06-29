//IT14118432
//M.F.Shazna
//Batch-02

import java.io.*;

class Question13
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
        
            File statText = new File("C:/Users/Shaznaa/Desktop/IT14118432/student_data.txt");
            FileOutputStream is = new FileOutputStream(statText);
            OutputStreamWriter osw = new OutputStreamWriter(is);
            BufferedWriter w = new BufferedWriter(osw);
            
            for(int r=0; r<6; r++)
            {
                for(int c=0; c<6; c++)
                {
                    w.write(arr[r][c]+ "\t");
                }
                w.newLine();
                
            }
            
            w.close();
            
       }                   	

}