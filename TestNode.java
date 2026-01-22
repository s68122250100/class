public class TestNode {
    public static void main(String[] args) {
        System.out.println("number of Objeccs = "+Node.getcount());
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        System.out.println("Before ");
        System.out.println("n1 = " + n1);
        System.out.println("next of n1 " + n1.getNext());
        System.out.println("n2 = " + n2);
        System.out.println("next of n2 " + n2.getNext());
        System.out.println("n3 = " + n3);
        System.out.println("next of n3 " + n3.getNext());
        System.out.println("n4 = " + n4);
        System.out.println("next of n4 " + n4.getNext());
        System.out.println("After ");
        System.out.println("number of Objects = "+Node.getcount());
        n1.setNext(n2);
        System.out.println("next of n1 = " + n1.getNext());
        System.out.println("next of n2 = " + n2.getNext());
        System.out.println("next of n3 = " + n3.getNext());
        System.out.println("next of n4 = " + n4.getNext());
        System.out.println("next of n5 = " + n5.getNext());
        n2.setNext(n3);
        n3.setNext(n4);
        Node n5 = new Node(5);
        Node temp;
        n2.setNext(n5);
    }
}