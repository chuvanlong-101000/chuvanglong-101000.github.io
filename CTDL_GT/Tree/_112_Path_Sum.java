package Tree;

public class _112_Path_Sum {
    public boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    public boolean duyet(TreeNode curNode , int curSum , int targetSum) {
        // B1: Điều kiện dừng || Bài toán cơ sở
        if(curNode == null) return false;

        curSum += curNode.val ;

        if(isLeaf(curNode)){
            return curSum == targetSum ;
        }
        // 
        boolean kqBenTrai = duyet(curNode.left, curSum, targetSum);
        boolean kqBenPhai = duyet(curNode.right, curSum, targetSum);

        return kqBenTrai || kqBenPhai;
    }

    public boolean hasPathSum(TreeNode root , int targetSum) {
        return duyet(root, 0, targetSum) ;
    }
}
