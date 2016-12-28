package watek;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Reku extends Thread {
    int liczba;
    boolean rusz;
        public BigInteger reku(int a) throws InterruptedException
    {
        if (rusz == false) return BigInteger.ZERO;
        sleep(10);
        if (a == 0) return BigInteger.ONE;
        return reku(a-1).multiply(new BigInteger(new Integer(a).toString()));
    }  
    
                public Reku(int a)
        {
            liczba = a;
        }
        
                
        @Override
        public void run() { 
            rusz = true;
        try {
            System.out.println(reku(liczba));
        } catch (InterruptedException ex) {
            Logger.getLogger(Reku.class.getName()).log(Level.SEVERE, null, ex);
        }
            interrupt();
        }
        
        @Override
        public void interrupt() {
            rusz = false;
            Okno.jLabel1.setText("Czas rekurencyjnie: " + (System.currentTimeMillis()-Okno.before)+ "\n");
        }
}
