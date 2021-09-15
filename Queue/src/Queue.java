public interface Queue<T> {

    public void enqueue(T element) throws Exception;

    public T dequeue();

    public int size();

    public boolean isEmpty();
}
