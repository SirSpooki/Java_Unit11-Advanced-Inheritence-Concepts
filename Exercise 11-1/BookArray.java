public class BookArray {

public static void main(String[] args) {

//Creating Book array which stores Fiction and Non-Fiction Book Objects
Book bookArray[]={new Fiction("Dune"),
new Fiction("Ender's Game"),
new Fiction("Fahrenheit 51"),
new Fiction("Brave New World"),
new Fiction("A Game of Thornes"),
new NonFiction("Homage to Catlonia"),
new NonFiction("A Room of One's Own"),
new NonFiction("Black Boy"),
new NonFiction("Fast Food Nation"),
new NonFiction("Meditations")};

//This for loop will displays the Each Fiction and Non-Fiction book details
for(int i=0;i<bookArray.length;i++)
{
//Displaying the information of each book
System.out.println(bookArray[i].toString());
}
}

}
