//IT14118432
//M.F.Shazna
//Batch-02

class Question01 
{

 public static void main(String[] args)
    {
        
        double heightInFeet = Double.parseDouble(args[0]);
        double heightInInches = Double.parseDouble(args[1]);
        
        double meterFrmFeet = heightInFeet * 0.3;
        double meterFrmInch = heightInInches * 0.025;
        
        System.out.println("Height in meters is " + (meterFrmFeet+meterFrmInch));
        
        
        
        
        
    }
    
}