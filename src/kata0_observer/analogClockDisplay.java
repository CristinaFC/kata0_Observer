
package kata0_observer;

import javax.swing.JTextArea;

public class analogClockDisplay extends ClockDisplay {

    public analogClockDisplay(String title) {
        super(title);
    }

    @Override
    void refreshClockDisplay(JTextArea clockDisplay, String hour, String minute, String second) {
        clockDisplay.setText("ANALOG CLOCK: " + hour + ":" + minute + ":" + second);
    }
    
}
