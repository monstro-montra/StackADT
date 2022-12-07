public class Main {
    public static void main(String[] args) {

        FixedStack<Integer> stack = new FixedStack<>(Integer.class, 5);
        stack.push(5);
        stack.push(6);
        stack.push(78);
        stack.push(9);
        stack.push(6);
        stack.show();



        stack.clear();
        System.out.println();
        stack.show();


    }
}