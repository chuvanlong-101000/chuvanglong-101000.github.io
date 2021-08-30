package Tree;

import java.util.ArrayList;
import java.util.List;
public class MyBST {
    public TreeNode mRoot ;

    public MyBST() {

    }
        // cách thông thường
    public TreeNode insert(TreeNode root , int value) {
        // TH1 : root = null
        TreeNode newNode = new TreeNode(value);
        if(root == null) {
            root = newNode;
            return root ;
        }else{
            TreeNode temp = root ;
            while(true) {
                if(value > temp.val) {
                    if(temp.right == null) {
                        temp.right = newNode ;
                        break;
                    }else{
                        temp = temp.right ;
                    }
            
                }else{// value nhỏ hơn temp
                    if(temp.left == null){
                        temp.left = newNode ;
                        break;
                    }else{
                        temp = temp.left ;
                    }
                }
            }
            return root ;
        }       
    }


    // insertIntoBST : thêm value vào rootNode tree
    public TreeNode insertIntoBST(TreeNode rootNode , int value) {
        if(rootNode == null) {
            return new TreeNode(value);        
        }
        if( value < rootNode.val) {
            if(rootNode.left == null){
                rootNode.left = new TreeNode(value);
            }else{
                insertIntoBST(rootNode.left , value) ;
            }
        }else{
            if(rootNode.right == null){
                rootNode.right = new TreeNode(value);
            }else{
                insertIntoBST(rootNode.right , value) ;
            }
        }
        return rootNode;
    }
    

    // Xóa node key trong cây root node
    //Return : cây mới đã được xóa node key
    public TreeNode deleteNode(TreeNode root , int key) {
        if(root == null) 
            return null;
        
        // B1 : Tìm nút cần xóa
        if(key < root.val){
            root.left = deleteNode(root.left,key);
        }else if(key > root.val){
            root.right = deleteNode(root.right,key);
        }else{ // root.val = key => xóa root; Xác định được nút cần xáo
        // B2 : Xóa node rootNode
            // TH1 : root là nốt Lá
            if(root.left == null && root.right == null)
            return null;

            // TH2 : Chỉ có 1 con bên trái
            if(root.left != null && root.right == null)
            return root.left;
            // TH2 : Chỉ có 1 con bên phải
            if(root.left == null && root.right != null)
            return root.right;

            //TH3 : Tồn tại 2 node con
            // Tìm node trái cùng của cây con bên phải
            TreeNode leftModeNode = findLeftModeNode(root.right);
            root.val = leftModeNode.val;
            root.right = deleteNode(root.right , leftModeNode.val);
        }
        return root;
    }


    // Tìm cây con trái cùng của root
    public TreeNode findLeftModeNode(TreeNode root) {
        if( root == null) return null;
        TreeNode leftMostNode = root ;
        while(leftMostNode != null)
            leftMostNode = leftMostNode.left;
        return leftMostNode;
    }


    //Tìm kiếm trên cây BST
    public TreeNode searchBST(TreeNode root , int key) {
        if(root == null) 
            return null;
        if(key < root.val){
            return searchBST(root.left, key);
        }else if(key > root.val){
            return searchBST(root.right, key);
        }else{
            //root.val = key;
            return root;
        }
    }


    //Duyệt cây theo thứ tự Node - L - R
    public static void PreOder(TreeNode currentNode) {
        if(currentNode == null)
        return ;

        //Duyệt currentNode trước
        System.out.print(currentNode.val+" ");

        //Duyệt bên trái | Duyệt bên phải
        PreOder(currentNode.left) ;
        PreOder(currentNode.right) ;
    }
    //144 Leetcode
    List<Integer> duyetOrder = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null)
        return duyetOrder;

        //Duyệt currentNode trước
        //System.out.print(currentNode.val+" ");
        duyetOrder.add(root.val);

        //Duyệt bên trái | Duyệt bên phải
        preorderTraversal(root.left) ;
        preorderTraversal(root.right) ;
        return duyetOrder ;
    }


    //Duyệt cây theo thứ tự L - Node - R
    public static void InOder(TreeNode currentNode) {
        if(currentNode == null)
        return ;

        //Duyệt bên trái | Duyệt bên phải
        InOder(currentNode.left) ;
        
        //Duyệt currentNode trước
        System.out.print(currentNode.val+" ");

        InOder(currentNode.right) ;
    }
    //94 Leetcode
    List<Integer> inOrder = new ArrayList<>();
    public List<Integer> InorderTraversal(TreeNode root) {
        if(root == null)
        return inOrder;

        //Duyệt currentNode trước
        //System.out.print(currentNode.val+" ");
        inOrder.add(root.val);

        //Duyệt bên trái | Duyệt bên phải
        InorderTraversal(root.left) ;
        InorderTraversal(root.right) ;
        return inOrder ;
    }



    //Duyệt cây theo thứ tự L - R - Node 
    public static void PostOder(TreeNode currentNode) {
        if(currentNode == null)
        return ;

        //Duyệt bên trái | Duyệt bên phải
        PostOder(currentNode.left) ;
        PostOder(currentNode.right) ;

        //Duyệt currentNode trước
        System.out.print(currentNode.val+" ");
    }
    //145 Leetcode
    List<Integer> postOrder = new ArrayList<>();
    public List<Integer> PostorderTraversal(TreeNode root) {
        if(root == null)
        return postOrder;

        //Duyệt currentNode trước
        //System.out.print(currentNode.val+" ");
        postOrder.add(root.val);

        //Duyệt bên trái | Duyệt bên phải
        PostorderTraversal(root.left) ;
        PostorderTraversal(root.right) ;
        return postOrder ;
    }
    
    
}
