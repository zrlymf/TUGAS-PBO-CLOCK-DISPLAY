import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClockGUI {
    private JFrame frame;
    private JLabel timeLabel;
    private ClockDisplay clock;

    public ClockGUI() {
        clock = new ClockDisplay();
        frame = new JFrame("Clock Display");
        timeLabel = new JLabel(clock.getTime(), SwingConstants.CENTER);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.add(timeLabel, BorderLayout.CENTER);
        frame.setVisible(true);
        
        updateClock();
    }

    public void updateClock() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clock.setCurrentTime();
                timeLabel.setText(clock.getTime());
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ClockGUI());
    }
}

