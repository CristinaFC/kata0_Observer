
package kata0_observer;

import javax.swing.JTextArea;

public class digitalClockDisplay extends ClockDisplay {

    public digitalClockDisplay(String title) {
        super(title);
    }

    @Override
    void refreshClockDisplay(JTextArea clockDisplay, String hour, String minute, String second) {
        clockDisplay.setText("DISPLAY CLOCK: " + hour + ":" + minute + ":" + second);
    }
    
}
