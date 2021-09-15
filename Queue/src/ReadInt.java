public class ReadInt {

    public static void main(String[] args) {
        Queue<Integer> queue = new QueueImp<Integer>(100);
        int[] arr = new int[100];

        for(int i = 0;i<100;i++){
            try {
                queue.enqueue(i);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        for(int i = 0;i<100; i++){
            arr[i] = queue.dequeue();
        }

        for(int i: arr)
            System.out.println(i);
    }
}
