
package bomb;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {


    public static void main(String[] args) {
        bomb[] watki = new bomb[10];
        for (int i = 0; i < 10; i++)
        {
            watki[i] = new bomb();
            watki[i].start();
        }
        for (int i = 0; i < 10; i++)
        {
            try {
                watki[i].join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
