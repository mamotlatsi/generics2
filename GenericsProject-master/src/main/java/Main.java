/**
 * @author Kgaugelo Ramaramela
 * @author Mamotlatsi
 * This class acts as an entry point for the whole project
 */
public class Main {

    public static void main(String[] args) {

        GenericClass<String> stringInstance;
        GenericClass<Integer> integerInstance;


        stringInstance = new GenericClass<>();
        stringInstance.set("Test");

        stringInstance.get(); // print out Test

        integerInstance = new GenericClass<>();
        integerInstance.set(1000);

        integerInstance.get(); // print out 1000

    }
}
