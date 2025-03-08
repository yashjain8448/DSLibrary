import java.util.*;

// Using Array
class MyStack1 {
    int top = 999;
    int arr[] = new int[1000]; // considering max size of array to be 1000

    // Function to push an integer into the stack.
    void push(int val) {
        if (top == -1)
            return; // stack overflow

        arr[top] = val;
        top--;
    }

    // Function to remove an item from top of the stack.
    int pop() {
        if (top == arr.length - 1)
            return -1; // stack underflow

        top++;
        return arr[top];
    }

    int peek(){
        if(top == -1 || top >= 999){
            System.out.println("Stack is Empty");
            return -1;
        }
        int idx = top + 1;
        return arr[idx];
    }
}

// Using ArrayList
class MyStack2 {
    ArrayList<Integer> arr = new ArrayList<>();

    // Function to push an integer into the stack.
    void push(int val) {
        arr.add(val); // insert in the last of arraylist
    }

    // Function to remove an item from top of the stack.
    int pop() {
        if (arr.size() == 0)
            return -1; // stack underflow
        return arr.remove(arr.size() - 1);
    }

    int peek(){
        if (arr.size() == 0)
            return -1; // stack underflow
        return arr.get(arr.size() - 1);
    }
}


// Using Linked List
class StackNode {
    int data;
    StackNode next;
    StackNode(int a) {
        data = a;
        next = null;
    }
}

class MyStack3 {
    StackNode top;

    // Function to push an integer into the stack.
    void push(int val) {
        StackNode temp = new StackNode(val);
        temp.next = top;
        top = temp;
    }

    // Function to remove an item from top of the stack.
    int pop() {
        if (top == null)
            return -1;
        int val = top.data;
        top = top.next;
        return val;
    }

    int peek(){
        if (top == null)
            return -1;
        
        return top.data;
    }
}

class Main {
    public static void main(String[] args) {
        MyStack1 stk1 = new MyStack1();
        stk1.push(10);
        stk1.push(20);
        stk1.push(30);
        stk1.push(40);

        System.out.println(stk1.peek());

        MyStack2 stk2 = new MyStack2();
        stk2.push(10);
        stk2.push(20);
        stk2.push(30);
        stk2.push(40);

        System.out.println(stk2.peek());

        MyStack3 stk3 = new MyStack3();
        stk3.push(10);
        stk3.push(20);
        stk3.push(30);
        stk3.push(40);

        System.out.println(stk3.peek());

    }
}
