//Java class
public class UseGeometric2 {
//main method,that is entry point of the class
public static void main(String[] args) {
double area;
int height;
int width;
String figureType;
//creating array of GeometricFigure2
GeometricFigure2[] figure = new GeometricFigure2[4];
Square2 f0 = new Square2(5, 5, "Square");//object of Square2
Triangle2 f1 = new Triangle2(5, 5, "Triangle");//object of Triangle2
Square2 f2 = new Square2(10, 10, "Square");//object of Square2
Triangle2 f3 = new Triangle2(10, 10, "Triangle");//object of Triangle2
//adding each object in the array as array element
figure[0] = f0;
figure[1] = f1;
figure[2] = f2;
figure[3] = f3;
//using for loop to loop through each figure
for (int i = 0; i < figure.length; i++) {
height = figure[i].getHeight();//get height of the figure
width = figure[i].getWidth();//get width of the figure
figureType = figure[i].getFigure();//get type of the figure
area = figure[i].figureArea(height, width);//call method to compute area of figure
//print details such as figure type , height width
System.out.println("The " + figureType + " with height = " + height + " and with width = " + width
+ " has an area of " + area);
figure[i].displaySides();//call method to display sides of the figure
}
}
}
