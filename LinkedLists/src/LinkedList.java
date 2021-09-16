import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

    private Node first;
    private int size;

    private class Node{
        T item;
        Node next;

        public String toString(){
            return (String) next.item;
        }
    }

    public LinkedList(){
        first = null;
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void add(T item){
        if(isEmpty()){
            first = new Node();
            first.item = item;
        }
        else{
            Node current = first;
            while(current.next != null){
                current = current.next;
            }
            Node next = new Node();
            next.item = item;
            current.next = next;
        }
        size++;
    }

    public T get(int i) throws Exception{
        int counter = 0;
        if(!isEmpty()){
            if(i>=0 && i <=size()){
                Node current = first;
                while(counter != i){
                    current = current.next;
                    counter++;
                }
                return current.item;
            }

            throw new Exception("List index out of bounds.");


        }
        else{
            return null;
        }
    }

    public T remove(int i) throws Exception{
        if(!isEmpty()){
            if(0<= i && i<=size()){
                int counter = 0;
                Node current = first;
                Node last = new Node();
                while(counter != i){
                    last = current;
                    current = current.next;
                    counter++;
                }

                if(current!= null){
                    T temp = current.item;
                    last.next = current.next;
                    size--;
                    return temp;
                }
                return null;

            }
            throw new Exception("List index out of bounds.");
        }
        else
            return null;
    }

    public T removeLast(){
        if(!isEmpty()){
            Node current = first;
            Node previous = new Node();
            while (current.next!= null){
                previous = current;
                current = current.next;
            }

            if(current!= null){
                T temp = current.item;
                previous.next = null;
                size--;
                return temp;
            }
            return null;
        }
        return null;
    }

    public T getFirst(){
        return first.item;
    }

    public Node reverseLinkedList(){
        if(!isEmpty()){
            Node reverse = null;
            Node second = null;
            while(first!=null){
                second = first.next;
                first.next = reverse;
                reverse = first;
                first = second;
            }
            first = reverse;
            return first;
        }
        return null;
    }



    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
