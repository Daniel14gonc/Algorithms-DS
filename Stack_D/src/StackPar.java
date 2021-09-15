public class StackPar<T> implements Stack<T>{

    private T[] elements;
    private int N = 0;
    private int actualSize = 20;

    public StackPar(){
        elements = (T[]) new Object[actualSize];
    }

    @Override
    public void push(T element){
        elements[N++] = element;
    }

    @Override
    public T pop(){
        T temp = elements[--N];
        elements[N] = null;
        return temp;
    }

    @Override
    public T peek(){
        return elements[N-1];
    }

    @Override
    public int size(){
        return N;
    }

    @Override
    public boolean isEmpty(){
        return N == 0;
    }
}

