public class Task3 {
    public static void main(String[] args) {
        
    }
    public class Task3 {
        public static void main(String[] args) {
    
        }
    
        public boolean isSymmetric(TreeNode root) {
            if (root == null)
                return true;
            if (root.left != null && root.right != null) {
                if (root.left.val != root.right.val)
                    return false;
            }
            return isSymmetric(root.left, root.right);
        }
    
        private boolean isSymmetric(TreeNode t1, TreeNode t2) {
            if (t1 == null && t2 == null)
                return true;
            if (t1 == null || t2 == null)
                return false;
            boolean isLeftSymmetric = isSymmetric(t1.left, t2.right);
            boolean isRightSymmetric = isSymmetric(t1.right, t2.left);
            return (t1.val == t2.val) && isLeftSymmetric && isRightSymmetric;
        }
    }
}
