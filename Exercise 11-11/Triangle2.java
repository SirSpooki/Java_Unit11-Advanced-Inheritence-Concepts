//Java class
public class Triangle2 extends GeometricFigure2 {
private double area;//field
//constructor
public Triangle2(int w, int h, String f) {
super(w, h, f);
}
//method to calculate figureArea
public double figureArea(int w, int h) {
area = (double) (w * h * 0.5);
return area;//return area
}
//method to display slides
public void displaySides() {
// write your code here
System.out.println("This figure has three sides");
}
}
