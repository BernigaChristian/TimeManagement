public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours,int minutes,int seconds){
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
        try{
            if(!isValid())  throw new InvalidTimeException(this);
        }catch(InvalidTimeException e){}

    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    private boolean isValid(){
        return (hours<24&&hours>=0)&&(minutes<60&&minutes>=0)&&(seconds<60&&seconds>=0);
    }

    public void sum(Time t){
        this.hours+=t.hours;
        this.minutes+=t.minutes;
        this.seconds+=t.seconds;
        try{
            if(!isValid())  throw new InvalidTimeException(this);
        }catch(InvalidTimeException e){}

    }

    public void subtract(Time t){
        this.hours-=t.hours;
        this.minutes-=t.minutes;
        this.seconds-=t.seconds;
        try{
            if(!isValid())  throw new InvalidTimeException(this);
        }catch(InvalidTimeException e){}


    }

    public String toString(){return this.hours+":"+this.minutes+":"+this.seconds;}

}
