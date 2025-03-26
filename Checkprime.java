import java.util.Scanner;
public class CheckPrime{
       public static void main(String[] args){
       Scanner.scanner=new Scanner (System.in);
 
       System.out.print("enter a number:");
     int num=Scanner.nextInt();
       Boolean is;prime=true;
       if (num<=1){
       Boolean is;prime=false;
       } else {
       for(int i=2; i<=num/2; i++){
       if (num%i==0){
       is prime=false;
       break;
       }
     }
}
     if(isprime){
        System.out.println(num+"is a prime number:");
        } else {
        System.out.print(num="is not a prime number:");
}
}    
}