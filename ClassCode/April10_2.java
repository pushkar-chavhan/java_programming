
interface Shape {
    double area(); 
    double perimeter(); 
}

abstract class AbstractShape implements Shape {

}

class Rectangle extends AbstractShape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    
    public double area() {
        return length * width;
    }
    
    
    public double perimeter() {
        return 2 * (length + width);
    }
}
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        System.out.println("Area of Rectangle="+r.area());
	System.out.println("Perimeter of Rectangle="+r.Perimeter());
        }
}
