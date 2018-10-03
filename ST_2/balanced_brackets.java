import java.util.*;
import java.lang.*;

class stack {
    protected char arr[];
    protected int top, size;
    public stack(int n) {
        size = n;
        top = -1;
        arr = new char[size];
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == size-1;
    }
    public char peek () {
        if (isEmpty()) {
            throw new NoSuchElementException("Underflow Exception");
        } else {
            return arr[top];
        }
    }
    public void push (char x) {
        if (isFull()) {
            System.out.println("OVERFLOW");
        } else {
            arr[++top] = x;
        }
    }
    public char pop () {
        if (isEmpty()) {
            throw new NoSuchElementException("Underflow Exception");
        } else {
            return arr[top--];
        }
    }
    public void display () {
        System.out.print("Stack: ");
        if (isEmpty()) {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = top; i >= 0; i--)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}

public class balanced_brackets {

    public static boolean isMatch (char x, char y) {
        if (x=='(' && y==')') return true;
        else if (x=='{' && y=='}') return true;
        else if (x=='[' && y==']') return true;
        else return false;
    }

    public static boolean check_balance(String x) {
        char arr[] = x.toCharArray();
        stack s = new stack(arr.length);
        int flag = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]=='{' || arr[i]=='(' || arr[i]=='[') {
                s.push(arr[i]);
            }
            if (arr[i]=='}' || arr[i]==')' || arr[i]==']') {
                if (s.isEmpty() == true) flag = 1;
                else if (!isMatch(s.pop(), arr[i])) flag = 1;
            }
            if (flag == 1) {
                System.out.print(arr[i] + " break\n");
                break;
            }
        }
        if (flag == 1) return false;
        else if (s.isEmpty() == false) return false;
        else return true;
    }
    public static void main(String[] args) {
        String x = args[0];
        System.out.print("Balaced: " + check_balance(x) + "\n");
    }
}