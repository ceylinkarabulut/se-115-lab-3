import java.util.Random;
    public class lab03s1{
        public static void main(String[] args){
        Random randomhourGenerator = new Random();
        int hour = randomhourGenerator.nextInt(25);
        Random randomminuteGenerator = new Random();
        int minute = randomminuteGenerator.nextInt(60);
    System.out.println( hour + ":" + minute);
    if (hour < minute) {
            System.out.println("hour is less than minute");
        }
       else if (hour > minute) {
            System.out.println("hour is greater than minute");
        }
            else {
            System.out.println("hour is equal to minute");
        }
    }

}