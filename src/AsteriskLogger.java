
public class AsteriskLogger  implements Logger {

   
    @Override
    public void Log(String log) {
        
        System.out.println("*** " + log + " ***"); 
        
    }

    @Override
    public void Error(String error) {
        
        System.out.println(asterisk(error));
        System.out.println("*** Error: "+ error  +  " ***");
        System.out.println(asterisk(error));
        
    }
    
    
    public String asterisk(String error){
        
        int asterisk = 14 + error.length();
        String asterisks = "";
        for (int i = 0; i <= asterisk; i++ )
            asterisks += "*";
        return asterisks;
    }
}
