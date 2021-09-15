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
    }

    @org.junit.Test
    public void remove() {
    }
}