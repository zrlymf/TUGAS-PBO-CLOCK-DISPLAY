import java.util.Calendar;

public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;

    public ClockDisplay() {
        hours = new NumberDisplay(24); // Jam 0-23
        minutes = new NumberDisplay(60); // Menit 0-59
        seconds = new NumberDisplay(60); // Detik 0-59
        setCurrentTime();
    }

    public void setCurrentTime() {
        Calendar now = Calendar.getInstance();
        hours.setValue(now.get(Calendar.HOUR_OF_DAY));
        minutes.setValue(now.get(Calendar.MINUTE));
        seconds.setValue(now.get(Calendar.SECOND));
    }

    public String getTime() {
        return hours.getDisplayValue() + ":" + minutes.getDisplayValue() + ":" + seconds.getDisplayValue();
    }
}


