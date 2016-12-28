
package watek;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Iter extends Thread {
    int liczba;
    boolean rusz;
        public BigInteger iter(int a) throws InterruptedException 
    {
        BigInteger b = BigInteger.ONE;
        
        for (int i = 1; i <= a; i++)
        {
            if (rusz == false) return BigInteger.ZERO;
            sleep(10);
            b = b.multiply(new BigInteger(new Integer(i).toString()));
        }
        return b;
    }
    
        public Iter(int a)
        {
            liczba = a;
        }
        
        @Override
        public void run() {
            rusz = true;
        try {
            System.out.println(iter(liczba));
        } catch (InterruptedException ex) {
            Logger.getLogger(Iter.class.getName()).log(Level.SEVERE, null, ex);
        }
            interrupt();
        }
        
        @Override
        public void interrupt() {
            rusz = false;
            Okno.jLabel2.setText("Czas iteracyjnie: " + (System.currentTimeMillis()-Okno.before)+ "\n");
        }
}
