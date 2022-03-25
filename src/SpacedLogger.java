
public class SpacedLogger implements Logger {

    @Override
    public void Log(String log) {
        
      
        
        { for (int i = 0; i < log.length(); i++) {
            
          /*  if (i <= (log.length()-2) )
                System.out.print(log.charAt(i) + " ");
            
            else if (i == (log.length() - 1)) 
           */     System.out.print(log.charAt(i)+" ");
                
           }
        }
         //System.out.println("");
       
        
    }

    @Override
    public void Error(String error) {
        
        System.err.print("ERROR:");
       
        for (int i = 0; i < error.length(); i++) {
            if (i <= (error.length()-2) )
                System.out.print(error.charAt(i) + " ");
            
            else if (i == (error.length() - 1))
                System.out.print(error.charAt(i));
       }
       
    
     System.out.println("");

    }   

}
