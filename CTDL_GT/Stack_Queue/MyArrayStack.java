package Stack_Queue;

public class MyArrayStack implements IStackQueue{

    private int[] array ;
    private int SIZE ;
    private int topIndex ;
    MyArrayStack(int size) {
        SIZE = size ;
        array = new int[SIZE];
        topIndex = -1 ;
    }

    @Override
    public boolean push(int value) {
        // TODO Auto-generated method stub
        if(!isFull()){
            topIndex++ ;
            array[topIndex] = value ;
            return true ;
        }
        return false;
    }

    @Override
    public int pop() {
        // TODO Auto-generated method stub
        if(!isEmpty()){
            int value = array[topIndex];
            topIndex-- ;
            return value ;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return topIndex == SIZE-1;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return topIndex < 0 ;
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }else{
            for(int i = 0; i <= topIndex; i++) {
                System.out.println(array[i] + " ");
            }
            System.out.println("");
        }
    }
    
}
