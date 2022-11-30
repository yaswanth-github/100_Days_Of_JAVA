package Binary_tree;
class Node
{
    int data;
    Node left, right;
    Node(int key){
        data=key;
        left=right=null;
        System.out.println(data);
    }
}
public class binary_tree {
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.right=new Node(4);
        tree.root.left.right.left=new Node(5);
        tree.root.right.left=new Node(6);
        System.out.println(tree);
    }


    static class BinaryTree{
        Node root;
        BinaryTree(){
            root=null;
        }
        BinaryTree(int key){
            root=new Node(key);
        }

        void preOrder(Node newNode){
            if(newNode == null){
                return;
            }
            System.out.println(newNode.data);
            preOrder(newNode.left);
            preOrder(newNode.right);
        }
    }
}
