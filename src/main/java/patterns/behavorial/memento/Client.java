package patterns.behavorial.memento;

public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator("Original");
        Caretaker caretaker = new Caretaker(originator);

        caretaker.backup();
        originator.doSomething();

        caretaker.backup();
        originator.doSomething();

        caretaker.backup();
        originator.doSomething();

        System.out.println();
        caretaker.showHistory();

        System.out.println("\nClient: Now, let's rollback!\n");
        caretaker.undo();

        System.out.println("\n\nClient: Once more!\n");
        caretaker.undo();

        System.out.println();
	}
}
