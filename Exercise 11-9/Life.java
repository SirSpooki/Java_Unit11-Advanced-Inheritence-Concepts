import java.util.*;

//Java class
public class Life extends Insurance {
public Life() {
// write your code here
super("Life");
}

public void setCost() {
// write your code here
super.cost = 36;// set cost
}

public void display() {
// write your code here
// print details
System.out.println(super.getType() + " insurance with monthly fee of $" + super.getCost());

}
}
