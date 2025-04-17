class StackNode{
    int data;
    StackNode next;
    Stack Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Stack{
    private StackNode top;
    public Stack(){
         this.top=null;
    }
    public void push(int data){
         StackNode newNode= new StackNode(data);
         if(top==null){
            top=newNode;
         } else {
              newNode.next=top;
              top=newNode;
         }
         System.out.println(data+" pushed to stack");
         }
         public int pop(){
              if (isEmpty()){
              System.out.println("Stack underflow");
                 return-1;
                 }
                 int poppeddata= top.data;
                 top=top.next;
                 return poppeddata;
              }
              public int peek(){
                   if (isEmpty()){
                   System.out.println("Stack is empty");
                      return-1;
                      }
                      return top.data;
                   }
                   public Boolean isEmpty(){
                        return top==null;
                   }
                   }
                   public void display(){
                        if (isEmpty()){
                   System.out.println(" Stack is Empty");
                        return ;
                        }
                        StackNode.current=top;
                        System.out.print("Stack elements:");
                        While (current!=null)
                        {
                        System.out.print(current.data + " ");
                             current=current.next;
                             }
                             System.out.println();
                             }
                             }
                             public usinglinkedlist{
                                    public static void main(String [] args){
                                    Stack stack = new stack();
                                        Stack.push(10);
                                        Stack.push(20);
                                        Stack.push(30);
                                        Stack.display();
                                        System.out.println("Top element is :"+stack.peek());
                                        System.out.println("Top element is:"+ stack.peek());
                                        System.out.println(Stack.pop()+" popped from stack");
                                        Stack.display();
                                        }
}

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            