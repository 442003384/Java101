import java.util.Scanner; // import the Scanner class 

class Main {
  public static void main(String [] args) {
    Scanner myObj = new Scanner(System.in);
    float number1;
    //هنا أنت مكرر عملية التعريف للأسكانر مرتين ، تقدر تستخدم نفس السطر ٥ في كل مرة
     Scanner mylbj = new Scanner(System.in);
    float number2;
    // Enter username and press Enter
    System.out.println("Enter a number");
    number1 = myObj.nextFloat(); 
    System.out.println("Enter a number"); 
    number2 = mylbj.nextFloat();
       
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
    // هل هذه العملية عملية مساواة أم عملية اسناد قيمة المتغير ٢ إلى المتغير ١
    System.out.println(number1 = number2);
  }
}
