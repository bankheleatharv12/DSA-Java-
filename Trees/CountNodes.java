import java.util.*;
class TreeNode{

    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data=data;
        left=right=null;
    }

}

public class CountNodes {
    int index=-1;

    TreeNode constructBT(int nodeArr[]){
        index++;

        if(nodeArr[index]==-1){
            return null;
        }

        TreeNode newNode=new TreeNode(nodeArr[index]);
        newNode.left=constructBT(nodeArr);
        newNode.right=constructBT(nodeArr);

        return newNode;
          
    }

    int countNodes(TreeNode root){

        if(root==null){
            return 0;
        }

        int leftSTNodes=countNodes(root.left);
        int rightSTNodes=countNodes(root.right);

        return leftSTNodes + rightSTNodes +1;
    }

    public static void main(String[] args){
        
        
        int nodeArr[]=new int[]{1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        CountNodes cn=new CountNodes();
        TreeNode root=cn.constructBT(nodeArr);

        int count=cn.countNodes(root);
        System.out.println("Total Nodes: "+count);
        

    }
    
    
}
