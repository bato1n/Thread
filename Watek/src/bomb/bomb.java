package bomb;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class bomb extends Thread {

    private static AtomicInteger licznik = new AtomicInteger(0);
    @Override
    public void run(){

        Random r = new Random();
        
        try {
            try (RandomAccessFile f1 = new RandomAccessFile("D:\\abc\\test" + licznik.incrementAndGet() + ".bin","rw")) {
                for (int i=0; i<1000000; i++) {
                    f1.writeByte(r.nextInt(256));
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getCause());
        }
    }
    
    
    
}
