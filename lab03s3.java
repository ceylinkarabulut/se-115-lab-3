import java.util.Random;
import java.util.Scanner;
public class lab03s3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please select an operation: 1 for summing, 2 for difference, 3 for multiplication and 4 for division.");
        System.out.println();
        int p = sc.nextInt();
        Random randomGen = new Random();
        int numone = randomGen.nextInt(1000);
        System.out.println();
        int numtwo = randomGen.nextInt(1000);
        System.out.println();
        if (numtwo ==0){
            System.out.println("DIVISION BY ZERO NOT ALLOWED");
        }
        switch (p) {
            case 1:
                int one = (numone + numtwo);
                System.out.print(one);
                break;
            case 2:
                int two = (numone - numtwo);
                System.out.print(two);
                break;
            case 3:
                int three = (numone * numtwo);
                System.out.print(three);
                break;
            case 4:
                int four = (numone / numtwo);
                System.out.printf("the result is %d" ,four);
                break;
            default:
                System.out.println("This is not a valid operation.");
                break;
        }
    }
}