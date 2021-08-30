package Tree;

public class _104_Maximum_Depth_of_Binary_Tree {
    public int maxDepth(TreeNode root) {
        //B1:Bài toán cơ sở bên
        if(root == null) 
            return 0;
        
        //B2: Công thức đệ quy
        int ChieuCaoCayBenTrai = maxDepth(root.left);
        int ChieuCaoCayBenPhai = maxDepth(root.right);

        int result = Math.max(ChieuCaoCayBenTrai, ChieuCaoCayBenPhai) +1;
        return result ;
    }
}


