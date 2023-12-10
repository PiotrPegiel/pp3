public class SurfaceArea {

    public static double rectangle(double x, double y){
        return x*y;
    }

    public static double circle(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    public static double triangle(double base, double height){
        return (base*height)/2;
    }
}
