import java.util.Scanner;
public class lab03s2{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your student ID: ");
        long id = sc.nextLong();
        if(id % 2 == 0 && id%3 != 0){
            System.out.println("Student is in ALPHA TEAM!");
        }
        else if(id%5 == 0 || id%7 == 0){
            System.out.println("Student is in BETA TEAM!");
        }
        else if(id%9 > 5){
            System.out.println("Student is in THETA TEAM!");
        }else{
            System.out.println("Student is in SIGMA TEAM!");
        }
    }
}

