import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;

public class NotePadCreate {

	public static void main(String[] args) {
		
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        
        Random r = new Random();
        
    
        
    	int todayInt = calendar.get(Calendar.DATE);
        
    	
    	for(int i = 0; i<30;i++) {
    		
    	    
   
    System.out.println(todayInt+r.nextInt(900));
		
        PrintWriter writer;
        try {
     writer = new PrintWriter("/Users/macbookpro/Desktop/WebSites/NotePad/"+todayInt+i+r.nextInt(900)+".txt", "UTF-8");
           writer.println("Line 111111");
           writer.println("line 22222");
           writer.println("line 33333");
           writer.println("line 44444");
           Thread.sleep(3000);
           writer.close();
           System.out.println("finished");
         } catch (Exception e) {
           e.printStackTrace();
         }
        }
    	
	}
}
		 
		
		
		
		

