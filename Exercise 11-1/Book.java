public abstract class Book {
//Declaring variables
private String title;
protected double price;

//Parameterized constructor
public Book(String title) {
super();
this.title = title;
}

//Getter methods
public String getTitle() {
return title;
}

public double getPrice() {
return price;
}

//Abstract method
public abstract void setPrice();
}
