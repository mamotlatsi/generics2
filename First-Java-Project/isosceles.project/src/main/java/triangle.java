import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner inout = new Scanner(System.in);
        System.out.println("Enter number: ");
        int Num = inout.nextInt();
        isosceles(Num);
    }
    public static void isosceles(int number){
        for (int i = 1; i <= number; i++) {


            for (int j = number; j >= i; j--) {
                System.out.print(" ");
            }


            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
