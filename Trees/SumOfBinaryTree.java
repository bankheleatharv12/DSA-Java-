import java.util.Queue;
import java.util.LinkedList;
class TreeNode{

    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data=data;
        left=right=null;
    }

}

public class SumOfBinaryTree {
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

    void levelOrder(TreeNode root){

        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        que.add(null);

        while(!que.isEmpty()){

            TreeNode tempNode=que.remove();

            if(tempNode==null){
               System.out.println();

               if(que.isEmpty()){
                    break;
               }else{
                que.add(null);
               }
            }else{
                System.out.print(tempNode.data+ " ");
                if(tempNode.left!=null){
                    que.add(tempNode.left);
                }
                if(tempNode.right!=null){
                    que.add(tempNode.right);
                }
            
            }
        }
    }


    int sumOfBT(TreeNode root){

        if(root==null){
            return 0;
        }
    
        int sumOfLST =sumOfBT(root.left);
        int sumOfRST =sumOfBT(root.right);

        return sumOfLST+ sumOfRST+ root.data;
    }

    int heightOfBT(TreeNode root){

        if(root==null){
            return 0;
        }

        int LSTHeight= heightOfBT(root.left);
        int RSTHeight= heightOfBT(root.right);

        int treeHeight
    }
    

    public static void main(String[] args){
        
        
        int nodeArr[]=new int[]{1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        SumOfBinaryTree cn=new SumOfBinaryTree();
        TreeNode root=cn.constructBT(nodeArr);

        cn.levelOrder(root);
        System.out.println();

        System.out.println("Sum of BT: "+cn.sumOfBT(root));

        System.out.println("Sum of BT: "+cn.heightOfBT(root));
        

    }
    
    
}