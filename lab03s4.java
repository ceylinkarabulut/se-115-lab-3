import java.util.Scanner;
public class lab03s4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three integers:");
        System.out.print("a= ");
        int a = sc.nextInt();
        System.out.print("b= ");
        int b = sc.nextInt();
        System.out.print("c= ");
        int c = sc.nextInt();
        int x = (a+b);
        int y = (a+c);
        int z = (b+c);
        if ((y < b) && (z < a) && (x<c)){
            System.out.println("THIS IS NOT A TRIANGLE.");
        }
        else if ((a==0)||(b==0)||(c==0)){
        System.out.println("INVALID LENGTH");
        }
        if (a==b&&c==b) {
            System.out.println("EQUILATERAL");
        }
        else if (a == b || b == c || a == c) {
            System.out.println("ISOSCELES");
        }
        else {
            System.out.println("SCALENE");
        }
        int p = (a+b+c);
        System.out.printf("perimeter= %d " , p);
    }
}