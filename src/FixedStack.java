import java.lang.reflect.Array;

public class FixedStack<T> implements Stack<T>{
    private final T[] stack;
    private int top = 0;

    //constructor
    public FixedStack(Class<T>  tClass, int capacity){
        @SuppressWarnings("unchecked")
        final T[] s = (T[]) Array.newInstance(tClass, capacity);
        this.stack = s;
    }

    @Override
    public void push(T newEntry) { //add element from top of the list

        try{
            if (top < stack.length){
                stack[top] = newEntry;
                System.out.println("Adding element: " + newEntry);
                top++; //increment top value so that when user pushes to stack again, it will be at stack[1], stack[2], stack[3], etc.
            } else {
                throw new ArrayIndexOutOfBoundsException("Out of bounds! Cannot add any elements.");
            }
        } catch (ArrayIndexOutOfBoundsException er){
            System.out.println(er.getMessage());
        }


    }

    @Override
    public void pop() { //remove element from top of the list

        try{
            if(stack[0] == null){
                throw new ArrayIndexOutOfBoundsException("Out of bounds! Cannot remove any elements.");
            } else{
                T data; //used to store generic type
                top--; //decrement top because we are going to delete an element
                data = stack[top]; //data is = to stack[top]
                System.out.println("Removing element at the top of stack: " + data);
                stack[top] = null; //stack @ top is null.
            }

        } catch (ArrayIndexOutOfBoundsException er){
            System.out.println(er.getMessage());
        }
    }

    @Override
    public T peek() {
        return stack[top];
    }

    @Override
    public boolean isEmpty() {
        return stack[top] == null;
    }

    @Override
    public void clear() {
        for (T ignored : stack){
            pop();
        }
    }

    @Override
    public void show() {
        int count = 0;
        for(T n: stack){
            System.out.println ("Element " + count + ": " + n);
            count++;
        }
    }
}
