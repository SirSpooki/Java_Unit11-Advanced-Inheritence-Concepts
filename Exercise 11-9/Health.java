import java.util.*;

public class Health extends Insurance {
public Health() {
// write your code here
super("Health");
}

public void setCost() {
// write your code here
super.cost = 196;// set cost
}

public void display() {
// write your code here
// print details
System.out.println(super.getType() + " insurance with monthly fee of $" + super.getCost());
}
}
