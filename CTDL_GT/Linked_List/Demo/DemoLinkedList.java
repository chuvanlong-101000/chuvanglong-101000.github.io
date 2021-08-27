
package Demo;

public class DemoLinkedList {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2 ;
        n2.next = n3 ;

        printLinkedList(n1);
    }
    // Nối các node
    public static void printLinkedList(Node head) {
        if( head == null ) {
            System.out.print("List is empty");
        }else{
            Node temp = head ; 
            while( temp != null ) {
                System.out.print(temp.value);
                temp = temp.next ;
                if( temp != null ) {
                    System.out.print("->");
                }else{
                    System.out.println("");
                }
            }
        }
    }

    //Thêm 1 phần tử vào đầu
    public static Node addToHead( Node headNode , int value) {
        Node newNode = new Node(value);
        if(newNode != null) {
            return newNode;
        }else{
            
        }
        return null ;
    }
}


