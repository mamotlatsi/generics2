/**
 * This class accepts any generic parameter and sets it to a variable that will be printed out
 * @author Kgaugelo Ramaramela
 * @author Mamotlatsi
 * @param <T>
 */
public class GenericClass<T> {
    private T toBePrinted;//this is the variable that will printed out when the get method is invoked

    /**
     * this method sets the argument value accepted to the private variable toBePrinted
     * @param value
     */
    void set(T value) {
        toBePrinted = value;
    }

    /**
     * this method simply prints out the toBePrinted variable to the console
     */
    void get() {
        System.out.println(toBePrinted);
    }
}
