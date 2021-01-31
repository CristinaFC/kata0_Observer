
package kata0_observer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Kata0_Observer {

    public static void main(String[] args) {
        Clock clockMadrid = new Clock(0,0,0);
        Clock clockBerlin = new Clock(1,0,0);
        
        ClockDisplay analogClockDisplayMadrid = new analogClockDisplay("ANALOG CLOCK MADRID");
        ClockDisplay digitalClockDisplayMadrid = new digitalClockDisplay("DIGITAL CLOCK MADRID");
        
        ClockDisplay analogClockDisplayBerlin = new analogClockDisplay("ANALOG CLOCK BERLIN");
        ClockDisplay digitalClockDisplayBerlin = new digitalClockDisplay("DIGITAL CLOCK BERLIN");
        
        clockMadrid.addObserver(analogClockDisplayMadrid);
        clockMadrid.addObserver(digitalClockDisplayMadrid);
        
        clockBerlin.addObserver(analogClockDisplayBerlin);
        clockBerlin.addObserver(digitalClockDisplayBerlin);
        
        while (true){
            try {
                clockMadrid.updateStatusSubject();
                clockBerlin.updateStatusSubject();
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Kata0_Observer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
