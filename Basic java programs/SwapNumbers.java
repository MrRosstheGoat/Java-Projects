public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b = 10, temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a was 5");
        System.out.println("b was 10");
        System.out.println("Now : a = " + a + ", b = " + b);
    }
}