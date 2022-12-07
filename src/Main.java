public class Main {
    public static void main(String[] args) {

        FixedStack<Integer> stack = new FixedStack<>(Integer.class, 5);
        stack.pop();
        stack.show();

        stack.pop();
        System.out.println();
        stack.show();

    }
}