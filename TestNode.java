public class TestNode {
    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node temp = n3;

        Node[] nodes = {n1, n2, n3, n4, n5};

        System.out.println("Before");

        for (int i = 0; i < nodes.length; i++) {
            System.out.println("n" + (i + 1) + " = " + nodes[i]);
            System.out.println("next of n" + (i + 1) + " null");
        }

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n5.setNext(temp);   

        System.out.println("\nAfter");

        for (int i = 0; i < nodes.length; i++) {
            System.out.println(
                "next of n" + (i + 1) + " = " + nodes[i].getNext()
            );
        }
    }
}
