import java.util.Scanner;
public class commonDivisor {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = num1.nextInt();
        System.out.print("Enter the second number: ");
        int b = num2.nextInt();
        if(a < b){
            int temp = a;
            a = b;
            b = temp;
        }
        int r = a % b;
        while(r != 0){
            a = b;
            b = r;
            r = a % b;
        }
        System.out.println(b);
    }
}
