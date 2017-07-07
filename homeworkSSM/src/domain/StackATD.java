package domain;

/**
 * Created by Administrator on 2017/6/30.
 */
public interface StackATD {
    public void push(Object element);//压栈
    public Object pop();//出栈
    public boolean isEmpty();
    public int size();
    public Object peek();//返回栈顶对象的一个引用；
    public String toString();

}
