import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

    private Node first;
    private int size;

    private class Node{
        T item;
        Node next;
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

                last.next = current.next;
                if(current.next!= null){
                    T temp = current.next.item;
                    return temp;
                }
                return null;

            }
            throw new Exception("List index out of bounds.");
        }
        else
            return null;
    }



    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
