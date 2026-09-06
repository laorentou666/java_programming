import java.util.Scanner;
class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println("Enter a declimal number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String binary = Integer.toBinaryString(num);
        System.out.println(binary);
    }
}