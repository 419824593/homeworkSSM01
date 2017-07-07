package domain;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/30.
 */
public class ArrayStack implements StackATD{
    private Object[] contents;
    private int top;
    private static int SIZE=10;
    public ArrayStack(){
        contents=new Object[SIZE];
        top=0;
    }
    public void expand(){
        Object[] larger=new Object[size()*2];
        for (int index=0;index<top;index++){
            larger[index]=contents[index];
            contents=larger;
        }
    }
    public int size(){
        return top;
    }
    public boolean isEmpty(){
        return (size()==0);
    }
    public void push(Object element){
        if(top==contents.length){
            expand();
            contents[top]=element;
            top++;
        }
    }
    public Object pop(){
        if(isEmpty()){
            System.out.println("栈为空");
            System.exit(1);
        }
        Object result=contents[top-1];
        contents[top-1]=null;//出栈
        top--;
        return result;
    }

    public Object peek(){
        Object result;
        if (isEmpty())
            result=null;
        else
            result=contents[top-1];
        return result;
    }

    public static void main(String[] args) {
        ArrayStack stack=new ArrayStack();
        System.out.println("将0-24一次压栈，然后连续10次出栈");
        for(int i=0;i<25;i++)
            stack.push(i);
        for(int i=0;i<10;i++){
            stack.pop();
            System.out.println("栈的大小："+stack.size());
            System.out.println("栈为空吗？："+stack.isEmpty());
            System.out.println("栈顶元素为："+stack.peek());
        }
    }
}
