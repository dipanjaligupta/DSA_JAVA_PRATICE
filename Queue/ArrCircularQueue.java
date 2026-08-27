public class ArrCircularQueue {
   static class Queue{
    static int arr[];
    static int size;
    static int rear;
    static int front;

    Queue(int n){
        arr = new int[n];
        size = n;
        rear = -1;
        front = -1;
    }
    public static boolean isEmpty(){
        return rear == -1 && front == -1;
    }
    public static boolean isfull(){
        return (rear+1)%size == front;
    }
    //add
    public static void add(int data) {
        if(isfull()){
            System.out.println("queue is full");
            return;
        }
        //add 1st ele
        if(front == -1 ){
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;
    }
    //remove
    public static int remove(){
        isEmpty(){
            System.out.println("emprty queue");
            return -1;
        }
        int result = arr[front];
        //last ele detep;
        if(rear == front){
            rear = front = -1;

        }else{
            front = (front + 1)%
        }
        front = (front + 1) % size;
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
   } 
}
