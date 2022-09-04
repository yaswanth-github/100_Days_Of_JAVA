package Stack;

import java.util.Scanner;

/**
 *
 * @author SNEHA
 *
 * */
public class Stack1{
    static Scanner sc =new Scanner(System.in);
    static int stack[],top=-1,size;
    static{
        Stack1.create();
    }

    public static void main(String[] args){
        int ch,item;
        while(true){

            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Traverse");
            System.out.println("5.Quit");

            System.out.print("Enter the choice:");
            ch=Stack1.sc.nextInt();

            switch(ch){
                case 1:System.out.print("Enter element:");
                    item=sc.nextInt();
                    Stack1.push(item);
                    break;
                case 2:item=Stack1.pop();
                    if(item==0){
                        System.out.println("underflow");
                    }
                    else
                    {
                        System.out.println("Popped Item:"+item);
                    }
                    break;
                case 3:item=Stack1.peek();
                    if(item==0){
                        System.out.println("underflow");
                    }
                    else
                    {
                        System.out.println("Peek Item:"+item);
                    }
                    break;
                case 4:Stack1.traverse();
                    break;
                case 5:System.exit(1);
                default: System.out.println("Invalid Choice \n") ;


            }

        }
    }
    static void create(){
        int size;
        System.out.print("Enter the size of stack:");
        size=Stack1.sc.nextInt();
        Stack1.stack=new int[size];
        System.out.println("Stack created with size:"+size);
    }
    static void push(int item)
    {
        if(Stack1.isFull())
        {
            System.out.println("Stack is overflow");
        }
        else
        {
            stack[++top]=item;
        }
    }
    static boolean isFull()
    {
        if(top==size-1)
        {
            return true;
        }
        else
        {
            return false;

        }
    }
    static int pop(){
        if(Stack1.isEmpty())
        {
            return 0;
        }
        else
        {
            return stack[top--];
        }
    }
    static int peek(){
        if(Stack1.isEmpty())
        {
            return 0;
        }
        else
        {
            return stack[top];
        }
    }
    static boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else
        {
            return false;
        }
    }
    static void traverse(){
        if(Stack1.isEmpty())
        {
            System.out.println("Stack Empty");
        }
        else
        {
            System.out.println("Elements:");
            for(int i=top;i>=0;i--)
            {
                System.out.println(stack[i]);
            }
        }

    }
}