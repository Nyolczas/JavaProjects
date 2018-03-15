import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class AlarmClock {
    public void checkAlarm (final int a){
        Thread t = new Thread(){
            public void run()
            {
                int wl=0;
                while(wl==0)
                {
                    Calendar c = new GregorianCalendar();
                    int hours = c.get(Calendar.HOUR);
                    int mins  = c.get(Calendar.MINUTE);
                    if(a == mins){
                        JOptionPane.showMessageDialog(null,"Most "+ hours +":" + mins +" van. Ideje egy kis pihenőt tartani!");
                        break;
                    }
                }
            }
        };
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();
    }

    public static void main(String[] args){
        int nextHour;
        int nextMinute;


        AlarmClock ac = new AlarmClock();
        ac.checkAlarm(7);
    }
}
