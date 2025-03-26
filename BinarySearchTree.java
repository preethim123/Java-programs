class Node {
   int data;
   Node left;
   Node right;
   Node(int data){
     this.data=data;
     this.left=null;
     this.right=null;
   }
}
public class BinarySearchTree {
  Node root;
  void delete(int data){
       root=deleteNode(root,data);
  }
  Node deleteNode(Node currentNode,int data){
       if(currentNode==null){
             return currentNode;
       }
       if(data<currentNode.data){
              currentNode.left=deleteNode(currentNode.left,data);
       }else if(data>currentNode.data){
           currentNode.right=deleteNode(currentNode.right,data);
       }else{
              if(currentnode.left==null){
                 return currentNode.right;
       }else if(currentNode.right==null){
           return currentNode.left;
       }
}
return currentNode;
}
void printTree(){
   printTree (root);
}
void printTree(Node node){
   if(node!=null){
      printTree(node.left);
      System.out.print(node.data+"");
      printTree(node.right);
   }
}
public static void main(String[]args){
  BinarySearchTree bst=newBinarySearchTree();
  bst.root= newNode(50);
  bst.root.left= newNode(30);
  bst.root.right= newNode(70);
  bst.root.right= newNode(20);
  bst.root.left= newNode(40);
  System.out.println("Before deletion:");
  bst.printTree();
  bst.delete(70);
  System.out.println("After deletion:");
  bst.printTree();
  }
}
  

                  
