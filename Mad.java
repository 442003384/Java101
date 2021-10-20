import java.util.Scanner;
public class Mad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grade;
        System.out.print("A grade from 0 to 100");
        grade = scan.nextInt();
        if (grade >=90 && grade <=100){
            System.out.print("grade: " + grade);
            System.out.print("A");

        }
        else if (grade >= 80 && grade <=90 ){
            System.out.print("Good job");
            System.out.print("grade: " + grade+"out of 100");
        }
        else if (grade >= 60 && grade <=70 ){
            System.out.print("Passed the course");
            System.out.print("grade: " + grade+"out of 100");

        }
        else {
            System.out.print("Sorry you fail or you entered a wrong grade");
        }


    }
}
