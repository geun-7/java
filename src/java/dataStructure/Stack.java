package java.dataStructure;

/**
 * <Stack> : 선입 후출(FILO) -> 입구와 출구가 같다
 * 1) top: 가장 최근에 들어간 데이터의 위치? 즉 스택 구조에서 데이터가 쌓인 높이?// push할 때마다 증가 // pop할 때마다 감소
 * 2) isEmpty() : Top이 0이 아니라면 false
 * 3) isFull() :
 * 4) peek() : Top위치에 있는 데이터를 반환
 * 5) push() : 데이터를 스택구조에 넣을 때
 * 6) pop() : Top에 있는 데이터를 반환하며 삭제 -> Top감소, 데이터 반환
 */
public class Stack {

    int top; // 포인트의 위치값
    int []stack;

    public Stack(int initCount){ // 생성자
        if(initCount<1){
            System.out.println("Data Range Check");
            return;
        }
        stack = new int[initCount];
        top = -1;
    }

    private void push(int addData) {
        if(isFull()) increment();
        stack[++top] = addData;
    }

    private int pop() {
        int returnData = stack[top];
        stack[top--] = 0;
        return returnData;
    }

    private int peek() {
        return stack[top];
    }

    private boolean isFull() {
        return stack.length-1 == top;
    }

    private boolean isEmpty() {
        return top==-1;
    }

    private void printStack(){
//        for (int i : stack) {
//            System.out.println(i);
//        }
        for (int i = top; i >= 0 ; i--) {
            System.out.println(stack[i]);
        }
    }

    public void increment(){
        int [] newArray = new int[stack.length*2];
        for (int i = 0; i < stack.length; i++) {
            newArray[i] = stack[i];
        }
        stack = newArray;
    }
    public static void main(String[] args) {
        Stack s = new Stack(5);
        for (int i = 1; i < 8; i++) {
            s.push(i*10);
        }
        s.printStack();
        int popData = s.pop();
        System.out.println("popData = " + popData);
        s.printStack();
        int peekData = s.peek();
        System.out.println("peekData = " + peekData);

    }
}
