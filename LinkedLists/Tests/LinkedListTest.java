import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @org.junit.Test
    public void add() {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Bye");
        list.add("Hello");
        list.add("Nice");
        String res;
        try{
            res = list.get(1);
            assertEquals("The add method does not work properly.", res, "Hello");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    @org.junit.Test
    public void get() {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Bye");
        list.add("Hello");
        list.add("Nice");
        list.add("Cat");
        list.add("Dog");
        list.add("Food");
        String res;
        try{
            res = list.get(2);
            assertEquals("The get method does not work properly.", res, "Nice");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @org.junit.Test
    public void remove() {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Bye");
        list.add("Hello");
        list.add("Nice");
        list.add("Cat");
        list.add("Dog");
        list.add("Food");
        String res;
        try{
            res = list.remove(4);
            assertEquals("The remove method does not work properly.", res, "Dog");
            String algo = list.get(3);
            assertEquals("The remove method does not work properly.", algo, "Cat");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void reverseLinkedList() {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Bye");
        list.add("Hello");
        list.add("Nice");
        list.add("Cat");
        list.add("Dog");
        list.add("Food");
        list.reverseLinkedList();
        try{
            String res = list.getFirst();
            assertEquals("LinkedList reverse does not work.", res, "Food");
            String second = list.get(1);
            assertEquals("LinkedList reverse does not work.", second, "Dog");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}