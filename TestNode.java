public class TestNode {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        System.out.println("Before ");
        System.out.println("n1 = " + n1);
        System.out.println("next of n1 " + n1.getNext());
        System.out.println("n2 = " + n2);
        System.out.println("next of n2 " + n2.getNext());
        System.out.println("After ");
        n1.setNext(n2);
        System.out.println("next of n1 = " + n1.getNext());
        System.out.println("next of n2 = " + n2.getNext());
    }
}