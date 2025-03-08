
// Using Array
class MyQueue2 {

    int front = 0, rear = 0;
    int arr[] = new int[100005];

    void push(int val) {
        if (rear == arr.length)
            return; // Overflow: Full
        arr[rear] = val;
        rear++;
    }

    int pop() {
        if (front == rear)
            return -1; // underflow: Empty
        int val = arr[front];
        front++;
        return val;
    }

    int peek(){
        if(rear == front || rear == 0){
            return -1;
        }
        return arr[front];
    }
}

// Using Linked List
class QueueNode {
    int data;
    QueueNode next;

    QueueNode(int a) {
        data = a;
        next = null;
    }
}

class MyQueue1 {
    QueueNode front, rear;

    void push(int val) {
        QueueNode temp = new QueueNode(val);

        if (front == null) {
            front = rear = temp;
        } else {
            rear.next = temp;
            rear = temp;
        }
    }

    int pop() {
        if (front == null)
            return -1;

        int val = front.data;
        front = front.next;
        return val;
    }

    int peek(){
        if (front == null)
            return -1;
        
        return front.data;
    }
}

class Main {
    public static void main(String[] args) {
        MyQueue1 queue1 = new MyQueue1();

        queue1.push(10);
        queue1.push(20);
        queue1.push(30);
        queue1.push(40);

        System.out.println(queue1.pop());

        MyQueue2 queue2 = new MyQueue2();

        queue2.push(10);
        queue2.push(20);
        queue2.push(30);
        queue2.push(40);

        System.out.println(queue2.pop());
        System.out.println(queue2.peek());

    }
}
