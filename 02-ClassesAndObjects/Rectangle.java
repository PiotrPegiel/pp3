public class Rectangle {
    private int x;
    private int y;

    public void setX(int input){
        x = input;
    }
    public void setY(int input){
        y = input;
    }

    public void displayDimensions(){
        System.out.println(x+"x"+y);
    }
    public int perimeter(){
        return 2*x+2*y;
    }
    public int surfaceArea(){
        return x*y;
    }
}
