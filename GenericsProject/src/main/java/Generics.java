import java.util.Arrays;

/**
 * This class has a method that accepts array arguments of type T and print out its values to the console
 * @author Kgaugelo Ramaramela
 * @author Mamotlatsi
 * @param <T>
 */
public class Generics<T> {

    /**
     * This methos accepts array arguments of type T and prints them out to the console
     * @param array
     */
    @SafeVarargs
    final void printArrayContent(T... array){
        System.out.println(Arrays.toString(array));
    }
}
