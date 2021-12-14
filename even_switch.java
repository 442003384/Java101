import java.util.Scanner;

public class even_switch.java
{
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter number 1");

                int var= scan.nextInt();
                switch (var){
                        case 1:

                                int num1;
                                System.out.print("Enter a Number");
                                num1 = scan.nextInt();
                                num1 %=2;
                                if (num1==0){
                                        System.out.print("even");
                                }
                                else {
                                        System.out.print("odd");
                                }


                }}}
