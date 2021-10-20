package Pile;

import java.util.EmptyStackException;

public class Stack {
    private Object tab[];
    private int size;
    private int top;

    public Stack(){
        this.size = Integer.MAX_VALUE;
        this.tab = new Object[this.size];
    }

    public Stack(int _size){
        this.size = _size;
        this.tab = new Object[this.size];
    }

    public void push(Object o){
        if(!isFull()){
            if(isNotEmpty()){
                this.top += 1;
            }
            this.tab[this.top] = o;
        }else{
            throw new FullStackException();
        }
    }

    public Object pull(){
        if(isNotEmpty()){
            Object o = this.tab[this.top];
            this.tab[this.top] = null;
            this.top -= 1;
            return o;
        }else{
            throw new EmptyStackException();
        }
    }

    public boolean isNotEmpty(){
        return this.tab[0] != null;
    }

    public boolean isFull(){
        return this.top == this.size - 1;
    }

    private static class FullStackException extends RuntimeException {}
}
