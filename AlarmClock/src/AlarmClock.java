public class AlarmClock extends Clock{

    private int SetSeconds, SetMinutes, SetHours;

    public  AlarmClock(int a, int b, int c){
        SetHours   = a;
        SetMinutes = b;
        SetSeconds = c;
    }

    public void tick(){
        Seconds = Seconds + 1;
        Minutes = Minutes + Seconds / 60;
        Hours   = Hours   + Minutes / 60;
        Seconds = Seconds % 60;
        Minutes = Minutes % 60;
        Hours   = Hours   % 24;
        if (Hours == SetHours && Minutes == SetMinutes && Seconds == SetSeconds) {
            System.out.println("****************");
            System.out.println(Hours + ":" + Minutes + ":" + Seconds + "\t" + SetHours + ":" + SetMinutes + ":" + SetSeconds);
        }
    }
}
