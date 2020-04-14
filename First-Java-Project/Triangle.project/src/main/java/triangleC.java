import java.util.Scanner;

public class triangleC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int Num = input.nextInt();
        triangle(Num);
    }
    public static void triangle(int number){
        for(int y=1;y<=number;y++){
            for(int z=1;z>y;z--){

            }
            System.out.print(" ");
            for(int x=1;x<=y;x++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
