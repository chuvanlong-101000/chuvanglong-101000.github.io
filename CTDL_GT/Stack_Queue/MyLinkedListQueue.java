package Stack_Queue;

public class MyLinkedListQueue  implements IStackQueue {
    
    private class Node {
        int value ;
        Node next ;
        Node( int value ) {
            this.value = value;
        }
    }

    Node headNode , tailNode ;
    MyLinkedListQueue(){
        headNode = tailNode = null;
    }

    @Override
    public boolean push(int value) {
        // TODO Auto-generated method stub
        if(isFull()) {
            return false ;
        }
        Node newNode =  new Node(value) ;
        if(isEmpty()) {
            headNode = tailNode = newNode ;
        }else{
            tailNode.next = newNode;
            tailNode = newNode ;
        }
        return true;
    }

    @Override
    public int pop() {
        // TODO Auto-generated method stub
        if(isEmpty()){
            return -1 ;
        }
        int value = headNode.value;
        if(headNode == tailNode) {
            headNode = tailNode = null ;
        }else{
            headNode = headNode.next ;
        }
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
        return (headNode == null && tailNode == null);
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        Node curNode = headNode;
        while(curNode != null){
            System.out.println(curNode.value +" ");
            curNode = curNode.next ;
        }
        System.out.println();
    }
    
}
