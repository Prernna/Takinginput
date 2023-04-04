import java.util.Scanner;
public class Takinginput {
    public static void main(String[] args) {

        System.out.println("IT works!");
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("the sum of these no. is");
        System.out.println(sum);
    }
}
