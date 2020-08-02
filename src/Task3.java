import java.util.Scanner;

public class Task3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the variables x from 1-10");
        int x = sc.nextInt();

       Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the variable y from 1-10");
        int y = sc1.nextInt();

        int z = x+y;
            z= z+30;

        System.out.println("The final variable z is:"+ " " + z);

    }
}
