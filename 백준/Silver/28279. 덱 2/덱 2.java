import java.io.*;
import java.util.*;

/*
* 1 X: 정수 X를 덱의 앞에 넣는다. (1 ≤ X ≤ 100,000)
* 2 X: 정수 X를 덱의 뒤에 넣는다. (1 ≤ X ≤ 100,000)
* 3: 덱에 정수가 있다면 맨 앞의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
* 4: 덱에 정수가 있다면 맨 뒤의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
* 5: 덱에 들어있는 정수의 개수를 출력한다.
* 6: 덱이 비어있으면 1, 아니면 0을 출력한다.
* 7: 덱에 정수가 있다면 맨 앞의 정수를 출력한다. 없다면 -1을 대신 출력한다.
* 8: 덱에 정수가 있다면 맨 뒤의 정수를 출력한다. 없다면 -1을 대신 출력한다.
*/

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        Deque<Integer> deque = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        
        while(N-- > 0) {
            String input = br.readLine();
            
            switch(input) {
                case "3":
                    sb.append(deque.size() != 0 ? deque.pollFirst() : -1).append("\n");
                    break;
                case "4":
                    sb.append(deque.size() != 0 ? deque.pollLast() : -1).append("\n");
                    break;
                case "5":
                    sb.append(deque.size()).append("\n");
                    break;
                case "6":
                    sb.append(deque.size() == 0 ? 1 : 0).append("\n");
                    break;
                case "7":
                    sb.append(deque.size() != 0 ? deque.peekFirst() : -1).append("\n");
                    break;
                case "8":
                    sb.append(deque.size() != 0 ? deque.peekLast() : -1).append("\n");
                    break;
                default:
                    String[] splitedInput = input.split(" ");
                    int num = Integer.parseInt(splitedInput[1]);
                    
                    if(splitedInput[0].equals("1")) {
                        deque.offerFirst(num);
                    } else {
                        deque.offerLast(num);
                    }
            }
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}

// ArrayDeque 구현
class IntegerArrayDeque {
    private int top;
    private int bottom;
    private int max;
    private int[] dequeArray;
    
    public IntegerArrayDeque(int max) {
        this.top = 0;
        this.bottom = 0;
        this.max = max;
        this.dequeArray = new int[this.max];
    }
    
    public int isEmpty() {
        return this.top == this.bottom ? 1 : 0;
    }
    
    public int isFull() {
        return this.bottom - 1 == this.max ? 1 : 0;
    }
    
    public int size() {
        return this.bottom - this.top;
    }
    
    public void offerFirst(int input) {
        if(isFull() == 1) return;
        
        for(int i = this.bottom - 1; i >= this.top; i--)
            this.dequeArray[i + 1] = this.dequeArray[i];
        
        this.dequeArray[this.top] = input;
        this.bottom++;
    }
    
    public void offerLast(int input) {
        if(isFull() == 1) return;
        
        this.dequeArray[this.bottom++] = input;
    }
    
    public int pollFirst() {
        if(isEmpty() == 1) return -1;
        
        return this.dequeArray[this.top++];
    }
    
    public int pollLast() {
        if(isEmpty() == 1) return -1;
        
        return this.dequeArray[--this.bottom];
    }
    
    public int peekFirst() {
        if(isEmpty() == 1) return -1;
        
        return this.dequeArray[this.top];
    }
    
    public int peekLast() {
        if(isEmpty() == 1) return -1;
        
        return this.dequeArray[this.bottom - 1];
    }
}