public class Lamp {
    private boolean isOn;

    public void switchOn(){
        isOn = true;
    }
    public void switchOff(){
        isOn = false;
    }
    public void displayStatus(){
        System.out.println("The lamp is "+ (isOn?"On":"Off"));
    }
}
