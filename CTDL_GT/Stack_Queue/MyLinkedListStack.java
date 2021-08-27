package Stack_Queue;

import java.util.ArrayList;

public class MyLinkedListStack  implements IStackQueue {
    
    private class Node {
        int value ;
        Node next ;
        Node( int value ) {
            this.value = value;
        }
    }
    
    Node topNode;
    MyLinkedListStack() {
        topNode = null ;
    }

    @Override
    public boolean push(int value) {
        // TODO Auto-generated method stub
        if(!isFull()){
            // thêm 1 phần tử vào đầu 1 phần tử của linked list
            Node newNode =  new Node(value) ;
            newNode.next = topNode ;
            topNode = newNode ;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        // TODO Auto-generated method stub
        if(isEmpty())
        return -1 ;
        int value = topNode.value ;
        topNode = topNode.next ;
        return value ;
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return topNode == null;
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        Node temp = topNode ;
        ArrayList<Integer> tempList = new ArrayList<>();
        while (temp != null) {
            //System.out.print(temp.value +" ");
            tempList.add(temp.value);
            temp = temp.next ;
        }
        for( int i = tempList.size() - 1 ; i >= 0 ; i--) {
            System.out.println(tempList.get(i) + " ");
        }
        System.out.println();
    }
    
}
