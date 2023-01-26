import java.util.ArrayDeque;

public class vikas34 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>(3);
        ad.add(34);
        ad.add(1234);
        ad.add(12345);
        System.out.println(ad.size());
        System.out.println(ad.peek());// Gets the first element by default
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());
        System.out.println(ad.poll());// Removes the 1st element in from the deque by default
        System.out.println(ad.pollLast());
        System.out.println(ad.pollFirst());
    }
}
