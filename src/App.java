
public class App {

    public static void main(String[] args){
        
         Logger asterisklogger = new AsteriskLogger();
         
         Logger spacedLogger = new SpacedLogger();
         
         asterisklogger.Log("Promineo");
         
         spacedLogger.Error("Tech");
         
         asterisklogger.Error("Tech");
           
         spacedLogger.Log("Promineo");
   
    }

}