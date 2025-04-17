// Define the Node class
class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
       this.data=data;
       this.left=null;
       this.right=null;
    }
}
class BinarySearchTree{
    Node root;
  public void insert(int data){
      Node newNode=new
  Node(data);
   if (root==null){
       root=newNode;
   } else {
   insertRecursive(root,newnode);
   }
}
private void
insertRecursive(node currentNode,Node newNode){
   if (newNode.data<currentNode.data){
      if (currentNode.left==null){
          currentNode.left=newNode;
      } else {
insertRecursive (currentNode.left,newNode);
      }
}
   if (currentNode.right==null){
       currentNode.right=newNode;
   } else {
insertRecursive (current.right,newNode);
       }
    }
}
public void delete (int data){
    root=deleteRecursive (root,data);
private Node
deleteRecursive(Node node,int data){
      if (node==null){
          return node;
       if(data< node.data){
          node.left=deleteRecursive(node.left,data);
       }
       else if (data>node.data){
            node.right=delete Recursive (node.right,data);
            }
            else{
            if (node.left==null&& node.right==null){
                return null;
            }
            if (node.left==null){
                return node.right;
            }
            if (node.right==null){
                return node.left;
            }
            Node temp= findMin(node.right);
            Node.data= temp.data;
            node.right=
delete Recursive(node.right,temp.data);
                }
                return node;
             }
             private Node find Min(Node node)
             {
             while (node.left!=null){
                 node=node.left;
              }
              return node;
        }
        public void in order Traversal()
        {
        in order Traversal Recursive(root)
        }
private void inorder Traversal Recursive(Node node){
         if (node!=null){
            Inorder Traversal Recursive (node.left);
System.out.print(node.data+" "); 
            Inorder Traversal Recursive (node.right);
           }
        }
}
public class Main{
     public static void main (String[] args){
          BinarySearchTree bst= new BinarySearchTree
          bst.inser(50);
          bst.insert(30);
          bst.insert(20);
          bst.insert(40);
          bst.insert(70); 
          bst.insert(60);
          bst.insert(80);
System.out.println("In-order traversal before deletion:");
          bst.inorderTraversal();

          bst.delete(30);
System.out.println("\n In-order traversal after deletion:");
          bst.inorderTraversal();
     }
}





          
          
            
            
              



            

        
  












   

