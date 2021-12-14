public class Stars.java {
    public static void main(String[] args) {
    int counterA = 0;
    while(counterA <= 5){
        int counterB = 1;
        while(counterB <= counterA){
            System.out.print("*");
            ++counterB;
        }

        System.out.println("*");

        ++counterA;
    }
        }
    }
