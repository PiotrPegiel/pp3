public class C4 {
    private int hour;
    private int minute;

    public C4(int hour, int minute) {
        if(hour>=0 && hour<=23){
            this.hour = hour;
        }
        if(minute>=0 && minute<=59){
            this.minute = minute;
        }
    }

    public void setHour(int hour) {
        if(hour>=0 && hour<=23){
            this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        if(minute>=0 && minute<=59){
            this.minute = minute;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
    
    public void add(){
        minute++;
        if(minute>=60){
            hour++;
            minute = 0;
            if (hour>=24) {
                hour = 0;
            }
        }
    }


    public static void main(String[] args) {
        C4 c = new C4(23,58);
        c.add();
        System.out.println(c.getHour()); //23
        System.out.println(c.getMinute()); //59
        c.add();
        c.add();
        System.out.println(c.getHour()); //0
        System.out.println(c.getMinute()); //1
    }
}
