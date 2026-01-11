package h1;

public class H1_main {

	public static void main(String[] args) {
		Node e = new Node(null);
		Node d = new Node(e);
		Node c = new Node(d);
		Node b = new Node(c);
		Node a = new Node(b);

		System.out.println("Abstand von a, d: " + distance(a, d));

		System.out.println("Abstand von a, b: " + distance(a, b));
		System.out.println("Abstand von b, b: " + distance(b, b));
		System.out.println("Abstand von a, e: " + distance(a, e));
		System.out.println("Abstand von c, e: " + distance(c, e));
	}

	public static int distance(Node x, Node y) {
		if (x == y)
			return 0;

		return 1 + distance(x.getNext(), y);
	}
}
