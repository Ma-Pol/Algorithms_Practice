import java.io.*;

/*
* push = 1 x
* pop = 2
* size = 3
* isEmpty = 4
* peek = 5
*/

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        IntegerArrayStack stack = new IntegerArrayStack();
        int N = Integer.parseInt(br.readLine());
        
        while(N-- > 0) {
            String input = br.readLine();
            
            // push
            if(input.length() != 1) {
                int num = Integer.parseInt(input.substring(2));
                
                stack.push(num);
            } 
            // 그 외
            else {
                switch(input) {
                    case "2":
                        sb.append(stack.pop()).append("\n");
                        break;
                    case "3":
                        sb.append(stack.size()).append("\n");
                        break;
                    case "4":
                        sb.append(stack.isEmpty()).append("\n");
                        break;
                    case "5":
                        sb.append(stack.peek()).append("\n");
                        break;
                }
            }
        }
        
        System.out.print(sb.toString());
        
        br.close();
    }
}

// ArrayStack 구현
class IntegerArrayStack {
    private int top;
    private int size;
    private int[] stackArray;
    
    public IntegerArrayStack() {
        this.top = 0;
        this.size = 0;
        this.stackArray = new int[1000001];
    }
    
    public int isEmpty() {
        return this.size == 0 ? 1 : 0;
    }
    
    public void push(int input) {
        this.size++;
        this.stackArray[++this.top] = input;
    }
    
    public int pop() {
        if(isEmpty() == 1) return -1;
        
        this.size--;
        return stackArray[this.top--];
    }
    
    public int size() {
        return this.size;
    }
    
    public int peek() {
        if(isEmpty() == 1) return -1;
        
        return stackArray[this.top];
    }
}


// LinkedStack 구현
class IntegerLinkedStack {
    private IntegerLinkedStackNode topNode; // 스택의 최상단 노드
    
    // 생성자 정의
    public IntegerLinkedStack() {
        this.topNode = null;
    }
    
    // 스택의 Empty 여부 출력
    public int isEmpty() {
        return this.topNode == null ? 1 : 0;
    }
    
    // 스택 값 저장
    public void push(int input) {
        // 새로운 노드 생성(현 최상단 노드의 메모리 주소 저장)
        IntegerLinkedStackNode newNode = new IntegerLinkedStackNode(input, topNode);
        // 새로 생성한 노드를 현 최상단 노드로 지정
        this.topNode = newNode;
    }
    
    // 스택 값 출력 및 삭제
    public int pop() {
        // 스택의 Empty 여부 확인
        if(isEmpty() == 1) return -1;
        
        // 스택의 최상단 노드의 값 저장
        int data = this.topNode.getData();
        // 스택의 다음 노드를 현 최상단 노드로 지정
        this.topNode = this.topNode.nodeLink;
        
        return data;
    }
    
    // 스택의 크기 출력
    public int size() {
        // 스택 탐색을 위한 임의의 노드 생성
        IntegerLinkedStackNode tempNode = this.topNode;
        int count = 0;
        
        // 노드를 모두 탐색할 때까지 반복
        while(tempNode != null) {
            count++; // 개수 카운트
            tempNode = tempNode.nodeLink; // 다음 노드로 이동
        }
        
        return count;
    }
    
    // 스택 값 출력
    public int peek() {
        // 스택의 Empty 여부 확인
        if(isEmpty() == 1) return -1;
        
        // 스택의 최상단 노드의 값 출력
        return this.topNode.getData();
    }
}

// 스택에 사용될 노드 구현
class IntegerLinkedStackNode {
    private int data; // 노드에 저장 될 정수 값
    public IntegerLinkedStackNode nodeLink; // 다음 노드의 메모리 주소를 가리키는 링크
    
    // 생성자 정의
    public IntegerLinkedStackNode() {
        this.data = 0;
        this.nodeLink = null;
    }

    public IntegerLinkedStackNode(int data) {
        this.data = data;
        this.nodeLink = null;
    }
    
    public IntegerLinkedStackNode(int data, IntegerLinkedStackNode nodeLink) {
        this.data = data;
        this.nodeLink = nodeLink;
    }
    
    // 노드에 저장된 정수 값 출력
    public int getData() {
        return this.data;
    }
}