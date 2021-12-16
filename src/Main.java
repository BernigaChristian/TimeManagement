public class Main {

    public static void main(String[] args) {
    Time t1=new Time(18,54,36);
    Time t2=new Time(7,8,42);
    System.out.println("Time 1:"+t1);
    System.out.println("Time 2:"+t2);
    t1.sum(t2);
    System.out.println(t1);
    t1.subtract(t2);
    System.out.println(t1);
    }
}
