import java.util.Scanner;

class Assignment1 {
  public static void main(String [] args) {
    Scanner myObj = new Scanner(System.in);
    float number1;
    
    float number2;
    // Enter username and press Enter
    System.out.println("Enter a number");
    number1 = myObj.nextFloat(); 
    System.out.println("Enter a number"); 
    number2 = myObj.nextFloat();
       
    System.out.println(number1 + number2);
    System.out.println(number1 - number2);
    System.out.println(number1 * number2);
    System.out.println(number1 / number2);
    System.out.println(number1 % number2);
    System.out.println(number1 > number2);
    System.out.println(number1 >= number2);
    System.out.println(number1 < number2);
    System.out.println(number1 <= number2);
    System.out.println(number1 != number2);
    System.out.println(number1 == number2);
  }
}
