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
        list.addLast("1");
        list.addFirst("2");

        System.out.println(list);
    }
}
