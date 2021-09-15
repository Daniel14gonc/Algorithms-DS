import org.junit.Test;

import static org.junit.Assert.*;

public class StackParTest {

    @Test
    public void push() {
        Stack<Integer> stack = new StackPar<Integer>();
        stack.push(1);

        assertEquals("No se logro realizar el push", Integer.valueOf(1), stack.peek());
    }

    @Test
    public void pop() {
    }

    @Test
    public void peek() {
    }

    @Test
    public void size() {
    }

    @Test
    public void isEmpty() {
    }
}