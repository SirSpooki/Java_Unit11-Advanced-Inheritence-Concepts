import java.util.*;//import package
//Java class
public class UseInsurance {
//entry point of the program , main method
public static void main(String args[]) {
//creating object of Scanner class
Scanner input = new Scanner(System.in);
int insurance;
//asking user type of insurance
System.out.println("Enter 1 for Life Insurance or 2 for Health Insurance");
String userInput = input.next();//reading user choice
insurance = Integer.parseInt(userInput);
//checking selected insurance
if (insurance == 1)
insuranceLife();//method call
else
insuranceHealth();//method call
}
//method definition
public static void insuranceLife() {
Life life = new Life();
life.setCost();
life.display();
}
//method definition
public static void insuranceHealth() {
Health health = new Health();
health.setCost();
health.display();
}
}
