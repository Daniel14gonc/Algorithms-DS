public class QueueImp <T> implements Queue<T>{

    private T[] elements;
    private int N;
    private int first;
    private int last;

    public QueueImp(int size){
        elements = (T[]) new Object[size];
        N = 0;
        first = 0;
        last = 0;
    }

    public void enqueue(T element) throws Exception{
        if(isFull())
            throw new Exception("Queue overflow");
        elements[N++] = element;
        last = (last + 1) % elements.length;
    }

    public T dequeue(){
        if(isEmpty())
            return null;

        T res = elements[first];
        first = (first + 1) % elements.length;
        N--;

        return res;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    private boolean isFull(){
        return N == elements.length;
    }
}
