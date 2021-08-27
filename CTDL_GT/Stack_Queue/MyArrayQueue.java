package Stack_Queue;

public class MyArrayQueue implements IStackQueue {
    private int[] array ;
    private int SIZE ;
    private int headIndex ;
    private int tailIndex;

    MyArrayQueue(int size) {
        SIZE = size;
        array = new int[SIZE] ;
        headIndex = tailIndex = -1 ;                                                                                                                                                                                                
    }
    @Override
    public boolean push(int value) {
        // TODO Auto-generated method stub
        if(!isFull()) {
            if(isEmpty()) {
                headIndex++ ;
            }
            tailIndex++ ;
            array[tailIndex] = value ; 
            return true;   
        }
        return false;
    }

    @Override
    public int pop() {
        // TODO Auto-generated method stub
        int value = -1 ;
        if(!isEmpty()) {
            value = array[headIndex];
            headIndex++;
            if(headIndex > tailIndex) {
                headIndex = tailIndex = -1 ;
            }
        }
        return value ;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return tailIndex == SIZE -1 ;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        
        return (headIndex == -1) && ( tailIndex == -1);
    }
    

    public int count() {
        if(isEmpty()) 
            return 0;
        return tailIndex - headIndex + 1 ;
    }
    @Override
    public void show() {
        // TODO Auto-generated method stub
        if(isEmpty()) {
            System.out.println("Queue is Empty");
        }else{
            for( int i = headIndex; i <= tailIndex; i++ ) {
                System.out.println(array[i] + " ");
            }
            System.out.println();
        }           
        
    }

}
    

