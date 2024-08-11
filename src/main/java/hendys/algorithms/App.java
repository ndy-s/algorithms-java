package hendys.algorithms;

import hendys.algorithms.LinkedList.DoublyLinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.add("A");
        list.add("B");



        System.out.println(list.indexOf("A"));
    }
}
