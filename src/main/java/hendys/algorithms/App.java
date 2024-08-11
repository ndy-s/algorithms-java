package hendys.algorithms;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DoubleLinkedList<String> list = new DoubleLinkedList<>();
        list.add("A");
        list.add("B");



        System.out.println(list.indexOf("A"));
    }
}
