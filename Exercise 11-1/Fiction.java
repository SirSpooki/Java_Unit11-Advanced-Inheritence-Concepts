public class Fiction extends Book {

//Creating Parameterized constructor
public Fiction(String title) {
super(title);
setPrice();
}

/* Method implementation for setPrice() method
* of super class Abstract method
*/
@Override
public void setPrice() {
price=24.99;

}

//toString() method which displays the contents of Fiction Class Object
@Override
public String toString() {
System.out.println("_____Fiction Book_____");
return "Title :"+getTitle()+"\nPrice :$"+getPrice()+"\n";
}
}
