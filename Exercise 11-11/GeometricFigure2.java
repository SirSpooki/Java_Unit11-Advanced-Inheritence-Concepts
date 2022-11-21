//Java abstract class
public abstract class GeometricFigure2 implements SidedObject {
//fields
protected int height;
protected int width;
protected String figure;
//constructor
public GeometricFigure2(int h, int w, String f) {
this.height=h;
this.width=w;
this.figure=f;
}
//getter method to return height
public int getHeight() {
return this.height;
}
//getter method to return width
public int getWidth() {
// write your code here
return this.width;
}
//getter method to return figure
public String getFigure() {
// write your code here
return this.figure;
}
//abstract method to calculate figureArea
public abstract double figureArea(int h, int w);
}
