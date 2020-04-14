import java.util.Scanner;

public class squareC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = input.nextInt();
        square(number);
    }
    public static void square(int Num) {
        int count = Num - 1;
        while (Num > 0){
            for (int i = 0; i < count; i++) {
                System.out.print("#");
            }
            System.out.println("#");
            Num--;
        };
    }
}

