import java.util.Scanner;
 class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Num ;
        System.out.println("Enter a number");
     Num = scan.nextInt();
      Num %=2;
        if(Num==0){
            System.out.println("even");
        }
        else {
            System.out.println("ood");
        }
    }
}
