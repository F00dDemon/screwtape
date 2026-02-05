import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> values = List.of(5, 7, 3);
        Node head = new Node(values);

        System.out.println("     : " + head.value);
    }
}
