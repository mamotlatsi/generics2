import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter even number: ");
        int num = input.nextInt();
        evenOrOdd(num);
    }
    public static void evenOrOdd(int number ){
        if(number % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
