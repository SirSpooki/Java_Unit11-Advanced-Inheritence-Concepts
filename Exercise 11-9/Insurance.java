//Java class
public abstract class Insurance
{
protected String type;
protected double cost;
public Insurance(String lh)
{
// write your code here
this.type=lh;
}
public String getType()
{
// write your code here
return this.type;//return insurance type
}
public double getCost()
{
// write your code here
return this.cost;//return insurance cost
}
public abstract void setCost();
public abstract void display();
}
