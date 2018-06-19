
package ClassTXT;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class salvartxt {
    
    
     private String user;

         public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    
    public String Salvar(){
        
         try {
             FileWriter fw = new FileWriter("dadosVetor.txt");
             PrintWriter pw = new PrintWriter(fw);
             pw.printf(this.user);
             pw.flush();
             pw.close();
             fw.close();
             
             
         } catch (IOException ex) {
         }
        
        return null;
    }


       
    
}
