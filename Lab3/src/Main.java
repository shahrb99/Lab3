public class Main {
    public static void main(String[] args) {
        ClockDisplay cl1 = new ClockDisplay(10,23,15);
        cl1.setTime(6,23,8);
        for(int i=0; i<=80; i++){
            cl1.timeTick();
            System.out.println(cl1.getTime());
        }

    }
}
