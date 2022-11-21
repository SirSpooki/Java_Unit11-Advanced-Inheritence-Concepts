public class NonFiction extends Book {

//Parameterized constructor
public NonFiction(String title) {
super(title);
setPrice();
}

/* Method implementation for setPrice() method
* of super class Abstract method
*/
@Override
public void setPrice() {
price=37.99;

}

//toString() method which displays the contents of Fiction Class Object
@Override
public String toString() {
System.out.println("_____Non-Fiction Book_____");
return "Title :"+getTitle()+"\nPrice :$"+getPrice()+"\n";
}

}
