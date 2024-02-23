import java.io.*;

/*
 * push X 정수 X를 큐에 넣는 연산.
 * pop 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력
 * size 큐에 들어있는 정수의 개수를 출력.
 * empty 큐가 비어있으면 1, 아니면 0을 출력.
 * front 큐의 가장 앞에 있는 정수를 출력. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력.
 * back 큐의 가장 뒤에 있는 정수를 출력. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        IntegerArrayQueue queue = new IntegerArrayQueue(2000000);
        int N = Integer.parseInt(br.readLine());

        while(N-- > 0) {
            String input = br.readLine();

            switch(input) {
                case "pop":
                    sb.append(queue.pop()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty()).append("\n");
                    break;
                case "front":
                    sb.append(queue.front()).append("\n");
                    break;
                case "back":
                    sb.append(queue.back()).append("\n");
                    break;
                default:
                    int num = Integer.parseInt(input.substring(5));
                    queue.push(num);
                    break;
            }
        }

        System.out.print(sb.toString());

        br.close();
    }
}

// ArrayQueue 구현
class IntegerArrayQueue {
    private int maxSize;
    private int top;
    private int bottom;
    private int[] queueArray;

    public IntegerArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.top = 0;
        this.bottom = 0;
        this.queueArray = new int[maxSize];
    }

    public int isEmpty() {
        return size() == 0 ? 1 : 0;
    }

    public int isFull() {
        return this.bottom == this.maxSize - 1 ? 1: 0;
    }

    public void push(int input) {
        if(isFull() == 1) return;

        this.queueArray[this.bottom++] = input;
    }

    public int pop() {
        if(isEmpty() == 1) return -1;

        return this.queueArray[this.top++];
    }

    public int size() {
        return this.bottom - this.top;
    }

    public int front() {
        if(isEmpty() == 1) return -1;

        return this.queueArray[this.top];
    }

    public int back() {
        if(isEmpty() == 1) return -1;

        return this.queueArray[this.bottom - 1];
    }
}

// LinkedQueue 구현
class IntegerLinkedQueue {
    private IntegerLinkedQueueNode topNode;
    private IntegerLinkedQueueNode bottomNode;

    public IntegerLinkedQueue() {
        this.topNode = null;
        this.bottomNode = null;
    }

    public int isEmpty() {
        return this.topNode == null ? 1 : 0;
    }

    public void push(int input) {
        IntegerLinkedQueueNode newNode = new IntegerLinkedQueueNode(input);

        if(isEmpty() == 1) {
            this.topNode = newNode;
            this.bottomNode = newNode;
            return;
        }

        this.bottomNode.nodeLink = newNode;
        this.bottomNode = newNode;
    }

    public int pop() {
        if(isEmpty() == 1) return -1;

        int data = this.topNode.getData();

        this.topNode = this.topNode.nodeLink;

        if(isEmpty() == 1) this.bottomNode = null;

        return data;
    }

    public int size() {
        int count = 0;
        IntegerLinkedQueueNode tempNode = this.topNode;

        while(tempNode != null) {
            count++;
            tempNode = tempNode.nodeLink;
        }

        return count;
    }

    public int front() {
        if(isEmpty() == 1) return -1;

        return this.topNode.getData();
    }

    public int back() {
        if(isEmpty() == 1) return -1;

        return this.bottomNode.getData();
    }
}

class IntegerLinkedQueueNode {
    private int data;
    public IntegerLinkedQueueNode nodeLink;

    public IntegerLinkedQueueNode() {
        this.data = 0;
        this.nodeLink = null;
    }

    public IntegerLinkedQueueNode(int data) {
        this.data = data;
        this.nodeLink = null;
    }

    public IntegerLinkedQueueNode(int data, IntegerLinkedQueueNode nodeLink) {
        this.data = data;
        this.nodeLink = nodeLink;
    }

    public int getData() {
        return this.data;
    }
}