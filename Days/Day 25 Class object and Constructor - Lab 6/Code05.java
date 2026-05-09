public class Code05 {
    public static void main(String[] args) {
        Time t1 = new Time(5,30, 45);
        Time t2 = new Time(3, 15, 8);
        Time t3 = new Time();
        Time t4 = new Time();
        t3 = t2.addTime(t1);
        t4 = t1.subTime(t2);
        System.out.print("t1: ");
        t1.displayTime();
        System.out.print("t2: ");
        t2.displayTime();
        System.out.print("t1 + t2: ");
        t3.displayTime();
        System.out.print("t1 - t2: ");
        t4.displayTime();
    }
}
class Time{
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    /*
    *
    public Time(int hours, int minutes, int seconds) {
    // Normalize seconds and minutes
    int totalMinutes = minutes + seconds / 60;
    this.seconds = seconds % 60;

    int totalHours = hours + totalMinutes / 60;
    this.minutes = totalMinutes % 60;
    this.hours = totalHours;
}
    * */
    public Time(){
        this(0, 0, 0);  // Constructor chaining
    }
    public void displayTime(){
        System.out.println(this.hours+" HH "+this.minutes+" MM "+this.seconds+" SS");
    }
    public Time addTime(Time t){
        Time add = new Time();
        int totalsec = this.seconds + t.seconds;
        add.seconds = totalsec%60;
        int totalmin = this.minutes + t.minutes + (totalsec/60);
        add.minutes = totalmin%60;
        add.hours = this.hours + t.hours + (totalmin/60);
        return add;
    }
    public Time subTime(Time t) {
        Time sub = new Time();

        int diffSeconds = this.seconds - t.seconds;
        int diffMinutes = this.minutes - t.minutes;
        int diffHours = this.hours - t.hours;

        // Handle borrowing for seconds
        if (diffSeconds < 0) {
            diffSeconds += 60;
            diffMinutes--;
        }

        // Handle borrowing for minutes
        if (diffMinutes < 0) {
            diffMinutes += 60;
            diffHours--;
        }

        // Handle negative time (if result would be negative)
        if (diffHours < 0) {
            sub.hours = 0;
            sub.minutes = 0;
            sub.seconds = 0;
            System.out.println("Warning: Negative time result, setting to 0");
        } else {
            sub.hours = diffHours;
            sub.minutes = diffMinutes;
            sub.seconds = diffSeconds;
        }

        return sub;
    }
}