package kata0_observer;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public abstract class ClockDisplay extends JFrame implements Observer{
    private JTextArea clockDisplay;
    private TimeStam timeStam;

    public ClockDisplay(String title) {
        super(title);
        this.setContentPane(createClockPanel());
        this.addWindowListener(new WindowCloseManager());
        this.pack();
        this.setVisible(true);
    }
    
    
    @Override
    public void update(Subject subject) {
        this.timeStam = (TimeStam) subject.getStatusSubject();
        refreshClockDisplay(this.clockDisplay, this.timeStam.getHour().toString(),
                this.timeStam.getMinute().toString(),this.timeStam.getSecond().toString());
    }
    

    private JPanel createClockPanel() {
        JPanel clockPanel = new JPanel();
        clockPanel.setLayout(new BorderLayout());
        clockDisplay = new JTextArea(10, 40);
        clockDisplay.setEditable(false);
        JScrollPane scrollDisplay = new JScrollPane(clockDisplay);
        clockPanel.add(scrollDisplay, BorderLayout.CENTER);
        return clockPanel;
    }

    abstract void refreshClockDisplay(JTextArea clockDisplay, String hour, String minute, String second);

    private static class WindowCloseManager extends WindowAdapter {

        public void windowClosing (WindowEvent windowEvent) {
            System.exit(0);
        }
    }
    
}
