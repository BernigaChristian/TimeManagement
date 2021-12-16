public class InvalidTimeException extends Exception{

    public InvalidTimeException(Time t){
        normalize(t);
    }

    private void normalize(Time t){
        if(t.getSeconds()>=60){
            t.setMinutes(t.getMinutes()+(t.getSeconds()/60));
            t.setSeconds(t.getSeconds()%60);
        }
        else if(t.getSeconds()<0)
            t.setSeconds(60+t.getSeconds());
        if(t.getMinutes()>=60){
            t.setHours(t.getHours()+(t.getMinutes()/60));
            t.setMinutes(t.getMinutes()%60);
        }
        else if(t.getMinutes()<0)
            t.setMinutes(60+t.getMinutes());
        if(t.getHours()>=24)
            t.setHours(t.getHours()%24);
        else if(t.getHours()<0)
            t.setHours(24+t.getHours());
    }
}
